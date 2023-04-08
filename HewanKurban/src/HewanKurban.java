public class HewanKurban {
//    Attribute
    private String nama;
    private double berat;
    private int harga;

//    Constructor
    public HewanKurban(int berat, int harga) {
        this.berat = berat;
        this.harga = harga;
    }

//    Getter Setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
