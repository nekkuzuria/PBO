import java.util.ArrayList;

public class Rapot {
//    Attribute
    private int mat;
    private int fis;
    private int kim;
    private int bio;
    private User user;
    private ArrayList<Character> history = new ArrayList<>();

//    Constructor
    public Rapot(User user) {
        this.user = user;
    }


//    Setter Getter
    public void setMat(User user, int nilai){
        char hurufAwal = Character.toLowerCase(user.getNama().charAt(0));
        if(user.getRole()=="teacher" && !history.contains(hurufAwal)) {
            this.mat = nilai;
            history.add(hurufAwal);
        }
        else{
            System.out.println("Maaf, Anda tidak bisa mengubah nilai!");
        }
    }
    public int getMat() {
        return this.mat;
    }
    public void setFis(User user, int nilai){
        char hurufAwal = Character.toLowerCase(user.getNama().charAt(0));
        if(user.getRole()=="teacher" && !history.contains(hurufAwal)) {
            this.fis = nilai;
            history.add(hurufAwal);
        }
        else{
            System.out.println("Maaf, Anda tidak bisa mengubah nilai!");
        }
    }
    public int getFis() {
        return this.fis;
    }
    public void setKim(User user, int nilai){
        char hurufAwal = Character.toLowerCase(user.getNama().charAt(0));
        if(user.getRole()=="teacher" && !history.contains(hurufAwal)) {
            this.kim = nilai;
            history.add(hurufAwal);
        }
        else{
            System.out.println("Maaf, Anda tidak bisa mengubah nilai!");
        }
    }
    public int getKim() {
        return this.kim;
    }
    public void setBio(User user, int nilai){
        char hurufAwal = Character.toLowerCase(user.getNama().charAt(0));
        if(user.getRole()=="teacher" && !history.contains(hurufAwal)) {
            this.bio = nilai;
            history.add(hurufAwal);
        }
        else{
            System.out.println("Maaf, Anda tidak bisa mengubah nilai!");
        }
    }
    public int getBio() {
        return this.bio;
    }
    public User getUser() {
        return user;
    }

//    Method
    public void cetakHistory(){
        System.out.print("History Huruf Awal Guru Update Nilai : ");
        for(Character karakter : this.history){
            System.out.print(karakter + " ");
        }
        System.out.println();
    }
}
