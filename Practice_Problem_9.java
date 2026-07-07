//PROBLEM: Print keypad combination
// ( 0 -> .;
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz
// )

public class Practice_Problem_9 {
    
    public static final String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombination(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.println(res);
            return;
        }

        String mapping = keypad[number.charAt(idx) - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printKeypadCombination(number, idx + 1, res + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String number = "23";
        printKeypadCombination(number, 0, "");
    }
}