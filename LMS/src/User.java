import java.util.ArrayList;

public class User {
//    Attribute=================
    private String nama;
    private String id;
    private String username;
    private String pwd;
    ArrayList<Course> enteredCourse;

//    Constructor=============
    User(String nama, String id){
        this.nama = nama;
        this.id = id;
        enteredCourse = new ArrayList<>();
    }

//    Setter Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ArrayList<Course> getEnteredCourse() {
        return enteredCourse;
    }

    public void setEnteredCourse(ArrayList<Course> enteredCourse) {
        this.enteredCourse = enteredCourse;
    }

//    Method=================
    void joinCourse(Course course){
        this.enteredCourse.add(course);
    }
}
