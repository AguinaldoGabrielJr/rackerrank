package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		Locale indiaLocale = new Locale("en", "IN");
		
		double valor = sc.nextDouble();
		
		if (valor >= 0 && valor <= 1000000000) {
			
			NumberFormat nfUsa = NumberFormat.getCurrencyInstance(Locale.US);
			String valorUsa = nfUsa.format(valor);
			System.out.println("US: " + valorUsa);

			NumberFormat nfIndia = NumberFormat.getCurrencyInstance(indiaLocale);
			String valorIndia = nfIndia.format(valor);
			System.out.println("India: " + valorIndia);

			NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
			String valorChina = nfChina.format(valor);
			System.out.println("China: " + valorChina);

			NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
			String valorFrance = nfFrance.format(valor);
			System.out.println("France: " + valorFrance);
		}
		
		sc.close();
	
	}
}