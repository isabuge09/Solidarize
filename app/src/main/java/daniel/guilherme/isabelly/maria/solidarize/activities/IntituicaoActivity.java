package daniel.guilherme.isabelly.maria.solidarize.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import daniel.guilherme.isabelly.maria.solidarize.R;

public class IntituicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intituicao);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imagemInstituicao = findViewById(R.id.coverImageView);
        imagemInstituicao.setImageResource(R.drawable.fundo4);
        ImageView pfpInstituicao = findViewById(R.id.profileImageView);
        pfpInstituicao.setImageResource(R.drawable.pfp5);
    }
}