package com.ivanfaathirza;

public class DetektifCilik extends Detektif{
    protected boolean dewasa = false;
    protected int umur, tinggi, berat;

    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }

    public boolean getDewasa(){
        return dewasa;
    }

    @Override
    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public int getUmur() {
        return umur;
    }

    @Override
    public void setBerat(int berat) {
        this.berat = berat;
    }

    @Override
    public int getBerat() {
        return berat;
    }

    @Override
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public int getTinggi() {
        return tinggi;
    }

    @Override
    public void tampil() {
        if(dewasa){
            if(getNamaAsli() != null)System.out.println("Nama Asli : ".concat(getNamaAsli()));
            if(this.berat != 0)System.out.println("Nama Alias : ");
            if(super.getNamaAlias() != null){
                for (int i = 0; i < super.getNamaAlias().length; i++) {
                    System.out.println("\t"+super.getNamaAlias()[i]);
                }
            }
            System.out.println("Nama : ".concat(getNama()));
            System.out.println("Umur : "+this.umur);
            if(this.berat != 0)System.out.println("Berat : "+this.berat);
            if(this.tinggi != 0)System.out.println("Tinggi : "+this.tinggi);
            System.out.println("Jenis Kelamin : "+jenisKelamin);
            if(kemampuan != null)System.out.println("Kemampuan : "+kemampuan);
        }else{
            super.tampil();
            if(this.umur != 0)System.out.println("Umur : "+this.umur);
            if(this.berat != 0)System.out.println("Berat : "+this.berat);
            if(this.tinggi != 0){System.out.println("Tinggi : "+this.tinggi);}
        }
    }
}
