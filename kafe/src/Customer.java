import java.util.ArrayList;

public class Customer {
//    Attribute
    private int id;
    private String nama;
    private ArrayList<String> alergi = new ArrayList<>();
    private boolean isMaag;
    private int uang;

//    Constructor
    public Customer(int id, String nama, boolean isMaag, int uang) {
        this.id = id;
        this.nama = nama;
        this.isMaag = isMaag;
        this.uang = uang;
    }

//    Getter Setter
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public boolean isMaag() {
        return isMaag;
    }
    public void setMaag(boolean maag) {
        isMaag = maag;
    }
    public int getUang() {
        return uang;
    }
    public void setUang(int uang) {
        this.uang = uang;
    }

    public ArrayList<String> getAlergi() {
        return alergi;
    }

    //    Method
    public void addAlergi(String alergi){
        this.alergi.add(alergi);
    }

}
