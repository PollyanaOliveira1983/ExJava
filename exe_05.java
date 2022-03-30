package exUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe_05 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		//o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
		//e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		int cod1, cod2, qtd1, qtd2;
		double vlr1, vlr2, total;
		
		System.out.println("Digite o codigo da peca1: ");
		cod1 = sc.nextInt();
		System.out.println("Digite o quantidade da peca1 ");
		qtd1 = sc.nextInt();
		System.out.println("Digite o valor da peca1: ");
		vlr1 = sc.nextDouble();
		System.out.println("Digite o codigo da peca2: ");
		cod2 = sc.nextInt();
		System.out.println("Digite o quantidade da peca2 ");
		qtd2 = sc.nextInt();
		System.out.println("Digite o valor da peca2: ");
		vlr2 = sc.nextDouble();
		
		total = (qtd1 * vlr1) + (qtd2 * vlr2);
		
		System.out.printf("Valor total a pagar: R$ "+ "%.2f%n", + total);
		
		
	}

}
