package com.ivanfaathirza;

public class Sekolah extends Karakter{
    protected String lokasi, namaSekolah;

    public Sekolah(String lokasi, String namaSekolah){
        this.lokasi = lokasi;
        this.namaSekolah = namaSekolah;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("lokasi : ".concat(getLokasi()));
        System.out.println("Nama Sekolah : ".concat(getNamaSekolah()));
    }
}
