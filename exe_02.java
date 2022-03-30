package exUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe_02 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, 
		//e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio 2
		//Considere o valor de π = 3.14159

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio do circulo");

		double area;
		double raio;
		double pi = 3.14159; 

		raio = sc.nextDouble();

		area = pi * raio * raio;

		System.out.println("Voce digitou: " + raio);

		System.out.printf("A área deste circulo é:" + "%.4f%n", + area);	

		sc.close();
	}

}
