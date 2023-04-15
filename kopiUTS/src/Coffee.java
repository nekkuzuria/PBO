import java.util.ArrayList;

public class Coffee {
//    Attribute
    private int id;
    private String name;
    private int price;
    private double shot;
    private ArrayList<Customer> listPembeli = new ArrayList<>();
    private int kuota;

//    Constructor
    public Coffee(int id, String name, int price, double shot) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shot = shot;
        this.kuota = 0;
    }

//    Getter Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getShot() {
        return shot;
    }
    public void setShot(double shot) {
        this.shot = shot;
    }

    public ArrayList<Customer> getListPembeli() {
        return listPembeli;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    //    Method
    public void addPembeli(Customer cust){
        this.listPembeli.add(cust);
    }
}
