package lp2.revisaoEntradaESaida;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio;
		double area;
		
		System.out.println("Informe o raio do circulo: ");
		raio = sc.nextDouble();
		
		area = Math.PI * (raio * raio);

		System.out.println("A area do circulo é igual a " + area);
		sc.close();
	}
}
