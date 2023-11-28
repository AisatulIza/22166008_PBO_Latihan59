/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat59;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas karakterdetektif
public class KarakterDetektif {
     //variabel
    private String nama;
    private String jenisKelamin;
    private String profesi;
    //konstruktor
    public KarakterDetektif (String nama, String jenisKelamin, String profesi) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.profesi = profesi;
    }
    //metod get dan set
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getProfesi() {
        return profesi;
    }
    public void setProfesi(String profesi) {
        this.profesi = profesi;
    }
    //metod tampil karakter
    public void tampilKarakter() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Profesi : " + profesi);
    }
}
//kelas detektif turunan dari kelas karakterdetektif
class Detektif extends KarakterDetektif {
    //variabel
    private String kemampuan;
    //konstruktor
    public Detektif(String nama, String jenisKelamin, String kemampuan) {
        super(nama, jenisKelamin, "Detektif");
        this.kemampuan = kemampuan;
    }
    //metod get dan set
    public String getKemampuan() {
        return kemampuan;
    }
    public void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }

    @Override
    //metode tampilkarakter
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Kemampuan : " + kemampuan);
    }
}
//kelas tokohutama turunan dari kelas detektif
class TokohUtama extends Detektif {
    //variabel
    private String karakteristik;
    //konstruktor
    public TokohUtama(String nama, String jenisKelamin, String kemampuan, String karakteristik) {
        super(nama, jenisKelamin, kemampuan);
        this.karakteristik = karakteristik;
    }
    //metode get dan set
    public String getKarakteristik() {
        return karakteristik;
    }
    public void setKarakteristik(String karakteristik) {
        this.karakteristik = karakteristik;
    }
    @Override
    //metode tampilkarakter
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Karakteristik : " + karakteristik);
    }
}
//kelas tokohpendukung turunan dari kelas karakterdetektif
class TokohPendukung extends KarakterDetektif {
    //variabel
    private String peran;
    //konstruktor
    public TokohPendukung(String nama, String jenisKelamin, String peran) {
        super(nama, jenisKelamin, "Tokoh Pendukung");
        this.peran = peran;
    }
    //metode get dan set
    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    @Override
    public void tampilKarakter() {
        super.tampilKarakter();
        System.out.println("Peran: " + peran);
    }
    public static void main(String[] args) {
        KarakterDetektif karakter1 = new Detektif("Shinichi Kudo", "Laki-laki", "Pemecah Kasus");
        karakter1.tampilKarakter();

        KarakterDetektif karakter2 = new TokohUtama("Ran Mouri", "Perempuan", "Ahli Karate", "Teman Dekat Shinichi");
        karakter2.tampilKarakter();

        KarakterDetektif karakter3 = new TokohPendukung("Heiji Hattori", "Laki-laki", "Detektif SMA");
        karakter3.tampilKarakter();
    }
}
