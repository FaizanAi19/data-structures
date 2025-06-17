public class RecursiveArraySum {

    // Recursive function to calculate sum of array elements
    public static int recursiveSum(int[] array, int index) {
        // Base case = if index is out of bounds, return 0
        if (index == array.length) {
            return 0;
        }

        // Recursive case: current element + sum of the rest
        return array[index] + recursiveSum(array, index + 1);
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 10, 15, 20, 25};

        // Call recursive sum method starting from index 0
        int total = recursiveSum(numbers, 0);

        // Display the result
        System.out.println("Sum of array elements: " + total);
    }
}
