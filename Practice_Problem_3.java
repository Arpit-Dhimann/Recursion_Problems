//PROBLEM: Find the occurrence of the first and last occurrence of an element using recursion.

public class Practice_Problem_3 {
    // Static variables allow us to track indices across multiple recursive function calls
    public static int First = -1;
    public static int Last = -1;

    public static void FindOccurance(String str, int index, char element){
        // Base Case: Stop recursion when we have traversed the entire string
        if (index == str.length()) {
            System.out.println("First '" + element + "' at index " + First);
            System.out.println("Last '" + element + "' at index " + Last);
            return;
        }

        // Extract the character at the current position
        char currChar  = str.charAt(index);
        if(currChar == element){
            // If First is still -1, this is the very first occurrence
            if (First == -1) {
                First = index;
            }
            // If First is already found, this must be a subsequent occurrence
            else {
                Last = index;
            }
        }
        // Recursive step: Move to the next index
         FindOccurance(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaaefaahb";
        char element = 'a';

        // Start the recursion from index 0
        FindOccurance(str, 0, element);
    }
}