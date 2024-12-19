package daniel.guilherme.isabelly.maria.solidarize.fragments;

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

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.model.AdapterEvent;
import daniel.guilherme.isabelly.maria.solidarize.model.AdapterVoluntariado;
import daniel.guilherme.isabelly.maria.solidarize.model.HomeActivityViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VoluntariadoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VoluntariadoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VoluntariadoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VoluntariadoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VoluntariadoFragment newInstance(String param1, String param2) {
        VoluntariadoFragment fragment = new VoluntariadoFragment();
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
        return inflater.inflate(R.layout.fragment_voluntario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        HomeActivityViewModel mViewModel = new ViewModelProvider(getActivity()).get(HomeActivityViewModel.class);

        AdapterVoluntariado adapterVoluntariado = new AdapterVoluntariado(mViewModel.getVoluntariados(), VoluntariadoFragment.this);

        RecyclerView rvVoluntariado = view.findViewById(R.id.rvVolunteer);
        rvVoluntariado.setAdapter(adapterVoluntariado);

        rvVoluntariado.setLayoutManager(new LinearLayoutManager(getContext()));

    }
}