//PROBMEM: Print a string("A B C D") in reverse.

public class Practice_Problem_2 {
    public static void PrintRev(String str , int index) {
        // Base case: If we reach the first character (index 0), print it and return
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }

        // Recursive work: Print the current character
        System.out.print(str.charAt(index));

        // Recursive call: Move to the previous character (index - 1)
        PrintRev(str , index-1);
    }

    public static void main(String[] args) {
        String str = "A B C D";
        
        // Starting the recursion from the last index of the string
        PrintRev(str , str.length()-1);
    }    
}