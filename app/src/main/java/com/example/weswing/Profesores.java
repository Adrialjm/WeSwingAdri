package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.weswing.adapter.MyAdapter;
import com.example.weswing.data.MyData;

import java.util.ArrayList;
import java.util.List;

public class Profesores extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyData> dataList;
    ImageView calendario;

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);

        recyclerView = findViewById(R.id.recyclerProfessors);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        calendario=findViewById(R.drawable.baseline_calendar_today_24);

        // Lista y agregar datos
        dataList = new ArrayList<>();
        dataList.add(new MyData(R.drawable.usuario, "Abel Susin", "Professor"));
        dataList.add(new MyData(R.drawable.usuario, "Pau Chacon", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Alejandro Galera", "Professor"));
        dataList.add(new MyData(R.drawable.usuario, "Deninson Tapia", "Dancer"));
        dataList.add(new MyData(R.drawable.usuario, "Jeremy Chipping", "Dancer"));

        //Llevo ya 5h delante del ordenador por la noche y me arden los ojos
        //Solo me mantiene vivo este video de 20 minutos https://www.youtube.com/watch?v=MuN0OUZTZIw

        // Establecer y crear el adaptador
        adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);

    }
}