public class Main {
    public static void main(String[] args) {
//        Membuat objek kambing
        Kambing kambing = new Kambing(50, 10000000);

//        Membuat objek pembeli kurban
        PembeliKurban pembeliKurban1 = new PembeliKurban("Budiman", "Gedung SV UGM, Sekip Unit 1, Jl. " +
                "Persatuan, Blimbing Sari, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta",
                "087783347582");

//        Membuat objek pembelian
        Pembelian pembelian1 = new Pembelian("3/28/2023", 2, kambing, pembeliKurban1);

//        Melakukan perhitungan total harga dan cetak
        pembelian1.setTotalHarga(kambing);
        pembelian1.notifikasiPembelian();
    }
}