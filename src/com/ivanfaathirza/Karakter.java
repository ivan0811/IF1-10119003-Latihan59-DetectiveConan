package com.ivanfaathirza;

import java.util.Date;

public class Karakter {

    protected int berat, tinggi, umur;
    protected String jenisKelamin, kemampuan, nama;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }


    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jk) {
        this.jenisKelamin = jk.equals("l") ? "Laki-laki" : "Perempuan";
    }

    public String getKemampuan() {
        return kemampuan;
    }

    public void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }

    public void tampil(){
        System.out.println("Nama : "+nama);
        if(umur != 0){System.out.println("Umur : "+umur);}
        if(berat != 0){ System.out.println("Berat : "+berat);}
        if(tinggi != 0){System.out.println("Tinggi : "+tinggi);}
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        if(kemampuan != null){System.out.println("Kemampuan : "+kemampuan);}
    }

}
