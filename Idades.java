package exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Idades {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome1, nome2;		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade += sc.nextInt(); 		
				
		System.out.println(
				"A idade média de " + nome1 + " e " + nome2 + " é de " +  idade/2.0 + " anos");		
		sc.close();
	}
}
