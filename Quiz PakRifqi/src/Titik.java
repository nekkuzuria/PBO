public class Titik {
//    Attribute
    private double x;
    private double y;

//    Constructor
    public Titik(){
        x = 0;
        y = 0;
    }
    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }

//    Method
    public void setX(double x) { this.x = x; }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void naik(){ y+=1; }
    public void kanan(){
        x+=1;
    }
    public void turun(){
        y-=1;
    }
    public void kiri(){ x-=1; }
    public String toString() { return ("(" +x+ " , " +y+ ")"); }
}
