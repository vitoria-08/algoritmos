package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorPorHora, salario;
		int horasTrabalhadas;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		valorPorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		salario = valorPorHora * horasTrabalhadas;
		
		System.out.print("O pagamento para " + nome + " deve ser " + String.format("%.2f", salario));		
		
		
		sc.close();
	}

}
