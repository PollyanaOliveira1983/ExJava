package exUdemy;

import java.util.Scanner;

public class exe_01 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros inteiros");

		int x , y, soma;

		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;

		System.out.println("Voce digitou: " + x + " e "+ y);
		System.out.println("A soma dos numeros é: " + soma);		

		sc.close();		
	}

}
