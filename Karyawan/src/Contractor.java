public class Contractor extends Employee {
//    Attribute
    private int jamKerja;

//    Constructor
    public Contractor(String nama, int gaji, double insentif, int jamKerja){
        super(nama, gaji*jamKerja, insentif);
        super.setStatus("Pegawai Kontrak");
        this.jamKerja = jamKerja;
    }

//    Setter Getter
    public int getJamKerja() {
        return jamKerja;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
}
