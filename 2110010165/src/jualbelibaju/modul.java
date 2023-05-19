/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class modul {
    private int id_modul;
    private String nama_modul;
    private String link;
    private boolean static_konten;
    private String gambar;
    private String status;
    private boolean aktif;
    private int urutan;

    public modul(int id_modul, String nama_modul, String link, boolean static_konten, String gambar, String status,
            boolean aktif, int urutan) {
        this.id_modul = id_modul;
        this.nama_modul = nama_modul;
        this.link = link;
        this.static_konten = static_konten;
        this.gambar = gambar;
        this.status = status;
        this.aktif = aktif;
        this.urutan = urutan;
    }

    // Metode getter dan setter untuk atribut

    public int getIdModul() {
        return id_modul;
    }

    public void setIdModul(int id_modul) {
        this.id_modul = id_modul;
    }

    public String getNamaModul() {
        return nama_modul;
    }

    public void setNamaModul(String nama_modul) {
        this.nama_modul = nama_modul;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isStaticKonten() {
        return static_konten;
    }

    public void setStaticKonten(boolean static_konten) {
        this.static_konten = static_konten;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }

    // Metode lainnya untuk mengelola objek modul
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan kelas Modul
        modul modul = new modul(1, "Beranda", "beranda", true, "beranda.jpg", "Aktif", true, 1);

        // Mengakses dan mengubah atribut modul
        System.out.println("ID Modul: " + modul.getIdModul());
        System.out.println("Nama Modul: " + modul.getNamaModul());
        System.out.println("Link: " + modul.getLink());
        System.out.println("Static Konten: " + modul.isStaticKonten());
        System.out.println("Gambar: " + modul.getGambar());
        System.out.println("Status: " + modul.getStatus());
        System.out.println("Aktif: " + modul.isAktif());
        System.out.println("Urutan: " + modul.getUrutan());

        modul.setNamaModul("Profil");
        modul.setAktif(false);

        System.out.println("Nama Modul (setelah perubahan): " + modul.getNamaModul());
        System.out.println("Aktif (setelah perubahan): " + modul.isAktif());
    }
}

