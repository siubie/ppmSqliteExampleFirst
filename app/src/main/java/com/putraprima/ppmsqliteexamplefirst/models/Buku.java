package com.putraprima.ppmsqliteexamplefirst.models;

import com.orm.SugarRecord;

/**
 * Created by putraprima on 16/10/17.
 */

public class Buku extends SugarRecord<Buku>{
    public String judul;
    public String ISBN;
    public String penerbit;

    public Buku(String judul, String ISBN, String penerbit) {
        this.judul = judul;
        this.ISBN = ISBN;
        this.penerbit = penerbit;
    }

    public Buku() {
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
