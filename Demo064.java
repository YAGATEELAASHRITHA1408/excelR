public class Demo064 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array

        // Display the original array
        System.out.println("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        
        // Swap the first and last elements
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        // Display the array after swapping
        System.out.println("\nArray after swapping first and last elements: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}