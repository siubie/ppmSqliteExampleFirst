package com.putraprima.ppmsqliteexamplefirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.putraprima.ppmsqliteexamplefirst.models.Buku;

public class DetailBuku extends AppCompatActivity {
    TextView judulBuku,isbnBuku,penerbitBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);
        Intent i = getIntent();
        Long idBuku = i.getLongExtra("bukuId",0L);
        Buku detailBuku = Buku.findById(Buku.class,idBuku);
        judulBuku = (TextView) findViewById(R.id.judulBuku);
        judulBuku.setText(detailBuku.getJudul());
        isbnBuku = (TextView) findViewById(R.id.isbnBuku);
        isbnBuku.setText(detailBuku.getISBN());
        penerbitBuku = (TextView) findViewById(R.id.penerbitBuku);
        penerbitBuku.setText(detailBuku.getPenerbit());


    }
}
