public class Tiket {
//   == Attribute ==
    static int jumlahKursi;
    static int harga;
    static Pesanan pesanan;


//   == Method ==
    //untuk menyimpan data pesanan objek
    public static void tambahPesanan(Penonton penonton, Pesanan pesanan){
        pesanan = pesanan;
        jumlahKursi = pesanan.studio.jumlahKursi;
        harga = pesanan.studio.hargaTiket;

        if(pesanan.jumlahTiket > jumlahKursi){
            System.out.println("####### Pesanan #######");
            System.out.println("Penonton : " + "Nama = " + "'" + penonton.nama + "', " + "Nomor Identitas = " + penonton.nomorIdentitas + ", " + "Jenis Kelamin = " + "'" + penonton.jenisKelamin + "'");
            System.out.println("Keterangan : Tiket yang dibeli melebihi jumlah kursi");
            System.out.println();
            System.out.println("--------------------------------------------------------");
        }
        else {
            cetakTiket(penonton, pesanan);
        }

    }
    //untuk mencetak tiket
    public static void cetakTiket(Penonton penonton, Pesanan pesanan){
        System.out.println("####### Pesanan #######");
        System.out.println("Film : " + "Judul = " + "'" + pesanan.film.judul + "', " + "Durasi = " + pesanan.film.durasi + ", " + "Genre = " + "'" + pesanan.film.genre + "'");
        System.out.println("Studio : " + "Nomor Studio = " + "'" + pesanan.studio.nomor + "', " + "Jumlah Kursi = " + jumlahKursi + ", " + "Harga Tiket = " + "'" + harga + "'");
        System.out.println("Penonton : " + "Nama = " + "'" + penonton.nama + "', " + "Nomor Identitas = " + penonton.nomorIdentitas + ", " + "Jenis Kelamin = " + "'" + penonton.jenisKelamin + "'");
        System.out.println("Jumlah Tiket : " + pesanan.jumlahTiket);
        System.out.println("Total Harga : " + pesanan.totalHarga(pesanan));
        System.out.println();
        System.out.println("--------------------------------------------------------");

    }
}
