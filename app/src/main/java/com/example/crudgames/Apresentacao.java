package com.example.crudgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Apresentacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        getSupportActionBar().hide();


        Button btnInicial = findViewById(R.id.cadastroInicial);

        btnInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Apresentacao.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}