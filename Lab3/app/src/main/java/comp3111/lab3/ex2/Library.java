package comp3111.lab3.ex2;

public class Library {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Library().getGreeting());
    }
}
