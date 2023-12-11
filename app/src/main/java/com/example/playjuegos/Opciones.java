package com.example.playjuegos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class Opciones extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        List<String> itemsRecycler = List.of("Accion","Aventura","Deportes","Disparos","Estrategia","Lucha","Musical","Rol","Simulacion");

        recyclerView = findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GenerosAdapter adapter = new GenerosAdapter(itemsRecycler);
        recyclerView.setAdapter(adapter);

    }
}