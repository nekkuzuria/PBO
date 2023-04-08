public class Transaksi {
//    Attribute
    private String tanggal;
    private int jumlah;
    private HewanKurban hewan;
    private PembeliKurban pembeli;
    private int totalHarga;

//    Constructor
    public Transaksi(String tanggal, int jumlah, HewanKurban hewan, PembeliKurban pembeli) {
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.hewan = hewan;
        this.pembeli = pembeli;
    }

//    Getter Setter
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public HewanKurban getHewan() {
        return hewan;
    }
    public void setHewan(HewanKurban hewan) {
        this.hewan = hewan;
    }
    public PembeliKurban getPembeli() {
        return pembeli;
    }
    public void setPembeli(PembeliKurban pembeli) {
        this.pembeli = pembeli;
    }
    public void setTotalHarga(HewanKurban hewan){
        this.totalHarga = hewan.getHarga() * getJumlah();
    }
    public int getTotalHarga() {
        return totalHarga;
    }

//    Method
    public void notifikasiPembelian(){
        System.out.println("Transaksi Pembelian pada tanggal " + getTanggal() + " dengan rincian sebagai berikut:");
        System.out.println("- Nama pembeli: " + pembeli.getNama());
        System.out.println("- Alamat: " + pembeli.getAlamat());
        System.out.println("- Nomor Hp: " + pembeli.getKontak());
        System.out.println("- Jenis hewan: " + hewan.getNama());
        System.out.println("- Jumlah: " + getJumlah());
        System.out.println("- Berat satuan: " + hewan.getBerat());
        System.out.println("- Harga satuan: " + hewan.getHarga());
        System.out.println("- Total harga: " + getTotalHarga());
    }
}
