package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Informe numero para tabuada: ");
		num = sc.nextInt();
		
		if((num > 0) && (num < 11)){
			for(int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num*i);
			}	
		
		}else{
			System.out.println("Numero digitado fora do intervalo esperado!");
		}	
				
		sc.close();
	}
}
