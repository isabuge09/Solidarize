package daniel.guilherme.isabelly.maria.solidarize.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.activities.EditarPerfilActivity;
import daniel.guilherme.isabelly.maria.solidarize.activities.EventoActivity;
import daniel.guilherme.isabelly.maria.solidarize.model.AdapterPerfilColaboracao;
import daniel.guilherme.isabelly.maria.solidarize.model.AdapterVoluntariado;
import daniel.guilherme.isabelly.maria.solidarize.model.HomeActivityViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        HomeActivityViewModel mViewModel = new ViewModelProvider(getActivity()).get(HomeActivityViewModel.class);

        AdapterPerfilColaboracao adaptercolaboracao = new AdapterPerfilColaboracao(mViewModel.getColaboracoes(), PerfilFragment.this);

        RecyclerView rvColaboradores = view.findViewById(R.id.collaboratorRecyclerView);
        rvColaboradores.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rvColaboradores.setAdapter(adaptercolaboracao);

        ImageButton btneditar = view.findViewById(R.id.editProfileButton);
        btneditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EditarPerfilActivity.class);
                startActivity(intent);
            }
        });
    }


}