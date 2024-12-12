package daniel.guilherme.isabelly.maria.solidarize.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.fragments.EventsFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.InstituicoesFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.PerfilFragment;
import daniel.guilherme.isabelly.maria.solidarize.fragments.VoluntariadoFragment;

import com.example.bottomnavigation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setBackground(null);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new EventsFragment());
                    break;

                case R.id.voluntariado:
                    replaceFragment(new VoluntariadoFragment());
                    break;

                case R.id.instituicao:
                    replaceFragment(new InstituicoesFragment());
                    break;

                case R.id.perfil:
                    replaceFragment(new PerfilFragment());
                    break;
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