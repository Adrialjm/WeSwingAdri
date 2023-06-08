package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Escuela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escuela);

        // Para ir a los profes!
        TextView professorsTextView = findViewById(R.id.text_view_professors);
        professorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Escuela.this, Profesores.class);
                startActivity(intent);
            }
        });

        // Para ir a mogudes!
        TextView mogudesTextView = findViewById(R.id.mogudes);
        mogudesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Escuela.this, Moguda.class);
                startActivity(intent);
            }
        });
    }
}