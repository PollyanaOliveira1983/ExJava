package exUdemy;

import java.util.Scanner;

public class exe_03 {
	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: 
		//DIFERENCA = (A * B - C * D).

		System.out.println("Digite 4 numeros inteiros");

		Scanner sc = new Scanner(System.in);	
		int A, B, C, D, Dif;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		System.out.printf("Os numeros digitados foram: " + A + " " + B +" " + C + " " + D);

		Dif = (A * B - C * D);
		System.out.println();
		System.out.printf("A diferença dos numeros digitados é: " + Dif);
		
		sc.close();
	}
}
