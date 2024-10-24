package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //3.6 - An ArrayList with 3 courses added to it
        ArrayList<String> passedCoursesStudent1 = new ArrayList<>();
        passedCoursesStudent1.add("Math");
        passedCoursesStudent1.add("English");
        passedCoursesStudent1.add("Java 1.0");

        //3.6 - An ArrayList with 2 courses added to it
        ArrayList<String> passedCoursesStudent2 = new ArrayList<>();
        passedCoursesStudent2.add("Biology");
        passedCoursesStudent2.add("History");


        //3.6 - An ArrayList with 3 courses added to it
        ArrayList<String> canTeachTeacher1 = new ArrayList<>();
        canTeachTeacher1.add("Math");
        canTeachTeacher1.add("Physics");
        canTeachTeacher1.add("Java 1.0");

        //3.6 - An ArrayList with 2 courses added to it
        ArrayList<String> canTeachTeacher2 = new ArrayList<>();
        canTeachTeacher2.add("History");
        canTeachTeacher2.add("English");

        //3.6 Two new student objects created
        Student student1 = new Student("Alice", passedCoursesStudent1);
        Student student2 = new Student("Bob", passedCoursesStudent2);

        //3.6 Two new teacher objects created
        Teacher teacher1 = new Teacher("Roger", canTeachTeacher1);
        Teacher teacher2 = new Teacher("Mike", canTeachTeacher2);

        //3.6 An ArrayList that contains student and teacher objects
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        //3.7 - Adding different courses to the objects. If the object already has the course it will return false
        System.out.println("Testing course addition:");
        System.out.println("Alice adding Physics: " + student1.addCourse("Physics"));
        System.out.println("Alice adding Math: " + student1.addCourse("Math"));
        System.out.println("Bob adding History: " + student2.addCourse("History"));
        System.out.println("Roger adding Math: " + teacher1.addCourse("Math"));
        System.out.println("Mike adding Biology: " + teacher2.addCourse("Biology"));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        //3.7 - A for-loop that tries to add the course "Java 1.0" to all the object in the ArrayList persons
        //3.7 - If the course cant be added to an object it will return with a reply depending on if the object is a teacher or student
        System.out.println("Attempting to add 'Java 1.0' to all persons:");
        for (Person person : persons) {
            boolean added = person.addCourse("Java 1.0");
            if (!added) {
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan allerede undervise i dette fag.");
                }
            } else {
                System.out.println(person.getName() + " successfully added 'Java 1.0'.");
            }
        }
    }
}
