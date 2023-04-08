public class Main {
    public static void main(String[] args) {
//        Membuat Objek Karyawan
        FullTimeEmployee ina = new FullTimeEmployee("Ina", 5000000, 0.025, 0.2);
        FullTimeEmployee eko = new FullTimeEmployee("Eko", 3500000, 0.025, 0.2);
        Contractor adi = new Contractor("Adi", 40000, 0.025, 80);

//        Cetak Rincian
        ina.getRincian();
        eko.getRincian();
        adi.getRincian();
    }
}