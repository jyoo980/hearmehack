import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Course {

    private String courseName;
    private int sectionCode;
    private Instructor prof;
    private List<Student> currentlyEnrolled;
    private List<Student> waitListed;

    public Course(String courseName, int sectionCode, Instructor prof) {
        this.courseName = courseName;
        this.sectionCode = sectionCode;
        this.prof = prof;
        currentlyEnrolled = new ArrayList<>();
        waitListed = new LinkedList<>();
    }

}
