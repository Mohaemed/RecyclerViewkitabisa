package com.example.recyclerviewa172101842;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NegaraViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView1;
    public TextView namaTextView, deskripsiTextView;

    public NegaraViewHolder(@NonNull View itemView) {
        super(itemView);


        imageView1 = (ImageView)itemView.findViewById(R.id.imageView1);
        namaTextView = (TextView)itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = (TextView)itemView.findViewById(R.id.deskripsiTextView);
    }
}
