package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weswing.adapter.MyAdapter;
import com.example.weswing.data.MyData;

import java.util.ArrayList;
import java.util.List;

public class Asistentes extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyData> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistentes);

        // Obtener la referencia+configurar el RecyclerView
        recyclerView = findViewById(R.id.recyclerProfessors);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Lista de datos + agregar cosos
        dataList = new ArrayList<>();

        dataList.add(new MyData(R.drawable.usuario, "Alba Cas Lemonhop", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Angela Mena Also", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Jana Grulichova", "Professor"));
        dataList.add(new MyData(R.drawable.usuario, "Jazzmin Olave", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Neus Castells Marcé", "Professor"));

        adapter = new MyAdapter(dataList);

        // Establecer adaptador en el RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
