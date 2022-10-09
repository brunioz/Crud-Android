package com.example.crudgames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText user;
    EditText senha;
    Button btnLogin;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        TextView primeiro_acesso = (TextView) findViewById(R.id.primeiro_acesso);
        user = (EditText) findViewById(R.id.user);
        senha = (EditText) findViewById(R.id.senha);
        btnLogin = (Button) findViewById(R.id.btn_entrar);
        btnLogin.setOnClickListener((View) -> {

            if(user.getText().toString().isEmpty() || senha.getText().toString().isEmpty()){

                Toast.makeText(getApplicationContext(), "Por favor preencha todos os campos", Toast.LENGTH_LONG).show();
                
            } else {

                if (user.getText().toString().equals("admin") && senha.getText().toString().equals("123")) {
                    startActivity(new Intent(this, ListarJogadoresActivity.class));
                } else {
                    Toast.makeText(this, "Usuario ou senha inválidos, por favor preencha dados válidos", Toast.LENGTH_SHORT).show();
                }
                
            }

        });

        primeiro_acesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, CadastroJogadoresActivity.class);
                startActivity(intent);

            }
        });

    }
}