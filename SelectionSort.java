public class SelectionSort {

    // Function to perform Selection Sort on an array of integers
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};

        // Calling the Selection Sort function
        selectionSort(arrayToSort);

        // Printing the sorted array
        System.out.println("Sorted array:");
        for (int value : arrayToSort) {
            System.out.print(value + " ");
        }
    }
}