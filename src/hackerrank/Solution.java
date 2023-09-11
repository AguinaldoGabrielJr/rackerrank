package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bufferedReader.readLine().trim());

		double d = Double.parseDouble(bufferedReader.readLine().trim());

		String s = bufferedReader.readLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + num);

		bufferedReader.close();
	}
}
