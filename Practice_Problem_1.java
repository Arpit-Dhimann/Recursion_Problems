//PROBLEM: Tower of Hanoi - Transfer n disks from source to destination over 3 towers.

public class Practice_Problem_1 {
    // Base case: only 1 disk left — directly move it
    public static void TowerOfHanoi(int n, String src, String helper, String dest ) {
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        
        // Step 1: Move n-1 disks from src to helper
        // dest acts as middle (helping tower)
        TowerOfHanoi(n-1 , src , dest , helper);

        // Step 2: Move the largest disk from src to dest
         // src acts as middle (helping tower)
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Step 3: Move n-1 disks from helper to dest
        TowerOfHanoi(n-1 , helper , src , dest);
    }

    public static void main(String[] args) {
        // Number of disks
        int n = 3;

         // S = Source, H = Helper, D = Destination
        TowerOfHanoi(n, "S" , "H" , "D");
    }
}