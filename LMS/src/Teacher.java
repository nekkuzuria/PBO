import java.util.ArrayList;

public class Teacher extends User {
//    Attribute=================
    private ArrayList<Course> createdCourse;

//    Constructor=====================
    Teacher(String nama, String id){
        super(nama, id);
        this.createdCourse = new ArrayList<>();
    }

//    Setter Getter

    public ArrayList<Course> getCreatedCourse() {
        return createdCourse;
    }

    public void setCreatedCourse(ArrayList<Course> createdCourse) {
        this.createdCourse = createdCourse;
    }
    
//    Method
    void createCourse(Course course){
        this.createdCourse.add(course);
    }
}
