package com.example.playjuegos;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GenerosViewHolder extends RecyclerView.ViewHolder {
    protected TextView texto;

    public GenerosViewHolder(@NonNull View v) {
        super(v);
        this.texto = v.findViewById(R.id.genero);
    }
}
