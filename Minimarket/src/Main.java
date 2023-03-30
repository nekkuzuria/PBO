public class Main {
    public static void main(String[] args) {
//        Membuat objek minimarket
        Minimarket mirota = new Minimarket("Mirota");

//        Membuat objek barang
        Barang energen_cokelat = new Barang("ECK", 3000, 200, "Energen Cokelat");
        Barang energen_vanila = new Barang("EVN", 3000, 0, "Energen Vanila");
        Barang energen_taro = new Barang("ETR", 3000, 0, "Energen Taro");
        Barang energen_kurma = new Barang("EKR", 3000, 120, "Energen Kurma");
        Barang pucuk_harum = new Barang("PHR", 3000, 110, "Pucuk Harum");
        Barang milku_cokelat = new Barang("MCK", 3000, 0, "Milku Cokelat");
        Barang milku_stroberi = new Barang("MST", 3000, 0, "Milku Stroberi");
        Barang cheetos = new Barang("CHT", 5000, 210, "Cheetos");
        Barang oreo = new Barang("ORE", 7000, 843, "Oreo");
        Barang chocolatos = new Barang("CHO", 500, 532, "Chocolatos");
        Barang bengbeng = new Barang("BNG", 2500, 0, "Beng Beng");

//        Tambah barang ke market
        mirota.tambahBarang(energen_cokelat);
        mirota.tambahBarang(energen_vanila);
        mirota.tambahBarang(energen_taro);
        mirota.tambahBarang(energen_kurma);
        mirota.tambahBarang(pucuk_harum);
        mirota.tambahBarang(milku_cokelat);
        mirota.tambahBarang(milku_stroberi);
        mirota.tambahBarang(cheetos);
        mirota.tambahBarang(oreo);
        mirota.tambahBarang(chocolatos);
        mirota.tambahBarang(bengbeng);


//        Tampilkan barang yang perlu di-restock
        mirota.perluRestockBarang();

//        Search barang
        mirota.cariBarang("energen");
        mirota.cariBarang("milku");
        mirota.cariBarang("chitato");

//        Total harga barang dengan diskon
        energen_cokelat.setDiskon(50);
        mirota.totalHarga("ECK", 40);


    }
}