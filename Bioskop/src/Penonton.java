public class Penonton {
//   == Attribute ==
    String nama;
    int nomorIdentitas;
    char jenisKelamin;


//   == Constructor ==
    public Penonton(String nama, int nomorIdentitas, char jenisKelamin) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.jenisKelamin = jenisKelamin;
    }

//   == Method ==
    //untuk melakukan pesanan penonton
    void pesan(Penonton penonton, Bioskop bioskop, Film film, Studio studio, int jumlahTiket){
        Pesanan pesanan = new Pesanan(bioskop, film, studio, jumlahTiket);
        Tiket.tambahPesanan(penonton, pesanan);
    }

    //untuk mendapatkan informasi bioskop penonton
    void getBioskop(Bioskop bioskop){
        Bioskop.getBioskop(bioskop);
    }

}
