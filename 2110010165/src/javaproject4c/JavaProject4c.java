/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject4c;

import jualbelibaju.admin;
import jualbelibaju.kategori;
import jualbelibaju.konsumen;
import jualbelibaju.kota;
import jualbelibaju.modul;
import jualbelibaju.produk;
import jualbelibaju.user;

/**
 *
 * @author User
 */
public class JavaProject4c {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Admin
        admin admin = new admin("admin", "admin123");
        admin.main(args);
        
        // Contoh penggunaan kelas Kategori
        kategori kategori = new kategori(1, "Pakaian Wanita", "pakaian-wanita");

        kategori.main(args);
        
        // Contoh penggunaan kelas Konsumen
        konsumen konsumen = new konsumen(1, "John Doe", "password123", "john@example.com", "Jl. Contoh No. 123",
                "Baju T-Shirt", "12345", "Jakarta", "081234567890", "2023-05-19", 2, 150000.0);

        konsumen.main(args);
        
        // Contoh penggunaan kelas Kota
        kota kota = new kota(1, "Jakarta", 15000.0);
        kota.main(args);
        
        // Contoh penggunaan kelas Modul
        modul modul = new modul(1, "Beranda", "beranda", true, "beranda.jpg", "Aktif", true, 1);

        modul.main(args);
        
        // Contoh penggunaan kelas Produk
        produk produk = new produk(1, 1, "Baju Polos", "baju-polos", "Baju polos warna hitam", 100000, 10, "L", 0.5,
                "2023-05-19", "baju_polos.jpg", 0, "Tersedia");

        produk.main(args);
        
        // Contoh penggunaan kelas User
        user user = new user(1, "John Doe", "johndoe", "123456", "johndoe@example.com", "123 Main St", "12345",
                "New York", "1234567890", "Aktif");

        user.main(args);
    }
}

