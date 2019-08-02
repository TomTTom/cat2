package gym.demo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;




public class Courses {


    private Long id;


    private String courseName;

    private String courseDesciption;

    //    Create a relationship between a course and a university
//  Use the id to join the tables together
// When you create a course you have to provide a university_id
//    Spring will take the university obj, pick its id

    private University university;


    private int maximumEnrollment = 100;



    //    Constructor
    public Courses(String courseName) {
        this.courseName = courseName;

    }

    //   Create a private constructor
    private Courses() {
    }

    //    Create your getters and setters



    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseDesciption='" + courseDesciption + '\'' +
                ", university=" + university +
                ", maximumEnrollment=" + maximumEnrollment +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;


    }}
