public class Pesanan {
//   == Attribute ==
    Film film;
    Studio studio;
    static int jumlahTiket;
    Bioskop bioskop;

//    == Constructor ==
    Pesanan(Bioskop bioskop, Film film, Studio studio, int jumlahTiket){
        this.bioskop = bioskop;
        this.film = film;
        this.studio = studio;
        this.jumlahTiket = jumlahTiket;
    }


//   == Method ==
    //untuk menghitung total harga
    public static int totalHarga(Pesanan pesanan){
        return jumlahTiket * pesanan.studio.hargaTiket;
    }

}
