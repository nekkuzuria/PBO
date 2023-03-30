import java.util.ArrayList;

public class Special {
//    Attribute
    private int id;
    private int harga;
    private String nama;
    private ArrayList<Customer> dataCustomer = new ArrayList<>();
    private Cafe cafe;
    private ArrayList<String> kandungan = new ArrayList<>();

//    Constructor
    public Special(int id, String nama, int harga, Cafe cafe) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        cafe.addKopi(this);
    }

//    Setter Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Customer> getDataCustomer() {
        return dataCustomer;
    }

    public ArrayList<String> getKandungan() {
        return kandungan;
    }


    //    Method
    public void addDataCustomer(Customer cust){
        this.dataCustomer.add(cust);
    }
    public void addKandungan(String kandungan){
        this.kandungan.add(kandungan);
    }
}
