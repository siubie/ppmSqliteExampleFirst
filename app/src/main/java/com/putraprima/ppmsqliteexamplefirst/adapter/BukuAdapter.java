package com.putraprima.ppmsqliteexamplefirst.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.putraprima.ppmsqliteexamplefirst.DetailBuku;
import com.putraprima.ppmsqliteexamplefirst.R;
import com.putraprima.ppmsqliteexamplefirst.models.Buku;

import java.util.List;

/**
 * Created by putraprima on 17/10/17.
 */

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuViewHolder>{
    private Context context;
    private List<Buku> listBuku;

    public BukuAdapter(Context context, List<Buku> listBuku) {
        this.context = context;
        this.listBuku = listBuku;
    }

    @Override
    public BukuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku,parent,false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BukuViewHolder holder, int position) {
        final Buku buku = listBuku.get(position);
        holder.judulBuku.setText(buku.getJudul());
        holder.judulBuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),buku.getId().toString(),Toast.LENGTH_SHORT).show();
                Intent i = new Intent(view.getContext(), DetailBuku.class);
                i.putExtra("bukuId",buku.getId());
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBuku.size();
    }

    public class BukuViewHolder extends RecyclerView.ViewHolder {
        public TextView judulBuku;
        public BukuViewHolder(View itemView) {
            super(itemView);
            judulBuku = itemView.findViewById(R.id.judulBuku);
        }
    }
}
