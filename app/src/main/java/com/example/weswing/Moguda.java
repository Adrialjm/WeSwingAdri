package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Moguda extends AppCompatActivity { //Poco se habla de lo graciosa que me parece la palabra moguda
CardView mogudaEscuela;
ImageButton botonPerfil;
ImageButton calendario;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_moguda);

            TextView assistentsTextView = findViewById(R.id.assistentsButton);
            mogudaEscuela=findViewById(R.id.mogudaOrganitzador);
            botonPerfil=findViewById(R.id.btn_profile);
            calendario=findViewById(R.id.navigation_profile);

            assistentsTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Moguda.this, Asistentes.class);
                    startActivity(intent);
                }
            });

            mogudaEscuela.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent (Moguda.this,Escuela.class);
                    startActivity(i);
                }
            });

            botonPerfil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent (Moguda.this,Perfil.class);
                    startActivity(a);
                }
            });

            calendario.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent b = new Intent (Moguda.this,Calendario.class);
                    startActivity(b);
                }
            });
        }
    }