public class Belanjaan {
//    Attribute
    private String nama;
    private int harga;

//    Constructor
    Belanjaan(String nama, int harga){
        this.nama = nama;
        this.setHarga(harga);
    }

//    Method
    public void setHarga(int harga) {
        if(harga>0){
            this.harga = harga;
        }
    }
    public int getHarga() {
        return harga;
    }
    public String getNama() {
        return nama;
    }


}
