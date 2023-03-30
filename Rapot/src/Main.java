public class Main {
    public static void main(String[] args) {
//        Membuat objek User
        User user1 = new User("Mamad", "student");
        User user2 = new User("Fajar", "student");
        User user3 = new User("Risang", "teacher");
        User user4 = new User("Rizal", "teacher");
        User user5 = new User("Dinar", "teacher");

//        Membuat objek rapot
        Rapot rapot1 = new Rapot(user1);
        Rapot rapot2 = new Rapot(user2);


//        SetNilai Mat Rapot1
        rapot1.setMat(user1, 80);
        System.out.println("Nilai Mat: " + rapot1.getMat());

        rapot1.setMat(user3, 80);
        System.out.println("Nilai Mat: " + rapot1.getMat());

        rapot1.setMat(user4, 85);
        System.out.println("Nilai Mat: " + rapot1.getMat());

        rapot1.setMat(user5, 85);
        System.out.println("Nilai Mat: " + rapot1.getMat());

//        cetakHistory Rapot1
        rapot1.cetakHistory();


//        SetNilai Fis Rapot2
        rapot2.setFis(user5, 25);
        System.out.println("Nilai Fis: " + rapot2.getFis());

        rapot2.setFis(user3, 80);
        System.out.println("Nilai Fis: " + rapot2.getFis());

        rapot2.setFis(user4, 85);
        System.out.println("Nilai Fis: " + rapot2.getFis());

        rapot2.setFis(user5, 85);
        System.out.println("Nilai Fis: " + rapot2.getFis());

//        cetakHistory Rapot2
        rapot2.cetakHistory();
    }
}