package estrutura_sequencial_exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, npecas1, cod2, npecas2;
		double valor1, valor2, vpagar;
		
		cod1 = sc.nextInt();
		npecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		npecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		vpagar = npecas1 * valor1 + npecas2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vpagar);
				
		sc.close();
	}

}
