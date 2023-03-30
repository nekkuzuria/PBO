import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek item belanjaan dengan parameter nama dan harga
        Belanjaan bayam = new Belanjaan("bayam", 2000);
        Belanjaan bawang = new Belanjaan("bawang", 3000);
        Belanjaan tempe = new Belanjaan("tempe", 5000);
        Belanjaan beras = new Belanjaan("beras", 20000);
        Belanjaan ayam = new Belanjaan("ayam", 20000);
        Belanjaan minyak = new Belanjaan("minyak", 15000);
        Belanjaan cabai = new Belanjaan("cabai", 6000);

        // Membuat list belanja yang berisi item yang akan dibeli
        ArrayList<Belanjaan> listBelanja = new ArrayList<Belanjaan>();
        listBelanja.add(cabai);
        listBelanja.add(ayam);
        listBelanja.add(bawang);
        listBelanja.add(tempe);
        listBelanja.add(beras);

        // Membuat objek Dina dengan parameter nama, uang, dan listBelanja yg telah dibuat
        Person dinaObj = new Person("Dina", 50000, listBelanja);

        //Dina tidak jadi beli cabai
        dinaObj.hapus(cabai);

        // Pembelian yang dilakukan Dina dengan parameter berupa objek dalam class Belanjaan
        dinaObj.beli(bayam);
        dinaObj.beli(bawang);
        dinaObj.beli(tempe);
        dinaObj.beli(beras);
        dinaObj.beli(ayam);
        dinaObj.beli(minyak);

        // Print catatan, total belanja, dan keterangan uang
        dinaObj.catatan();
        dinaObj.total_belanja();
        dinaObj.keterangan_uang();

    }
}