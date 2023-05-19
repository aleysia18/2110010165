/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class produk {
    private int id_produk;
    private int id_kategori;
    private String nama_produk;
    private String produk_seo;
    private String deskripsi;
    private double harga;
    private int stok;
    private String ukuran;
    private double berat;
    private String tgl_masuk;
    private String gambar;
    private double diskon;
    private String status;

    public produk(int id_produk, int id_kategori, String nama_produk, String produk_seo, String deskripsi,
            double harga, int stok, String ukuran, double berat, String tgl_masuk, String gambar, double diskon,
            String status) {
        this.id_produk = id_produk;
        this.id_kategori = id_kategori;
        this.nama_produk = nama_produk;
        this.produk_seo = produk_seo;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
        this.ukuran = ukuran;
        this.berat = berat;
        this.tgl_masuk = tgl_masuk;
        this.gambar = gambar;
        this.diskon = diskon;
        this.status = status;
    }

    // Metode getter dan setter untuk atribut

    public int getIdProduk() {
        return id_produk;
    }

    public void setIdProduk(int id_produk) {
        this.id_produk = id_produk;
    }

    public int getIdKategori() {
        return id_kategori;
    }

    public void setIdKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNamaProduk() {
        return nama_produk;
    }

    public void setNamaProduk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getProdukSeo() {
        return produk_seo;
    }

    public void setProdukSeo(String produk_seo) {
        this.produk_seo = produk_seo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getTglMasuk() {
        return tgl_masuk;
    }

    public void setTglMasuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metode lainnya untuk mengelola objek produk
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan kelas Produk
        produk produk = new produk(1, 1, "Baju Polos", "baju-polos", "Baju polos warna hitam", 100000, 10, "L", 0.5,
                "2023-05-19", "baju_polos.jpg", 0, "Tersedia");

        // Mengakses dan mengubah atribut produk
        System.out.println("ID Produk: " + produk.getIdProduk());
        System.out.println("ID Kategori: " + produk.getIdKategori());
        System.out.println("Nama Produk: " + produk.getNamaProduk());
        System.out.println("Produk SEO: " + produk.getProdukSeo());
        System.out.println("Deskripsi: " + produk.getDeskripsi());
        System.out.println("Harga: " + produk.getHarga());
        System.out.println("Stok: " + produk.getStok());
        System.out.println("Ukuran: " + produk.getUkuran());
        System.out.println("Berat: " + produk.getBerat());
        System.out.println("Tanggal Masuk: " + produk.getTglMasuk());
        System.out.println("Gambar: " + produk.getGambar());
        System.out.println("Diskon: " + produk.getDiskon());
        System.out.println("Status: " + produk.getStatus());

        produk.setNamaProduk("Baju Garis");
        produk.setHarga(90000);

        System.out.println("Nama Produk (setelah perubahan): " + produk.getNamaProduk());
        System.out.println("Harga (setelah perubahan): " + produk.getHarga());
    }
}

