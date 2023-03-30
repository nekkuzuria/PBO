public class Lingkaran
{
//    Attribute======================
    private int r;
    private double phi;

//    Constructor====================
    Lingkaran(){
        phi = 3.14;
    }

//    Method=========================
    double hitungLuas() {return phi*r*r;}
    double hitungKelililng() {return 2*phi*r;}
    public int getR() {return r;}
    public void setR(int r) {
        if(r>=0) this.r = r;
        else this.r = Math.abs(r);
    }

}
