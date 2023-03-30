public class Sales extends Pegawai {
//    Attribute===================
    private int targetPenjualan;
    private int jmlPenjualan;
    private int bonus;

//    Constructor
    Sales(String nip, String nama){
        super(nip, nama);
    }

//    Setter Getter

    public int getTargetPenjualan() {
        return targetPenjualan;
    }

    public void setTargetPenjualan(int targetPenjualan) {
        this.targetPenjualan = targetPenjualan;
    }

    public int getJmlPenjualan() {
        return jmlPenjualan;
    }

    public void setJmlPenjualan(int jmlPenjualan) {
        this.jmlPenjualan = jmlPenjualan;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
