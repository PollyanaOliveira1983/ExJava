package exUdemy;

import java.util.Locale;
import java.util.Scanner;

public class exe_06 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
				
		double a, b, c, triangulo, circulo, pi, trapezio, quadrado,retangulo;
		pi = 3.14159;
		System.out.println("Digite 3 valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		//A fórmula da área de um triângulo é triangulo = (a*c)/2 sendo a = base e c = altura.
		triangulo = (a * c) / 2.0;
		
		//a área do círculo de raio C. (pi = 3.14159) pi * circulo 2
		
		circulo = pi * c * c; 
				
		//Trapézio: ((a + b)/2.0) * c Área = (h.(b+B))/2
		
		trapezio = ((a + b) / 2.0) *c;
		
		//a área do quadrado que tem lado B.
		
		quadrado = b * b;
		
		//a área do retângulo que tem lados A e B.
		
		retangulo = a * b;
		
		System.out.printf("Triangulo retangulo: " + "%.3f%n", + triangulo);
		System.out.println();
		System.out.printf("Circulo: "+ "%.3f%n", + circulo);
		System.out.println();
		System.out.printf("Trapezio: " + "%.3f%n", + trapezio);
		System.out.println();
		System.out.printf("Quadrado: " + "%.3f%n", + quadrado);
		System.out.println();
		System.out.printf("Retangulo: " + "%.3f%n", + retangulo);
		
		sc.close();
		
	}	
	

}
