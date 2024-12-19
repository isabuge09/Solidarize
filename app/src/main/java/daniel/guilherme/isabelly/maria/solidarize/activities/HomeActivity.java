package daniel.guilherme.isabelly.maria.solidarize.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.databinding.ActivityHomeBinding;
import daniel.guilherme.isabelly.maria.solidarize.fragments.EventsFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.InstituicoesFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.PerfilFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.VoluntariadoFragment;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    private ImageView userImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Inicializar ImageView da Toolbar
        View toolbar = findViewById(R.id.toolbar);
        userImageView = toolbar.findViewById(R.id.userImageView);

        // Configurar clique na imagem de perfil
        userImageView.setOnClickListener(v -> replaceFragment(new PerfilFragment()));

        replaceFragment(new EventsFragment());
        binding.bottomNavigationView.setBackground(null);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                replaceFragment(new EventsFragment());
            } else if (itemId == R.id.voluntariado) {
                replaceFragment(new VoluntariadoFragment());
            } else if (itemId == R.id.instituicao) {
                replaceFragment(new InstituicoesFragment());
            } else if (itemId == R.id.perfil) {
                replaceFragment(new PerfilFragment());
            }

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}
