import java.util.ArrayList;

public class CoffeShop {
//    Attribute
    private String name;
    private ArrayList<Coffee> listCoffee = new ArrayList<>() ;
    private ArrayList<Latte> listLatte = new ArrayList<>();



//    Constructor
    public CoffeShop(String name) {
        this.name = name;
    }

//    Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Method
    public void addCoffe(Coffee kopi){
        listCoffee.add(kopi);
    }
    public void addLatte(Latte kopi){
        listLatte.add(kopi);
    }
    public String canBuyCoffee(Customer cust){
        if(checkCustomer(cust)){
            return cust.getNama() + " bisa membeli kopi";
        }
        else{
            return cust.getNama() + " tidak bisa membeli kopi";
        }
    }
    public void recommendDrink(Customer cust) {
        if (cust.isHasMaag()) {
            System.out.println(cust.getNama() + ", sayangi lambung Anda!");
        } else {
            System.out.println("Berikut rekomendasi minuman untuk " + cust.getNama() + " :");
            boolean boleh;
            for (Latte kopi : listLatte) {
                boleh = true;
                for (String alergi : cust.getAlergi()) {
                    if (kopi.getIngredients().contains(alergi)) {
                        boleh = false;
                        break;
                    }
                }
                if(boleh){
                    System.out.println(kopi.getName());
                }
            }
        }
    }
    public void buy(Coffee kopi, Customer cust, int total){
        if(kopi.getKuota()<3){
            kopi.addPembeli(cust);
            kopi.setKuota(kopi.getKuota()+1);
            System.out.println(cust.getNama() + " berhasil membeli " + kopi.getName() );
            total -= 1;
            if(total>0) this.buy(kopi, cust, total);
        }
        else{
            System.out.println(cust.getNama() + " gagal membeli karena kuota pembelian produk " + kopi.getName() + " sudah habis");
        }
    }
    public void printAllBuyers(Coffee kopi){
        System.out.println("Berikut riwayat pembeli kopi " + kopi.getName() + " :");
        for(Customer cust : kopi.getListPembeli()){
            System.out.println(cust.getNama());
        }
    }
    private boolean checkCustomer(Customer cust){
        if(!cust.isHasMaag() && cust.getUang()>=50000) return true;
        else return false;
    }
}
