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

import org.w3c.dom.Text;

import java.util.List;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.activities.EventoActivity;
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

        String imageName = "fundo" + (position + 2);  // Adiciona 1 ao position, já que normalmente as imagens começam com 1
        int imageResId = holder.itemView.getContext().getResources().getIdentifier(imageName, "drawable", holder.itemView.getContext().getPackageName());

        String imageNameInst = "pfp" + (position + 2);  // Adiciona 1 ao position, já que normalmente as imagens começam com 1
        int imageResIdInst = holder.itemView.getContext().getResources().getIdentifier(imageNameInst, "drawable", holder.itemView.getContext().getPackageName());


        TextView tvname = holder.itemView.findViewById(R.id.organizerNameTextView);
        tvname.setText(event.nomeIntituicao);

        Chip categoria = holder.itemView.findViewById(R.id.categoryChipEvent1);
        categoria.setText(event.categoria);

        TextView tvorganizador = holder.itemView.findViewById(R.id.organizerRoleTextView);
        tvorganizador.setText(event.organizador);

        TextView tvtitulo = holder.itemView.findViewById(R.id.eventNameTextView);
        tvtitulo.setText(event.titulo);

        TextView tvdesc = holder.itemView.findViewById(R.id.eventDescriptionTextView);
        tvdesc.setText(event.descricao);

        TextView tvData = holder.itemView.findViewById(R.id.dateTimeTextView);
        tvData.setText(event.data.toString());

        ImageView imagemInst = holder.itemView.findViewById(R.id.organizerImageView);
        imagemInst.setImageResource(imageResIdInst);

        ImageView imagemEvento = holder.itemView.findViewById(R.id.eventImageView);
        imagemEvento.setImageResource(imageResId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), EventoActivity.class);
                intent.putExtra("EVENTO_NOME", event.titulo); // Passe qualquer dado necessário
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}

