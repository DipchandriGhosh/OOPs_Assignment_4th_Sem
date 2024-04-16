// Write a program to define a class Probelm12 having data members numerator and
// denominator. Initialize three objects using different constructors and display its
// Probelm12al value.

public class Probelm12 {
    private int numerator;
    private int denominator;

    // Constructor with numerator and denominator parameters
    public Probelm12(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Constructor with only numerator parameter (denominator defaults to 1)
    public Probelm12(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    // Constructor with no parameters (numerator and denominator both default to 1)
    public Probelm12() {
        this.numerator = 1;
        this.denominator = 1;
    }

    // Method to display the Probelm12al value
    public void displayProbelm12() {
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        // Create three objects of Probelm12 class using different constructors
        Probelm12 Probelm121 = new Probelm12(3, 4); // Probelm12 with numerator 3 and denominator 4
        Probelm12 Probelm122 = new Probelm12(5);    // Probelm12 with numerator 5 and denominator 1
        Probelm12 Probelm123 = new Probelm12();     // Probelm12 with numerator 1 and denominator 1

        // Display Probelm12al values of the three Probelm12s
        System.out.print("Probelm12 1: ");
        Probelm121.displayProbelm12(); // Output: 3/4

        System.out.print("Probelm12 2: ");
        Probelm122.displayProbelm12(); // Output: 5/1

        System.out.print("Probelm12 3: ");
        Probelm123.displayProbelm12(); // Output: 1/1
    }
}
