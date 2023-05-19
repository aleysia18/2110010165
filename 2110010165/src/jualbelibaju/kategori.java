/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class kategori {
    private int id_kategori;
    private String nama_kategori;
    private String kategori_seo;

    public kategori(int id_kategori, String nama_kategori, String kategori_seo) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
        this.kategori_seo = kategori_seo;
    }

    // Metode getter dan setter untuk atribut

    public int getIdKategori() {
        return id_kategori;
    }

    public void setIdKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNamaKategori() {
        return nama_kategori;
    }

    public void setNamaKategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getKategoriSeo() {
        return kategori_seo;
    }

    public void setKategoriSeo(String kategori_seo) {
        this.kategori_seo = kategori_seo;
    }

    // Metode lainnya untuk mengelola objek kategori
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan kelas Kategori
        kategori kategori = new kategori(1, "Pakaian Wanita", "pakaian-wanita");

        // Mengakses dan mengubah atribut kategori
        System.out.println("ID Kategori: " + kategori.getIdKategori());
        System.out.println("Nama Kategori: " + kategori.getNamaKategori());
        System.out.println("Kategori SEO: " + kategori.getKategoriSeo());

        kategori.setNamaKategori("Pakaian Pria");
        kategori.setKategoriSeo("pakaian-pria");

        System.out.println("Nama Kategori (setelah perubahan): " + kategori.getNamaKategori());
        System.out.println("Kategori SEO (setelah perubahan): " + kategori.getKategoriSeo());
    }
}

