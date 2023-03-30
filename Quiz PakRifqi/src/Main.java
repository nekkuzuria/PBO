public class Main {
    public static void main(String[] args) {
        Titik dot1 = new Titik(5,3);

        dot1.naik();
        dot1.naik();
        dot1.naik();
        dot1.kanan();
        dot1.kiri();
        dot1.kiri();
        dot1.turun();
        System.out.println("Koordinat titik : " + dot1.toString());

        dot1.setX(-1);
        System.out.println("X : " + dot1.getX());
        dot1.setY(15);
        System.out.println("Y : " + dot1.getY());
        System.out.println("Koordinat titik : " + dot1.toString());
    }
}