package com.example.gz.examplerecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDates extends RecyclerView.Adapter <AdapterDates.ViewHolderDatos> {

    ArrayList <String> listDates;

    public AdapterDates(ArrayList<String> listDates) {
        this.listDates = listDates;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event,parent,false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.asignardatos(listDates.get(position));

    }

    @Override
    public int getItemCount() {
        return listDates.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {


        TextView textView2;
        TextView textView3;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            textView2 = (TextView) itemView.findViewById(R.id.textView2);
        }

        public void asignardatos(String dato) {
            textView2.setText(dato);
        }
    }
}
