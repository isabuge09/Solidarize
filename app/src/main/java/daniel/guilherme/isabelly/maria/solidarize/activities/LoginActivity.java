package daniel.guilherme.isabelly.maria.solidarize.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

import daniel.guilherme.isabelly.maria.solidarize.R;
import daniel.guilherme.isabelly.maria.solidarize.util.Config;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnlogin = findViewById(R.id.loginBtn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputLayout emailInputLayout = findViewById(R.id.emailInputLayout);
                String email = emailInputLayout.getEditText().getText().toString();
                if(email.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Campo de email não foi preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                TextInputLayout passwordInputLayout = findViewById(R.id.passwordInputLayout);
                String password = passwordInputLayout.getEditText().getText().toString();
                if(password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Campo de senha não foi preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                Config.setLogin(LoginActivity.this, email);
                Config.setPassword(LoginActivity.this, password);

                Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }


}