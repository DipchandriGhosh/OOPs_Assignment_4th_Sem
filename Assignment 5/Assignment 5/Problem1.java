// Write a java program to implement the static keyword in java.

public class Problem1 {
    static int staticVariable = 10;

    static void staticMethod() {
        System.out.println("Static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable: " + Problem1.staticVariable);
        Problem1.staticMethod();

        Problem1.staticVariable = 20;
        System.out.println("Modified static variable value: " + Problem1.staticVariable);

        System.out.println("Accessing static variable again: " + Problem1.staticVariable);
        Problem1.staticMethod();
    }
}
