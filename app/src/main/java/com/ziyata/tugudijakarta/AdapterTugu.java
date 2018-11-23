package com.ziyata.tugudijakarta;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterTugu extends RecyclerView.Adapter<AdapterTugu.ViewHolder> {
    Context context;
    String[] namaTugu,isiTugu;
    int[] gambarTugu;

    public AdapterTugu(Context context, String[] namaTugu, String[] isiTugu, int[] gambarTugu) {
        this.context = context;
        this.namaTugu = namaTugu;
        this.isiTugu = isiTugu;
        this.gambarTugu = gambarTugu;
    }

    @NonNull
    @Override
    public AdapterTugu.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    { View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_tugu,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTugu.ViewHolder viewHolder, final int i) {
        viewHolder.txtNama.setText(namaTugu[i]);
        Glide.with(context).load(gambarTugu[i]).into(viewHolder.imgGambarTugu);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailTuguActivity.class);
                intent.putExtra("nt",namaTugu[i]);
                intent.putExtra("it",isiTugu[i]);
                intent.putExtra("gt",gambarTugu[i]);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarTugu.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama;
        ImageView imgGambarTugu;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.txtListTitle);
            imgGambarTugu = itemView.findViewById(R.id.imgList);
        }
    }
}
