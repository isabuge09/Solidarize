package daniel.guilherme.isabelly.maria.solidarize.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;

import org.w3c.dom.Text;

import java.util.List;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.fragments.EventsFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.InstituicoesFragment;

public class AdapterInstituicao extends RecyclerView.Adapter<AdapterInstituicao.EventViewHolder> {

    private List<Instituicao> instituicaoList;
    private InstituicoesFragment instituicaoFragment;

    public AdapterInstituicao(List<Instituicao> instituicaoList, InstituicoesFragment instituicaoFragment) {
        this.instituicaoList = instituicaoList;
        this.instituicaoFragment = instituicaoFragment;
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instituicao_item, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Instituicao instituicao = instituicaoList.get(position);

        TextView tvname = holder.itemView.findViewById(R.id.institutionNameTextView);
        tvname.setText(instituicao.nome);

        Chip categoria = holder.itemView.findViewById(R.id.categoryChip);
        categoria.setText((CharSequence) instituicao.categorias);

        TextView tvdesc = holder.itemView.findViewById(R.id.institutionDescriptionTextView);
        tvdesc.setText(instituicao.descricao);

        ImageView imagem = holder.itemView.findViewById(R.id.institutionImageView);
        imagem.setImageResource(R.drawable.inst1);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                instituicaoFragment.navegarParaDetalhesInstituicao();
            }
        });
    }

    @Override
    public int getItemCount() {
        return instituicaoList.size();
    }
}
