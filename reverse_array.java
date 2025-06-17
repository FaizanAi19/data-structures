import java.util.Stack;

public class reverse_array {
    public static void main(String[] args) {
        // Original array
        int[] array = {10, 20, 30, 40, 50};

        // Display the original array
        System.out.println("Original Array:");
        printArray(array);

        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all elements of the array into the stack
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);  // pushing elements on top of the stack
        }

        // Step 2: Pop all elements from the stack and put them back into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();  // popping from stack (LIFO) and updating array
        }

        // Display the reversed array
        System.out.println("Reversed Array:");
        printArray(array);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();  // move to the next line after printing the array
    }
}
