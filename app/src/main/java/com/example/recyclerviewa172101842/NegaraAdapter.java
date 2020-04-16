package com.example.recyclerviewa172101842;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraViewHolder> {
    private Context c;
    private List<NegaraModel> negaraModelList;

    public NegaraAdapter(Context c, List<NegaraModel> negaraModelList) {
        this.c = c;
        this.negaraModelList = negaraModelList;
    }

    @NonNull
    @Override
    public NegaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.layout_negara,parent, false);
        return new NegaraViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NegaraViewHolder holder, int position) {
        NegaraModel nm = negaraModelList.get(position);
        Picasso.with(c).load(nm.getUrl()).into(holder.imageView1);
        holder.namaTextView.setText(nm.getDeskripsi());
        holder.deskripsiTextView.setText(nm.getDeskripsi());


    }

    @Override
    public int getItemCount() {
        return (negaraModelList != null) ? negaraModelList.size() : 0;
    }
}
