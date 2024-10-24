package Task1;

public class Letters {

        //1.1 - 1.4 Four methods that prints out different letters depending on how they are called
    public void methodA(String input) {
        System.out.println("j");
        if (input.equals("start")) {
            System.out.println("a");
            System.out.println("v");
        } else {
            System.out.println("d");
            System.out.println(methodC(input));

        }
        System.out.println("a");
    }

    public void methodB(String start) {
        System.out.println(" ");
    }

    public boolean methodC(String input) {
        System.out.println("e");
        return true;
    }

    public void methodD(int number) {
        System.out.println("r");
        methodB("start");
        if (number > 5) {
            System.out.println("s");
            System.out.println("j");
            System.out.println("o");
            System.out.println("v");
        }

    }
}
