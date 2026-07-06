//PROBLEM: Check if an array is sorted (strictly increasing).

public class Practice_Problem_4 {
    public static boolean isSorted(int[] arr, int index) {
        // Base case: If we have reached the last index, it means the array is sorted
        if (index == arr.length-1) {
            return true;
        }
        // Check if the current element is smaller than the next element
        if (arr[index] < arr[index + 1]) {
            // If true, recursively check the next pair
            return isSorted(arr , index + 1);
        }
        else {
            // If the current element is >= next element, the array is not sorted
            return false;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        // Call the function starting from the first index (0) and print the result
        System.out.println(isSorted(arr, 0));
    }
}