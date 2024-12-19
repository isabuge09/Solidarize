package daniel.guilherme.isabelly.maria.solidarize.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.activities.EventoActivity;
import daniel.guilherme.isabelly.maria.solidarize.activities.HomeActivity;
import daniel.guilherme.isabelly.maria.solidarize.activities.MainActivity;
import daniel.guilherme.isabelly.maria.solidarize.model.AdapterEvent;
import daniel.guilherme.isabelly.maria.solidarize.model.HomeActivityViewModel;
import daniel.guilherme.isabelly.maria.solidarize.model.Evento;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private static final String TAG = "EventsFragment";

    public EventsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment EventsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventsFragment newInstance() {
        EventsFragment fragment = new EventsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView chamado");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated chamado");

        HomeActivityViewModel mViewModel = new ViewModelProvider(getActivity()).get(HomeActivityViewModel.class);

        List<Evento> eventos = mViewModel.getEventos();

        if (eventos == null || eventos.isEmpty()) {
            Log.e(TAG, "Lista de eventos nula ou vazia");
            return;
        }

        Log.d(TAG, "Numeros de eventos: " + eventos.size());

        AdapterEvent adapterEvent = new AdapterEvent(eventos, this);

        RecyclerView rvEventos = view.findViewById(R.id.rvEvent);
        if (rvEventos == null) {
            Log.e(TAG, "Lista(RecyclerView) não encontrada");
            return;
        }

        rvEventos.setAdapter(adapterEvent);
        rvEventos.setLayoutManager(new LinearLayoutManager(getContext()));
        Log.d(TAG, "Lista(RecyclerView) setup complete");
    }

    public void navegarParaDetalhesEvento(){
        try {
            if (getActivity() != null) {
                Intent i = new Intent(getActivity(), EventoActivity.class);
                startActivity(i);
            } else {
                Log.e(TAG, "Tela é nula quando tenta navigar");
            }
        } catch (Exception e) {
            Log.e(TAG, "Erro na navegação entre telas", e);
        }
    }
}

