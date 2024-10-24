package Task3;

import java.util.ArrayList;

//A subclass Teacher that inherits from Person
public class Teacher extends Person {

    //3.3 - Created two new arraylists canTeach & currentCourses
    public ArrayList<String> canTeach;
    public ArrayList<String> currentCourses;

    //A Teacher constructor that calls the constructor from Person by using super
    //3.3 - An ArrayList (canTeach & currentCourses) has to be passed on as a parameter when the object is created
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }
    //3.4 - An override is being used on the method addCourse. The method adds a course to the ArrayList currentCourses. If the course is already there it will return false.
    @Override
    public boolean addCourse(String course) {
        if (!canTeach.contains(course)) {
            return true;
        }
        canTeach.add(course);
        return false;
    }
}
