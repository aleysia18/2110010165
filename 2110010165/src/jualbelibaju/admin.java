/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class admin {
   private String username;
   private String password;

    public admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    // Metode lainnya untuk mengelola akun admin
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan akun admin
        admin admin = new admin("admin", "admin123");

        // Proses otentikasi
        String enteredUsername = "admin";
        String enteredPassword = "admin123";
        if (admin.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Otentikasi berhasil. Selamat datang, admin!");
            // Lakukan tindakan yang diperlukan oleh admin
        } else {
            System.out.println("Otentikasi gagal. Silakan coba lagi.");
            // Lakukan tindakan jika otentikasi gagal
        }
    }
}

