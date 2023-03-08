package lp2.revisaoEntradaESaida;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Definindo as constantes
        final double CONSUMO_TINTA_POR_METRO_QUADRADO = 0.3; // litros
        final double QUANTIDADE_TINTA_POR_LATA = 2.0; // litros

        // Criando um objeto Scanner para ler as medidas da parede
        Scanner sc = new Scanner(System.in);

        // Lendo as medidas da parede
        System.out.print("Digite a largura da parede em metros: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura da parede em metros: ");
        double altura = sc.nextDouble();

        // Calculando a área da parede em metros quadrados
        double area = largura * altura;

        // Calculando a quantidade de tinta necessária em litros
        double quantidadeTinta = area * CONSUMO_TINTA_POR_METRO_QUADRADO;

        // Calculando a quantidade de latas de tinta necessárias
        int quantidadeLatas = (int) Math.ceil(quantidadeTinta / QUANTIDADE_TINTA_POR_LATA);

        // Imprimindo o resultado
        System.out.println("Serão necessárias " + quantidadeLatas + " latas de tinta.");
        
        sc.close();
    }
}

