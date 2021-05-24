package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Medias {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double op, n1, n2, media, diferenca = 0, produto, divisao;
		
		String sexo;
		
		sexo = "M";
		
		if(sexo.equals("M")) {
			System.out.println("Homem");
		}else {
			System.out.println("Mulher");
		}

		
		
		System.out.println("Informe o 1° número: ");
		n1 = sc.nextDouble();

		System.out.println("Informe o 2° número: ");
		n2 = sc.nextDouble();

		System.out
				.println("Você deseja: \n(1) média entre os números informados" + "\n(2) Diferença do maior pelo menor"
						+ "\n(3) Produto entre os números informados " + "\n\nA opção que deseja é: ");
		op = sc.nextInt();

		media = (n1 + n2) / 2;
		if (n1 > n2) {
			diferenca = n1 - n2;
		}
		if (n1 < n2) {
			diferenca = n2 - n1;
		}
		produto = n1 * n2;
		divisao = n1 / n2;

		if (op == 1) {
			System.out.print("A média é: " + media);
		}
		if (op == 2) {
			System.out.print("A diferença do maior para o menor é: " + diferenca);
		}
		if (op == 3) {
			System.out.print(" O produto dos números informados é: " + produto);
		}
		if (op == 4) {
			if (op == 0)
				System.out.print(" Opção inválida, atríbua outro valor ao 2° número");
		} else {
			System.out.print("A divisão do primeiro pelo segundo é: " + divisao);
		}
		if (op > 4) {
			System.out.print("Opção inválida, erro de execução");
		}
		sc.close();
	}
}
