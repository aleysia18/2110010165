/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class kota {
    private int id_kota;
    private String nama_kota;
    private double ongkos_kirim;

    public kota(int id_kota, String nama_kota, double ongkos_kirim) {
        this.id_kota = id_kota;
        this.nama_kota = nama_kota;
        this.ongkos_kirim = ongkos_kirim;
    }

    // Metode getter dan setter untuk atribut

    public int getIdKota() {
        return id_kota;
    }

    public void setIdKota(int id_kota) {
        this.id_kota = id_kota;
    }

    public String getNamaKota() {
        return nama_kota;
    }

    public void setNamaKota(String nama_kota) {
        this.nama_kota = nama_kota;
    }

    public double getOngkosKirim() {
        return ongkos_kirim;
    }

    public void setOngkosKirim(double ongkos_kirim) {
        this.ongkos_kirim = ongkos_kirim;
    }

    // Metode lainnya untuk mengelola objek kota
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan kelas Kota
        kota kota = new kota(1, "Jakarta", 15000.0);

        // Mengakses dan mengubah atribut kota
        System.out.println("ID Kota: " + kota.getIdKota());
        System.out.println("Nama Kota: " + kota.getNamaKota());
        System.out.println("Ongkos Kirim: " + kota.getOngkosKirim());

        kota.setNamaKota("Surabaya");
        kota.setOngkosKirim(20000.0);

        System.out.println("Nama Kota (setelah perubahan): " + kota.getNamaKota());
        System.out.println("Ongkos Kirim (setelah perubahan): " + kota.getOngkosKirim());
    }
}

