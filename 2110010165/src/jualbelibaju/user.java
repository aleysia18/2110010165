/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jualbelibaju;

/**
 *
 * @author User
 */
public class user {
    private int id_user;
    private String nama_user;
    private String login_user;
    private String pass_user;
    private String email_user;
    private String alamat_user;
    private String kodepos_user;
    private String kota_user;
    private String telpon;
    private String status;

    public user(int id_user, String nama_user, String login_user, String pass_user, String email_user,
            String alamat_user, String kodepos_user, String kota_user, String telpon, String status) {
        this.id_user = id_user;
        this.nama_user = nama_user;
        this.login_user = login_user;
        this.pass_user = pass_user;
        this.email_user = email_user;
        this.alamat_user = alamat_user;
        this.kodepos_user = kodepos_user;
        this.kota_user = kota_user;
        this.telpon = telpon;
        this.status = status;
    }

    // Metode getter dan setter untuk atribut

    public int getIdUser() {
        return id_user;
    }

    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }

    public String getNamaUser() {
        return nama_user;
    }

    public void setNamaUser(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getLoginUser() {
        return login_user;
    }

    public void setLoginUser(String login_user) {
        this.login_user = login_user;
    }

    public String getPassUser() {
        return pass_user;
    }

    public void setPassUser(String pass_user) {
        this.pass_user = pass_user;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metode lainnya untuk mengelola objek user
    // ...

    public static void main(String[] args) {
        // Contoh penggunaan kelas User
        user user = new user(1, "John Doe", "johndoe", "123456", "johndoe@example.com", "123 Main St", "12345",
                "New York", "1234567890", "Aktif");

        // Mengakses dan mengubah atribut user
        System.out.println("ID User: " + user.getIdUser());
        System.out.println("Nama User: " + user.getNamaUser());
        System.out.println("Login User: " + user.getLoginUser());
        System.out.println("Password User: " + user.getPassUser());
        System.out.println("Email User: " + user.getEmailUser());
        System.out.println("Alamat User: " + user.getAlamatUser());
        System.out.println("Kode Pos User: " + user.getKodeposUser());
        System.out.println("Kota User: " + user.getKotaUser());
        System.out.println("Telepon: " + user.getTelpon());
        System.out.println("Status: " + user.getStatus());

        user.setNamaUser("Jane Smith");
        user.setEmailUser("janesmith@example.com");

        System.out.println("Nama User (setelah perubahan): " + user.getNamaUser());
        System.out.println("Email User (setelah perubahan): " + user.getEmailUser());
    }
}
