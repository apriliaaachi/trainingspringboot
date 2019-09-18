package id.co.bri.dce.fbpinterview.entities;

public class User {
    private int id;
    private String nama;
    private String email;
    private String password;

    public User(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
    }
}
