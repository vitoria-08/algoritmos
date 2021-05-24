package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km;
		double comb, media;
		
		System.out.print("Distância percorrida: ");
		km = sc.nextInt();
		System.out.print("Combustível gasto: ");
		comb = sc.nextDouble();
		
		media = km / comb;		
		
		System.out.print("Consumo médio = " + String.format("%.3f", media));
		
		sc.close();
	}

}
