// Consider a Student examination database system that prints the mark sheet of students.
// Input the following from the command line.
// (a) Student’s Name
// (b) Marks in six subjects
// These marks should be between 0 to 50. If the marks are not in the specified range, raise
// a RangeException, else find the total marks and prints the percentage of the students.


// Custom exception class for handling range exceptions
class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

// Class representing a Student
class Student {
    private String name;
    private int[] marks = new int[6];

    // Constructor to initialize name and marks
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        int totalMarks = calculateTotalMarks();
        return (totalMarks * 100.0) / (marks.length * 50);
    }

    // Method to validate marks range
    public void validateMarksRange() throws RangeException {
        for (int mark : marks) {
            if (mark < 0 || mark > 50) {
                throw new RangeException("Marks should be between 0 to 50");
            }
        }
    }

    // Method to display mark sheet
    public void displayMarkSheet() {
        System.out.println("Name: " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

// Main class
public class Problem10 {
    public static void main(String[] args) {
        try {
            // Input student name and marks from command line arguments
            String name = args[0];
            int[] marks = new int[6];
            for (int i = 0; i < 6; i++) {
                marks[i] = Integer.parseInt(args[i + 1]);
            }

            // Create a Student object
            Student student = new Student(name, marks);

            // Validate marks range
            student.validateMarksRange();

            // Display mark sheet
            student.displayMarkSheet();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide name and marks for all subjects.");
        } catch (NumberFormatException e) {
            System.out.println("Marks should be integers.");
        } catch (RangeException e) {
            System.out.println("RangeException: " + e.getMessage());
        }
    }
}
