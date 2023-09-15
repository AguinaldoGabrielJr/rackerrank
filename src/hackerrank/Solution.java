package hackerrank;

import java.util.Scanner;
class UsernameValidator {

	final static String regularExpression = "[A-Za-z][A-Za-z0-9_]{7,29}";
	
}

public class Solution {
	
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
    	System.out.println("Quantidade: ");
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
        	System.out.println("name: ");
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
        
    }
}