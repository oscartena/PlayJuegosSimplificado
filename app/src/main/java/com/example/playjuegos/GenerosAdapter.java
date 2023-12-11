package com.example.playjuegos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GenerosAdapter extends RecyclerView.Adapter<GenerosViewHolder> {
    private List<String> listaGeneros;

    public GenerosAdapter(List<String> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }

    @NonNull
    @Override
    public GenerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item,parent,false);
        return new GenerosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull GenerosViewHolder holder, int position) {
        holder.texto.setText(listaGeneros.get(position));
    }

    @Override
    public int getItemCount() {
        return listaGeneros.size();
    }
}
