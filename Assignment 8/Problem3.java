// Exception CASE-3: Exception creates but not handled

public class Problem3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        // Trying to access an element that doesn't exist
        System.out.println("Element at index 3: " + numbers[3]);
    }
}
