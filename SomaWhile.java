package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		
		soma = 0;
		
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		
		while(x != 0) {
			soma = x + soma;
			System.out.print("Digite outro número: ");
			x = sc.nextInt();
		}
		
		System.out.println("Soma: " + soma);		
		
		sc.close();
	}

}
