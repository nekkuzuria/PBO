public class Main {
    public static void main(String[] args) {
//        == Membuat objek Bioskop, Film, dan Studio ==
        Bioskop lk21 = new Bioskop("LayarKaca21", "Jl. Jalan Denganmu");
        Film avengers = new Film("Avengers: Endgame", 181, "Action/Adventure");
        Film joker = new Film("Joker", 122, "Crime/Drama");
        Studio studio1 = new Studio(1, 50, 50000);
        Studio studio2 = new Studio(2, 30, 40000);

//        == Menambah film ke Bioskop ==
        lk21.tambahFilm(avengers);
        lk21.tambahFilm(joker);

//        == Membuat objek penonton Mamad dan mengisi data penonton ==
        Penonton mamadObj = new Penonton("Mamad", 123456789, 'L');
        mamadObj.pesan(mamadObj, lk21, avengers, studio1, 2);

//        == Membuat objek penonton Akbar dan mengisi data penonton ==
        Penonton akbarObj = new Penonton("Akbar", 987654321, 'L');
        akbarObj.pesan(akbarObj, lk21, joker, studio2, 3);


    }
}