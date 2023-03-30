public class User {
//    Attribute
    private String nama;
    private String role;


//    Constructor
    public User(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

//    Setter Getter
    public void setNama(String nama) {
    this.nama = nama;
}
    public String getNama() {
        return nama;
    }
    public String getRole() {
        return role;
    }


}
