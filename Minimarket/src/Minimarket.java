import java.util.ArrayList;

public class Minimarket {
//    Attribute=============
    ArrayList<Barang> listBarang;
    private String nama;

//    Constructor===========
    Minimarket(){
        listBarang = new ArrayList<>();
    }
    Minimarket(String nama){
        this.nama = nama;
        listBarang = new ArrayList<>();
    }

//    Method==============
    void tambahBarang(Barang barang){
        this.listBarang.add(barang);
    }
    void cekKetersediaanBarang(String id){
        for(Barang barang : listBarang){
            if(barang.id == id){
                if(barang.barangTersedia()) {
                    System.out.println("Barang dengan id='" + id + "' Tersedia!");
                    System.out.println("=====================");
                    System.out.println();
                    break;
                }
            }
            else{
                System.out.println("Barang dengan id='" + id + "' Habis!");
                System.out.println("=====================");
                System.out.println();
            }
        }
    }
    void perluRestockBarang(){
        System.out.println("Barang Yang Perlu Di-Restock :");
        for(Barang barang : listBarang){
            if(!barang.barangTersedia()) System.out.println("- " + barang.getNama());
        }
        System.out.println("=====================");
        System.out.println();
    }
    void cariBarang(String keyword){
        boolean ada = false;
        keyword = keyword.toLowerCase();
        System.out.println("Barang dengan keyword '" + keyword + "' :");
        for(Barang barang : listBarang){
            if(barang.getNama().contains(keyword)) {
                ada = true;
                System.out.println("- " + barang.getNama());
            }
        }
        if(!ada) System.out.println("Barang Tidak Ada");
        System.out.println("=====================");
        System.out.println();
    }
    void totalHarga(String id, int jumlahBarang){
        float totalHarga = 0;
        for(Barang barang : listBarang){
            if(barang.id==id){
                totalHarga = (barang.getHarga() - barang.getDiskon()/100 * barang.getHarga()) * jumlahBarang;
                break;
            }
        }
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("=====================");
        System.out.println();
    }
    void beliBarang(String id, int jumlahBarang){
        for(Barang barang : listBarang){
            if(barang.id==id){
                barang.setStok(barang.getStok() - jumlahBarang);
                break;
            }
        }
    }
    void restockBarang(String id, int jumlahBarang){
        for(Barang barang : listBarang){
            if(barang.id==id){
                barang.setStok(barang.getStok() - jumlahBarang);
                break;
            }
        }
    }
    public String getNama() {
        return nama;
    }
}
