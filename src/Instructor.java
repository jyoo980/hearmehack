import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Instructor {

    private String name;
    private HashMap<Integer, Course> coursesTaught;

    public Instructor(String name) {
        this.name = name;
        coursesTaught = new HashMap<>();
    }

    // getters
    public String getName() { return name; }
    public HashMap<Integer, Course> getCoursesTaught() { return coursesTaught; }

    /**
     * Below is an example of really bad design, tell them why it's bad!
     * (The instructor could say nothing about getting assigned a course twice)
     * @param c
     */
    public void getAssigned(Course c) {
        coursesTaught.put()
    }

    /**
     * This is also a really bad practice, we have no idea if the professor
     * has successfully taught the course or not, make this better!
     * @param c
     */
    public void stopTeachingCourse(Course c) {
        coursesTaught.remove(c);
    }

    public double computeAverage(Course c) {
        double totalAverage = 0;
        for (Student s : )
    }


}
