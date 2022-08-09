package program;

/*
beecrowd | 1012 - Área

Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double trianguloRetangulo = A * C / 2;
		double areaCirculo = 3.14159 * Math.pow(C, 2);
		double areaTrapezio = ((A + B) * C) / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;

		System.out.printf(
				"TRIANGULO: %.3f\n"
				+ "CIRCULO: %.3f\n"
				+ "TRAPEZIO: %.3f\n"
				+ "QUADRADO: %.3f\n"
				+ "RETANGULO: %.3f\n"
				,trianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo
				);
		sc.close();
	}
}
