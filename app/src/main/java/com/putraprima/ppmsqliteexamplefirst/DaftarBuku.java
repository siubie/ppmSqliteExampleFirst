package com.putraprima.ppmsqliteexamplefirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.putraprima.ppmsqliteexamplefirst.adapter.BukuAdapter;
import com.putraprima.ppmsqliteexamplefirst.models.Buku;

import java.util.ArrayList;
import java.util.List;

public class DaftarBuku extends AppCompatActivity {
    private BukuAdapter mAdapter;
    private List<Buku> mDaftarBuku = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);
        mDaftarBuku = Buku.listAll(Buku.class);

        RecyclerView recyclerBuku = (RecyclerView) findViewById(R.id.recyclerBuku);
        mAdapter = new BukuAdapter(getApplicationContext(),mDaftarBuku);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerBuku.setLayoutManager(mLayoutManager);
        recyclerBuku.setItemAnimator(new DefaultItemAnimator());
        recyclerBuku.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}
