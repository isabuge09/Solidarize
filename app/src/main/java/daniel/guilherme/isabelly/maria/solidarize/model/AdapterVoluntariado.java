package daniel.guilherme.isabelly.maria.solidarize.model;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.activities.VoluntariadoActivity;
import daniel.guilherme.isabelly.maria.solidarize.fragments.VoluntariadoFragment;

public class AdapterVoluntariado extends RecyclerView.Adapter<AdapterVoluntariado.VoluntariadoViewHolder> {

    private List<Voluntariado> voluntariadoList;

    private VoluntariadoFragment voluntariadofragment;

    public AdapterVoluntariado(List<Voluntariado> voluntariadoList, VoluntariadoFragment voluntariadofragment) {
      this.voluntariadoList = voluntariadoList;
      this.voluntariadofragment = voluntariadofragment;
    }

    public static class VoluntariadoViewHolder extends RecyclerView.ViewHolder {
        public VoluntariadoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public AdapterVoluntariado.VoluntariadoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.voluntario_item, parent, false);
        return new AdapterVoluntariado.VoluntariadoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVoluntariado.VoluntariadoViewHolder holder, int position) {
        Voluntariado voluntariado = voluntariadoList.get(position);

        String imageName = "fundo" + (position + 1);  // Adiciona 1 ao position, já que normalmente as imagens começam com 1
        int imageResId = holder.itemView.getContext().getResources().getIdentifier(imageName, "drawable", holder.itemView.getContext().getPackageName());

        TextView tvtitulo = holder.itemView.findViewById(R.id.eventNameTextView);
        tvtitulo.setText(voluntariado.titulo);

        TextView tvdescricao = holder.itemView.findViewById(R.id.eventDescriptionTextView);
        tvdescricao.setText(voluntariado.descricao);

        TextView tvcargaH = holder.itemView.findViewById(R.id.workloadTextView);
        tvcargaH.setText(voluntariado.cargaH);

        ImageView ivcapa = holder.itemView.findViewById(R.id.eventImageView);
        ivcapa.setImageResource(imageResId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), VoluntariadoActivity.class);
                intent.putExtra("INSTITUICAO_ID", voluntariado.titulo); // Passe qualquer dado necessário
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return voluntariadoList.size();
    }

}
