public class Main {
    public static void main(String[] args) {
//        Buat Objek Cafe
        Cafe cafe1 = new Cafe(1, "Starbucks");

//        Buat Objek Customer
        Customer cust1 = new Customer(1, "Fajar", false, 30000);
        Customer cust2 = new Customer(2, "Wisnu", false, 70000);
        Customer cust3 = new Customer(3, "Akhsan", true, 20000);
        Customer cust4 = new Customer(4, "Dhika", false, 200000);


//        Menambah data alergi Customer
        cust1.addAlergi("coklat");
        cust1.addAlergi("kacang");

//        Buat Objek Kopi
        Latte latte1 = new Latte(cafe1, 1, "Peanut Butter Latte", 40000, "small", 1, "butiran kacang");
        Latte latte2 = new Latte(cafe1, 2, "Oatmilk Latte", 50000, "small", 1, "coklat bubuk");
        Latte latte3 = new Latte(cafe1, 3, "Caramel Latte", 35000, "medium", 1.5F, "karamel");
        Special spc1 = new Special(4, "Espresso", 20000, cafe1);
        Special spc2 = new Special(5, "Americano", 25000, cafe1);

//        Menambah kandungan kopi
        latte1.addKandungan("laktosa");
        latte1.addKandungan("kacang");
        latte2.addKandungan("kacang");
        latte2.addKandungan("coklat");
        latte3.addKandungan("laktosa");

//        Melakukan pembelian
        cafe1.beli(cust1, latte1);
        cafe1.beli(cust2, latte3);
        cafe1.beli(cust3, spc2);
        cafe1.beliId(cust2, 4);
        cafe1.beliId(cust4, 5);

//        Menampilkan Rekomendasi
        cafe1.daftarRekomendasi(cust1);

    }
}