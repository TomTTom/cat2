package gym.demo;
import javax.persistence.*;
public class Student {

    private  Long id;


    private String studentName;

    private int student_Number;



    public Student(String studentName, int student_Number, long id) {
        this.studentName = studentName;
        this.student_Number= student_Number;
        this.id=id;

    }
    private Student(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudent_Number() { return student_Number; }
    public void setStudent_Number(int student_Number) { this.student_Number = student_Number; }
}
