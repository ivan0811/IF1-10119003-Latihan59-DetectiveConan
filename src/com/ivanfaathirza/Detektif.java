package com.ivanfaathirza;

public class Detektif extends Karakter{
    protected String namaAsli;
    protected String[] namaAlias;

    public String getNamaAsli() {
        return namaAsli;
    }

    public String[] getNamaAlias() {
        return namaAlias;
    }

    public void setNamaAsli(String namaAsli) {
        this.namaAsli = namaAsli;
    }

    public void setNamaAlias(String[] namaAlias) {
        this.namaAlias = namaAlias;
    }

    @Override
    public void tampil(){
        super.tampil();
        if(this.berat != 0)System.out.println("Nama Asli : "+namaAsli);
        if(getNamaAlias() != null){
            System.out.println("Nama Alias : ");
            for (int i = 0; i < getNamaAlias().length; i++) {
                System.out.println("\t"+getNamaAlias()[i]);
            }
        }
    }
}
