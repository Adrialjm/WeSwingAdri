package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weswing.adapter.MyAdapter2;
import com.example.weswing.data.MyData2;

import java.util.ArrayList;
import java.util.List;

public class Calendario extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter2 adapter;
    private List<MyData2> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        // Filtros:
        TextView botonFiltros = findViewById(R.id.filtres);
        botonFiltros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calendario.this, Filtros.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recyclerMogudes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Agregar datos y cosas:
        dataList = new ArrayList<>();

        dataList.add(new MyData2(R.drawable.usuario, "17 de abril de 2017", "I'm beginning to see the light","Organizado por Big Mama","17/04/2017-17/04/2017 | 2 horas","Madrid, España"));
        dataList.add(new MyData2(R.drawable.usuario, "18 de abril de 2017", "Big Martes","Organizado por Big Mama","18/04/2017-18/04/2017 | 2 horas","Madrid, España"));
        dataList.add(new MyData2(R.drawable.usuario, "22 de abril de 2017", "I'm turning fartos help","Organizado por Abel","22/04/2017-25/04/2017 | 2 horas","Madrid, España"));

        // Establecer el adaptador
        adapter = new MyAdapter2(dataList);
        recyclerView.setAdapter(adapter);
    }
}