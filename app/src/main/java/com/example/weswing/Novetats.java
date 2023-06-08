package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Novetats extends AppCompatActivity {
    ImageButton botonPerfil;
    TextView txtview1,txtview2,txtview3,txtview4;
    ImageView flecha2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novetats);

        // Asignar vistas a variables
        txtview1 = findViewById(R.id.txtview1);
        txtview2 = findViewById(R.id.txtview2);
        txtview3 = findViewById(R.id.txtview3);
        txtview4 = findViewById(R.id.txtview4);
        flecha2 = findViewById(R.id.flecha2);
        botonPerfil = findViewById(R.id.btn_profile);

        // Crear SpannableStrings con texto y colores resaltados
        SpannableString spannableString1 = createSpannableString("I'm beginning to see the light (0 assistents) avui a las 22:10", "I'm beginning to see the light", R.color.rojo);
        SpannableString spannableString2 = createSpannableString("Angela Mena Also asistirà a Festa d'Inici de Trimestre i presentació dels professors! (5 assistents).", "Angela Mena Also", R.color.rojo);
        SpannableString spannableString3 = createSpannableString("Cristina Sánchez assistirà a Classe oberta d'Afrobeat amb el Jordi Maho! (1 assistent).", "Cristina Sánchez", R.color.rojo);
        SpannableString spannableString4 = createSpannableString("Cristina Sánchez assistirà a Classe oberta de Pilates amb la Lara Fontana! (1 assistent", "Cristina Sánchez", R.color.rojo);

        // Establecer los SpannableStrings en las vistas correspondientes
        txtview1.setText(spannableString1);
        txtview2.setText(spannableString2);
        txtview3.setText(spannableString3);
        txtview4.setText(spannableString4);

        // ir a moguda
        flecha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novetats.this, Moguda.class);
                startActivity(intent);
            }
        });

        // ir a perfil
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Novetats.this, Perfil.class);
                startActivity(intent);
            }
        });
    }

    // SpannableString con texto resaltado
    private SpannableString createSpannableString(String originalText, String textToHighlight, int color) {
        SpannableString spannableString = new SpannableString(originalText);
        int startIndex = originalText.indexOf(textToHighlight);
        int endIndex = startIndex + textToHighlight.length();
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(getResources().getColor(color));
        spannableString.setSpan(colorSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

}