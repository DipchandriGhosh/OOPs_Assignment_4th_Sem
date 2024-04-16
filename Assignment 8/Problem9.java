// Create a user-defined exception named CheckArgument to check the number of
// arguments passed through the command line. If the number of argument is less than 5,
// throw the CheckArgumentexception,else print the addition of all the five numbers.

// User-defined exception CheckArgumentException
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

// Main class
public class Problem9 {
    public static void main(String[] args) {
        try {
            // Check the number of command line arguments
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments passed.");
            }

            // Convert command line arguments to integers and calculate their sum
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }

            // Print the sum of all arguments
            System.out.println("Sum of all arguments: " + sum);
        } catch (CheckArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid argument format.");
        }
    }
}
