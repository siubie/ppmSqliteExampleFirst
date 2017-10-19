package com.putraprima.ppmsqliteexamplefirst;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.putraprima.ppmsqliteexamplefirst.models.Buku;

public class TambahBuku extends AppCompatActivity {
    EditText txtPenerbit,txtIsbn,txtJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_buku);
        Button btnSimpanBuku = (Button) findViewById(R.id.btnSimpanBuku);
        txtPenerbit = (EditText) findViewById(R.id.txtPenerbit);
        txtIsbn = (EditText) findViewById(R.id.txtIsbn);
        txtJudul = (EditText) findViewById(R.id.txtJudul);
        txtJudul.requestFocus();
        btnSimpanBuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buku mBuku = new Buku(txtJudul.getText().toString(),txtIsbn.getText().toString(),txtPenerbit.getText().toString());
                mBuku.save();
                txtPenerbit.setText("");
                txtIsbn.setText("");
                txtJudul.setText("");
                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.constraintLayout),
                        "Data Berhasil Disimpan", Snackbar.LENGTH_SHORT);
                mySnackbar.show();
            }
        });
    }
}
