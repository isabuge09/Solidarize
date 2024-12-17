package daniel.guilherme.isabelly.maria.solidarize.activities;


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

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button signupButton = findViewById(R.id.signUpButton);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputLayout firstNameInputLayout = findViewById(R.id.firstNameInputLayout);
                String firstName = firstNameInputLayout.getEditText().getText().toString();

                TextInputLayout lastNameInputLayout = findViewById(R.id.lastNameInputLayout);
                String lastName = lastNameInputLayout.getEditText().getText().toString();

                TextInputLayout emailInputLayout = findViewById(R.id.emailInputLayout);
                String email = emailInputLayout.getEditText().getText().toString();

                TextInputLayout passwordInputLayout = findViewById(R.id.passwordInputLayout);
                String password = passwordInputLayout.getEditText().getText().toString();

                TextInputLayout confirmPasswordInputLayout = findViewById(R.id.confirmPasswordInputLayout);
                String confirmPassword = confirmPasswordInputLayout.getEditText().getText().toString();

                if(firstName.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de nome vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                if(lastName.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de sobrenome vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                if(email.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de email vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                if(password.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de senha vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                if(confirmPassword.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de confirmação da senha vazio", Toast.LENGTH_LONG).show();
                    return;
                }

                if (!confirmPassword.equals(password)){
                    Toast.makeText(CadastroActivity.this, "A senha está incorreta", Toast.LENGTH_LONG).show();
                    return;
                }

                finish();

            }
        });
    }
}