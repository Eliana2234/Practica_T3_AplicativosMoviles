package com.example.practica_3_aplicativosmoviles.Adapters;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_3_aplicativosmoviles.Activity_Detalle;
import com.example.practica_3_aplicativosmoviles.Entities.Pokemones;
import com.example.practica_3_aplicativosmoviles.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Pokemon_Adapter extends RecyclerView.Adapter<Pokemon_Adapter.ViewHolder> {

        private List<Pokemones> data;

    public Pokemon_Adapter(List<Pokemones> data){
            this.data = data;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item,parent,false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Pokemon_Adapter.ViewHolder holder, int position) {
            TextView tvNombre = holder.itemView.findViewById(R.id.tvNombre);
            TextView tvTipo = holder.itemView.findViewById(R.id.tvTipo);
            Button btnDetalle = holder.itemView.findViewById(R.id.btnDetalle);
            ImageView ivImagen = holder.itemView.findViewById(R.id.ivImagen);

            tvNombre.setText(data.get(position).getNombre());
            tvTipo.setText(data.get(position).getTipo());

            String ruta = data.get(position).getImagen();
            Picasso.get().load(ruta).resize (250, 250).into(ivImagen);
            btnDetalle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent detalle = new Intent(view.getContext(), Activity_Detalle.class);
                    detalle.putExtra("Nombre",data.get(holder.getAdapterPosition()).getNombre());
                    detalle.putExtra("Tipo",data.get(holder.getAdapterPosition()).getTipo());
                    detalle.putExtra("Imagen",data.get(holder.getAdapterPosition()).getImagen());
                    detalle.putExtra("Latitud",data.get(holder.getAdapterPosition()).getLatitud());
                    detalle.putExtra("Longitud",data.get(holder.getAdapterPosition()).getLongitud());
                    view.getContext().startActivity(detalle);
                }

            });
        }

        @Override
        public int getItemCount() {

            return this.data.size();
        }
        class ViewHolder extends RecyclerView.ViewHolder{
            public ViewHolder(View itemView) {
                super(itemView);
            }

        }
    }
