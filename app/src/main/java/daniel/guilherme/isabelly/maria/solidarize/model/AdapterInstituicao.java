package daniel.guilherme.isabelly.maria.solidarize.model;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;

import java.util.List;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.fragments.InstituicoesFragment;
import daniel.guilherme.isabelly.maria.solidarize.activities.IntituicaoActivity; // Importe sua Activity de destino

public class AdapterInstituicao extends RecyclerView.Adapter<AdapterInstituicao.InstituicaoViewHolder> {

    private List<Instituicao> instituicaoList;
    private InstituicoesFragment instituicaoFragment;

    public AdapterInstituicao(List<Instituicao> instituicaoList, InstituicoesFragment instituicaoFragment) {
        this.instituicaoList = instituicaoList;
        this.instituicaoFragment = instituicaoFragment;
    }

    public static class InstituicaoViewHolder extends RecyclerView.ViewHolder {
        public InstituicaoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public InstituicaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instituicao_item, parent, false);
        return new InstituicaoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InstituicaoViewHolder holder, int position) {
        Instituicao instituicao = instituicaoList.get(position);

        String imageName = "fundo" + (position + 1);  // Adiciona 1 ao position, já que normalmente as imagens começam com 1
        int imageResId = holder.itemView.getContext().getResources().getIdentifier(imageName, "drawable", holder.itemView.getContext().getPackageName());

        TextView tvname = holder.itemView.findViewById(R.id.institutionNameTextView);
        tvname.setText(instituicao.nome);

        Chip categoria = holder.itemView.findViewById(R.id.categoryChipInst1);
        categoria.setText(instituicao.categorias.get(0));

        TextView tvdesc = holder.itemView.findViewById(R.id.institutionDescriptionTextView);
        tvdesc.setText(instituicao.descricao);

        ImageView imagem = holder.itemView.findViewById(R.id.institutionImageView);
        imagem.setImageResource(imageResId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), IntituicaoActivity.class);
                intent.putExtra("INSTITUICAO_ID", instituicao.nome); // Passe qualquer dado necessário
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return instituicaoList.size();
    }
}
