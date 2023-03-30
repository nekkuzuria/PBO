import java.util.ArrayList;

public class Person {
    //    Attribute
    String nama;
    private ArrayList<Belanjaan> catatan = new ArrayList<Belanjaan>();
    int uang;

    //    Constructor
    Person(String nama, int uang, ArrayList<Belanjaan> catatan){
        this.nama = nama;
        this.uang = uang;
        this.catatan = catatan;
    }

    //  Method
    void catatan(){
        for (Belanjaan item : catatan) {
            System.out.print(item.getNama() + " ");
        }
        System.out.println();
    }
    void hapus(Belanjaan barang){
        catatan.remove(barang);
    }
    void beli(Belanjaan barang){
        if(!catatan.contains(barang)) catatan.add(barang);
        uang -= barang.getHarga();
    }
    void total_belanja(){
        int total_belanja = 0;
        for(Belanjaan item : catatan){
            total_belanja += item.getHarga();
        }
        System.out.println(total_belanja);
    }
    void keterangan_uang(){
        if(uang<0){
            System.out.println("Uang kurang");
        }
        else if(uang==0){
            System.out.println("Uang pas");
        }
        else{
            System.out.println("Uang lebih");
        }
    }



}
