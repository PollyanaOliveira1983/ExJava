package exUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe_04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os seguintes dados do Funcionario");
		System.out.println("Codigo / Horas trabalhadas / Valor do salario por hora");

		int numero;
		double horas;
		double salario;
		double hpaga;

		numero = sc.nextInt();
		horas = sc.nextDouble();
		hpaga = sc.nextDouble();

		System.out.println("Codigo: "+ numero + ", horas trabalhadas: "+ horas + ", valor pago por hora trabalhada: "+ hpaga);

		salario = horas * hpaga;

		System.out.printf("Cogido do funcionario:  " + numero + " o salario é = U$ " + "%.2f%n", + salario );
		
		sc.close();
	}

}
