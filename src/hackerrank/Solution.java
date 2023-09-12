package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		BigInteger n = null;
		for (int i = 0; i < t; i++) {

			n = sc.nextBigInteger();
			
			if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 
					&& n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
				System.out.print(n + " can be fitted in:\n");
			}else {
				System.out.print(n + " can't be fitted anywhere.\n");
			}
			
			
			if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0
					&& n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
				System.out.println("* byte");
			}

			if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0
					&& n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
				System.out.println("* short");
			}

			if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
					&& n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
				System.out.println("* int");
			}

			if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
					&& n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
				System.out.println("* long");
			}

		}

	}
}
