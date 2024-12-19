package daniel.guilherme.isabelly.maria.solidarize.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.fragments.PerfilFragment;

public class AdapterPerfilColaboracao extends RecyclerView.Adapter<AdapterPerfilColaboracao.ColaboradorViewHolder> {

    private List<PerfilColaboracao> colaboradoresList;

    private PerfilFragment perfilfragment;

    public AdapterPerfilColaboracao(List<PerfilColaboracao> colaboradoresList, PerfilFragment perfilfragment) {
        this.colaboradoresList = colaboradoresList;
        this.perfilfragment = perfilfragment;
    }

    public static class ColaboradorViewHolder extends RecyclerView.ViewHolder {
        public ColaboradorViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public AdapterPerfilColaboracao.ColaboradorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.colaborador_item, parent, false);
        return new AdapterPerfilColaboracao.ColaboradorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPerfilColaboracao.ColaboradorViewHolder holder, int position) {
        PerfilColaboracao colaborador = colaboradoresList.get(position);

        TextView tvtitulo = holder.itemView.findViewById(R.id.collaboratorName);
        tvtitulo.setText(colaborador.username);
    }

    @Override
    public int getItemCount() {
        return colaboradoresList.size();
    }

}
