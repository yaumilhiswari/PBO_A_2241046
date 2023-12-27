package com.tutorial;

class Pegawai {
    public String nama;
    public String jabatan;
    public float pajak = 0.1f; // pajak ditetapkan sebesar 10%
    public float gajiPokok;
    private float gajiBersih;

    // Konstruktor
    public Pegawai(String nama, String jabatan, float gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setPajak(float pajak) {
        this.pajak = pajak;
    }

    public String getPajak() {
        return jabatan;
    }

    public void setGajiPokok(float gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public float getGajiPokok() {
        return gajiPokok;
    }

    public float getGajiBersih() {
        return gajiBersih;
    }

    public void hitungGajiBersih() {
      gajiBersih = gajiPokok - (gajiPokok * pajak);
    }
}



public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Adam", "Dosen", 3500000);
        
        //tampilkan informasi pegawai
         pegawai.hitungGajiBersih();
        
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Jabatan: " + pegawai.getJabatan());
        System.out.println("Gaji Bersih: Rp." + pegawai.getGajiBersih());
    }
}