package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, troco, dinheiro, total;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		total = preco * quantidade;
		troco = dinheiro - total;
		
		System.out.print("TROCO = " + troco);
		
		sc.close();
	}

}
