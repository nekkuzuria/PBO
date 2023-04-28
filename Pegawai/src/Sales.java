public class Sales extends Pegawai {
//    Attribute===================
    private int targetPenjualan;
    private int jmlPenjualan;
    private int bonus;

//    Constructor
    Sales(String nip, String nama, String jenisKelamin){
        super(nip, nama, jenisKelamin);
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

    @Override
    public void setNip(int urutanMasuk){
        this.setNip("S"+urutanMasuk);
    }
    @Override
    public int getGaji() { return super.getGaji() + this.bonus; }

    @Override
    public int getThr() {
        if(this.getJmlPenjualan()>=this.getTargetPenjualan()) {
            return this.getGaji() * 2;
        }
        else{
            return this.getGaji() ;
        }
    }

    //    Method
    @Override
    public boolean checkNip(String nip){
        if(nip.charAt(0) == 'S') return true;
        else return false;
    }
}
