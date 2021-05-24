package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		String resp;
		
		do {
		System.out.print("Digite a temperatura em CELSIUS: ");
		c = sc.nextDouble();
		f = ((9.0 * c)/5.0) + 32.0;
		
		System.out.println("Equivalente em FAHRNHEIT: " + String.format("%.1f", f));
		System.out.print("Deseja repetir (s/n)? ");
		resp= sc.next();
		
		}while(
				(resp.toLowerCase().equals("s")) || 
				(resp.toLowerCase().equals("sim"))||
				(resp.toLowerCase().equals("ss"))||
				(resp.toLowerCase().equals("si"))
		);	
		
		sc.close();
	}

}
