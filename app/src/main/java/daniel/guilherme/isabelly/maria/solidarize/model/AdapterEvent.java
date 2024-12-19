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

public class AdapterEvent extends RecyclerView.Adapter<AdapterEvent.EventViewHolder> {

    private List<Evento> eventList;
    private EventsFragment eventsFragment;

    public AdapterEvent(List<Evento> eventList, EventsFragment eventsFragment) {
        this.eventList = eventList;
        this.eventsFragment = eventsFragment;
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.evento_item, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Evento event = eventList.get(position);

        TextView tvname = holder.itemView.findViewById(R.id.organizerNameTextView);
        tvname.setText(event.nomeIntituicao);

        Chip categoria = holder.itemView.findViewById(R.id.categoryChipInst1);
        categoria.setText(event.categoria);

        TextView tvorganizador = holder.itemView.findViewById(R.id.organizerRoleTextView);
        tvorganizador.setText(event.organizador);

        TextView tvtitulo = holder.itemView.findViewById(R.id.eventNameTextView);
        tvtitulo.setText(event.titulo);

        TextView tvdesc = holder.itemView.findViewById(R.id.eventDescriptionTextView);
        tvdesc.setText(event.descricao);

        TextView tvData = holder.itemView.findViewById(R.id.dateTimeTextView);
        tvData.setText(event.data.toString());

        ImageView imagem = holder.itemView.findViewById(R.id.eventImageView);
        imagem.setImageResource(R.drawable.inst1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventsFragment.navegarParaDetalhesEvento();
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}

