// Exception CASE-1: Problem without exception handling

public class Problem1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b; // Division by zero will cause an ArithmeticException
        System.out.println("Result: " + result);
    }
}
