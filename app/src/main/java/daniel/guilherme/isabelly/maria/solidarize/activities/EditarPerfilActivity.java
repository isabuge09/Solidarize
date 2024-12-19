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

public class EditarPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_editar_perfil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Botão de salvar alterações
        Button editar = findViewById(R.id.saveChangesButton);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Recuperar os campos do layout
                TextInputLayout nome = findViewById(R.id.firstNameInputLayout);
                TextInputLayout sobrenome = findViewById(R.id.lastNameInputLayout);
                TextInputLayout email = findViewById(R.id.emailInputLayout);
                TextInputLayout data = findViewById(R.id.birthDateInputLayout);
                TextInputLayout bio = findViewById(R.id.bioInputLayout);
                TextInputLayout senhaAtual = findViewById(R.id.currentPasswordInputLayout);
                TextInputLayout novaSenha = findViewById(R.id.newPasswordInputLayout);
                TextInputLayout confirmarNovaSenha = findViewById(R.id.confirmNewPasswordInputLayout);

                // Obter os valores dos campos
                String Nome = nome.getEditText().getText().toString().trim();
                String Sobrenome = sobrenome.getEditText().getText().toString().trim();
                String Email = email.getEditText().getText().toString().trim();
                String Data = data.getEditText().getText().toString().trim();
                String Bio = bio.getEditText().getText().toString().trim();
                String SenhaAtual = senhaAtual.getEditText().getText().toString().trim();
                String NovaSenha = novaSenha.getEditText().getText().toString().trim();
                String ConfirmarNovaSenha = confirmarNovaSenha.getEditText().getText().toString().trim();

                // Verificar se os campos estão vazios
                if (Nome.isEmpty()) {
                    nome.setError("O campo Nome não pode estar vazio");
                } else {
                    nome.setError(null);
                }

                if (Sobrenome.isEmpty()) {
                    sobrenome.setError("O campo Sobrenome não pode estar vazio");
                } else {
                    sobrenome.setError(null);
                }

                if (Email.isEmpty()) {
                    email.setError("O campo Email não pode estar vazio");
                } else {
                    email.setError(null);
                }

                if (Data.isEmpty()) {
                    data.setError("O campo Data de Nascimento não pode estar vazio");
                } else {
                    data.setError(null);
                }

                if (Bio.isEmpty()) {
                    bio.setError("O campo Bio não pode estar vazio");
                } else {
                    bio.setError(null);
                }

                if (SenhaAtual.isEmpty()) {
                    senhaAtual.setError("O campo Senha Atual não pode estar vazio");
                } else {
                    senhaAtual.setError(null);
                }

                if (NovaSenha.isEmpty()) {
                    novaSenha.setError("O campo Nova Senha não pode estar vazio");
                } else {
                    novaSenha.setError(null);
                }

                if (ConfirmarNovaSenha.isEmpty()) {
                    confirmarNovaSenha.setError("O campo Confirmar Nova Senha não pode estar vazio");
                } else {
                    confirmarNovaSenha.setError(null);
                }

                // Verificar se a Nova Senha e Confirmar Nova Senha são iguais
                if (!NovaSenha.isEmpty() && !ConfirmarNovaSenha.isEmpty() && !NovaSenha.equals(ConfirmarNovaSenha)) {
                    confirmarNovaSenha.setError("As senhas não coincidem");
                } else {
                    confirmarNovaSenha.setError(null);
                }

                // Verificar se todos os campos estão preenchidos corretamente
                if (!Nome.isEmpty() && !Sobrenome.isEmpty() && !Email.isEmpty() && !Data.isEmpty() &&
                        !Bio.isEmpty() && !SenhaAtual.isEmpty() && !NovaSenha.isEmpty() &&
                        !ConfirmarNovaSenha.isEmpty() && NovaSenha.equals(ConfirmarNovaSenha)) {
                    Toast.makeText(EditarPerfilActivity.this, "Alterações salvas com sucesso!", Toast.LENGTH_SHORT).show();
                    // Aqui você pode implementar a lógica para salvar os dados
                } else {
                    Toast.makeText(EditarPerfilActivity.this, "Preencha todos os campos corretamente antes de continuar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
