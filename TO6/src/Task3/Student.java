package Task3;

import java.util.ArrayList;

//3.2 A subclass Student that inherits from Person
public class Student extends Person {

    //3.3 - Created two new arraylists passedCourses & currentCourses
    public ArrayList<String> passedCourses;
    public ArrayList<String> currentCourses;

    //3.2 - A Student constructor that calls the constructor from Person by using super
    //3.3 - An ArrayList (canTeach & currentCourses) has to be passed on as a parameter when the object is created
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    //3.4 - An override is being used on the method addCourse. The method adds a course to the ArrayList currentCourses. If the course is already there it will return false.
    @Override
    public boolean addCourse(String course) {
        if (!passedCourses.contains(course)) {
            return true;
        }
        currentCourses.add(course);
        return false;
    }
}
