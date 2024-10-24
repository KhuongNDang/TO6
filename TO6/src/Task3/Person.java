package Task3;

//3.1 - A class Person
public abstract class Person {

    String name;

    //3.1 - Constructor with one parameter name
    public Person(String name) {
        this.name = name;
    }

    //3.1 - A getter method that returns name
    public String getName() {
        return name;
    }

    //3.1 - A setter method that returns name
    public void setName(String name) {
        this.name = name;
    }

    //3.1 - A method addCourse that doesnt have a method signature
    public abstract boolean addCourse(String course);


}

