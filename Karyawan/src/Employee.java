public class Employee {
//    Attribute
    private String nama;
    private int gaji;
    private double insentif;
    private String status;

//    Constructor
    public Employee(String nama, int gaji, double insentif) {
        this.nama = nama;
        this.gaji = gaji;
        this.insentif = insentif;
    }

//    Setter Getter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public double getInsentif() {
        return insentif*gaji;
    }
    public void setInsentif(double insentif) {
        this.insentif = insentif;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getBonus(){return 0;}

//    Method
    public void getRincian(){
        System.out.println("----------------------");
        System.out.println("Rincian Gaji " + getNama());
        System.out.println("Status : " + getStatus());
        System.out.println("Gaji pokok : " + getGaji());
        System.out.println("Total Bonus : " + (int)getBonus());
        System.out.println("Total Insentif : " + (int)getInsentif());
        System.out.println("Total Gaji : " + (int)(getGaji()+getBonus()+getInsentif()));
        System.out.println("----------------------");
    }
}
