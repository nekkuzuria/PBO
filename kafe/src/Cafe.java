import java.util.ArrayList;

public class Cafe {
//    Attribute
    private ArrayList<Special> daftarKopi = new ArrayList<>();
    private int id;
    private String name;

//    Constructor
    public Cafe(int id, String name) {
        this.id = id;
        this.name = name;
    }

//   Setter Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Special> getDaftarKopi() {
        return daftarKopi;
    }

    //    Method
    public void addKopi(Special kopi){
        this.daftarKopi.add(kopi);
    }
    public void beli(Customer cust, Special kopi){
        if(checkCustomer(cust, kopi)){
            kopi.addDataCustomer(cust);
            cust.setUang(cust.getUang() - kopi.getHarga());
            cetakInvoice(cust, kopi);
        }
        else{
            cetakGagalMembeli(cust, kopi);
        }
    }
    public void beliId(Customer cust, int id){
        for(Special kopi : daftarKopi){
            if(kopi.getId()==id) {
                if (checkCustomer(cust, kopi)) {
                    kopi.addDataCustomer(cust);
                    cust.setUang(cust.getUang() - kopi.getHarga());
                    cetakInvoice(cust, kopi);
                } else {
                    cetakGagalMembeli(cust, kopi);
                }
            }
        }
    }
    private boolean checkCustomer(Customer cust, Special kopi){
        if(!cust.isMaag() && cust.getUang()>=50000 && !kopi.getDataCustomer().contains(cust.getNama()) && kopi.getDataCustomer().size()<5) return true;
        else return false;
    }

    public void daftarRekomendasi(Customer cust){
        int state;

        System.out.println("Rekomendasi Untuk Anda:");
        for(Special kopi : daftarKopi){
            state=1;
            for(String kandungan : kopi.getKandungan()) {
                if (cust.getAlergi().contains(kandungan)) {
                    state=0;
                    break;
                }
            }
            if(state==1) {
                System.out.println(kopi.getNama());
            }
        }
    }
    private void cetakInvoice(Customer cust, Special kopi){
        System.out.println("##############");
        System.out.println("Cafe : " + this.name);
        System.out.println("Nama Pembeli : " + cust.getNama());
        System.out.println("Pembelian : " + kopi.getNama());
        System.out.println("Harga : " + kopi.getHarga());
        System.out.println("\n" + "Pembelian Sukses!");
        System.out.println("##############" + "\n");
    }

    private void cetakGagalMembeli(Customer cust, Special kopi){
        System.out.println("##############");
        System.out.println("Cafe : " + this.name);
        System.out.println("Nama Pembeli : " + cust.getNama());
        System.out.println("Pembelian : " + kopi.getNama());
        System.out.println("Harga : " + kopi.getHarga());
        System.out.println("\n" + "Maaf Pembelian Gagal!");
        System.out.println("##############" + "\n");
    }
}
