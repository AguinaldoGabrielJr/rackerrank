package hackerrank;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int compareTo = A.compareTo(B);
        int lengthA = A.length();
        int lengthB = B.length();
        
        System.out.println(lengthA + lengthB);
        if (compareTo > 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        System.out.print(A.substring(0,1).toUpperCase()+ A.substring(1) + " ");
        System.out.println(B.substring(0,1).toUpperCase()+ B.substring(1));
        
        sc.close();
    }
}