//PROBLEM: Print all the subsequences of a string.

public class Practice_Problem_7 {
    public static void printSubseq(String str, int idx, String res) {
        if (idx == str.length()) {
            if (res.length() > 0) { // Empty subsequence print na ho
                System.out.println(res);
            }
            return;
        }
        
        // Choose the character
        printSubseq(str, idx + 1, res + str.charAt(idx));
        
        // Don't choose the character
        printSubseq(str, idx + 1, res);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubseq(str, 0, "");
    }
}