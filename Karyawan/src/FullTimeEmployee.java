public class FullTimeEmployee extends Employee {
//    Attribute
    private double bonus;


//    Constructor
    public FullTimeEmployee(String nama, int gaji, double insentif, double bonus) {
        super(nama, gaji, insentif);
        super.setStatus("Pegawai Tetap");
        this.bonus = bonus;
    }

//    Setter Getter
    public double getBonus() {
        return bonus * super.getGaji();
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
