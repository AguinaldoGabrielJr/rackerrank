package hackerrank;

import java.util.Scanner;

class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	public String str;

	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class Solution {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println("Hello I am a singleton! Let me say " + str + " to you");
	}
}