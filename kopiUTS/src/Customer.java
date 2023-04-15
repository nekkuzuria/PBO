import java.util.ArrayList;

public class Customer {
//    Attribute
    private String nama;
    private int uang;
    private boolean hasMaag;
    private ArrayList<String> alergi = new ArrayList<>();

//    Constructor
    public Customer(String nama, int uang, boolean hasMaag) {
        this.nama = nama;
        this.uang = uang;
        this.hasMaag = hasMaag;
    }

//    Getter Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public boolean isHasMaag() {
        return hasMaag;
    }

    public void setHasMaag(boolean hasMaag) {
        this.hasMaag = hasMaag;
    }

    public ArrayList<String> getAlergi() {
        return alergi;
    }


    //    Method
    public void addAllergy(String alergi){
        this.alergi.add(alergi.toLowerCase());
    }
}
