package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class Registro extends AppCompatActivity {
ToggleButton toggleRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        toggleRegistro = findViewById(R.id.btn_registro);
        // Pulsa para novedades
        toggleRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro.this, Novetats.class);
                startActivity(intent);
            }
        });
    }

}