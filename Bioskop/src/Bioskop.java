import java.util.ArrayList;

public class Bioskop {
//   == Attribute ==
    public static String nama;
    public static String alamat;
    public static ArrayList <Film> daftarFilm = new ArrayList<Film>();

//   == Constructor ==
    public Bioskop(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

//   == Method ==
    //untuk menambahkan film ke dalam arrayList
    void tambahFilm(Film film){
        daftarFilm.add(film);
    }

    //untuk menampilkan informasi bioskop
    public static void getBioskop(Bioskop bioskop){
        System.out.println("Nama Bioskop : " + bioskop.nama);
        System.out.println("Alamat Bioskop : " +  bioskop.alamat);
        System.out.print("Daftar Film : ");
        for(Film item : daftarFilm){
            System.out.print("; " + item.judul);
        }
        System.out.println();
    }



}
