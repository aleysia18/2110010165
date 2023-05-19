/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class konsumen {
    private int id_konsumen;
    private String nama_user;
    private String password;
    private String email_user;
    private String alamat_user;
    private String nama_produk;
    private String kodepos_user;
    private String kota_user;
    private String telpon;
    private String tanggal;
    private int jumlah;
    private double total;

    public konsumen(int id_konsumen, String nama_user, String password, String email_user, String alamat_user,
            String nama_produk, String kodepos_user, String kota_user, String telpon, String tanggal, int jumlah,
            double total) {
        this.id_konsumen = id_konsumen;
        this.nama_user = nama_user;
        this.password = password;
        this.email_user = email_user;
        this.alamat_user = alamat_user;
        this.nama_produk = nama_produk;
        this.kodepos_user = kodepos_user;
        this.kota_user = kota_user;
        this.telpon = telpon;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.total = total;
    }

    // Metode getter dan setter untuk atribut

    public int getIdKonsumen() {
        return id_konsumen;
    }

    public void setIdKonsumen(int id_konsumen) {
        this.id_konsumen = id_konsumen;
    }

    public String getNamaUser() {
        return nama_user;
    }

    public void setNamaUser(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailUser() {
        return email_user;
    }

    public void setEmailUser(String email_user) {
        this.email_user = email_user;
    }

    public String getAlamatUser() {
        return alamat_user;
    }

    public void setAlamatUser(String alamat_user) {
        this.alamat_user = alamat_user;
    }

    public String getNamaProduk() {
        return nama_produk;
    }

    public void setNamaProduk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getKodeposUser() {
        return kodepos_user;
    }

    public void setKodeposUser(String kodepos_user) {
        this.kodepos_user = kodepos_user;
    }

    public String getKotaUser() {
        return kota_user;
    }

    public void setKotaUser(String kota_user) {
        this.kota_user = kota_user;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Metode lainnya untuk mengelola objek konsumen
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan kelas Konsumen
        konsumen konsumen = new konsumen(1, "John Doe", "password123", "john@example.com", "Jl. Contoh No. 123",
                "Baju T-Shirt", "12345", "Jakarta", "081234567890", "2023-05-19", 2, 150000.0);

        // Mengakses dan mengubah atribut konsumen
        System.out.println("ID Konsumen: " + konsumen.getIdKonsumen());
        System.out.println("Nama User: " + konsumen.getNamaUser());
        System.out.println("Password: " + konsumen.getPassword());
        System.out.println("Email User: " + konsumen.getEmailUser());
        System.out.println("Alamat User: " + konsumen.getAlamatUser());
        System.out.println("Nama Produk: " + konsumen.getNamaProduk());
        System.out.println("Kodepos User: " + konsumen.getKodeposUser());
        System.out.println("Kota User: " + konsumen.getKotaUser());
        System.out.println("Telpon: " + konsumen.getTelpon());
        System.out.println("Tanggal: " + konsumen.getTanggal());
        System.out.println("Jumlah: " + konsumen.getJumlah());
        System.out.println("Total: " + konsumen.getTotal());

        konsumen.setNamaUser("Jane Smith");
        konsumen.setTotal(200000.0);

        System.out.println("Nama User (setelah perubahan): " + konsumen.getNamaUser());
        System.out.println("Total (setelah perubahan): " + konsumen.getTotal());
    }
}

