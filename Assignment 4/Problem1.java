// Implementation of method overloading with respect to parameter number, parameter data type.

public class Problem1
{
    // Method with two parameters
    public int add(int a, int b)
    {
        return a+b;
    }
    //  Method with three parameters
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        System.out.println("Sum of two numbers: " +obj.add(2,3));   // calling the method with two parameters
        System.out.println("Sum of three numbers: " +obj.add(2,3,5));// calling the method with three parameters
    }
}