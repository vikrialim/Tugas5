package com.example.vikri.tugas5.Model;

public class Model {
    String namaOrang;
    int fotoOrang;

    public Model(String namaOrang, int fotoOrang){
        this.namaOrang= namaOrang;
        this.fotoOrang= fotoOrang;
    }
    public String getNamaOrang() {
        return namaOrang;
    }

    public int getFotoOrang() {
        return fotoOrang;
    }

}
