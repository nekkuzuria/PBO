public class Barang
{
//    Attribute==================
    String id;
    private int harga;
    private int stok;
    private float diskon;
    private String nama;

//    Constructor================
    Barang(String id, int harga, int stok, String nama) {
        this.id = id;
        this.setHarga(harga);
        this.setStok(stok);
        this.setNama(nama);
        this.diskon = 0;
    }

//     Method===================
    boolean barangTersedia(){
        if(stok > 0) return true;
        else return false;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        if(harga>0) this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama.toLowerCase();
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }
}
