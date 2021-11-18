package com.ivanilson;

import java.util.Scanner;

public class Trigo_no_tabuleiro {
	/*
	 * Uma rainha requisitou os servi�os de um monge e disse-lhe que pagaria
	 * qualquer pre�o. O monge, necessitando de alimentos, perguntou a rainha se o
	 * pagamento poderia ser feito em gr�os de trigo dispostos em um tabuleiro de
	 * damas, de forma que o primeiro quadrado tivesse apenas um gr�o, e os
	 * quadrados subseq�entes, o dobro do quadrado anterior. A rainha considerou o
	 * pagamento barato e pediu que o servi�o fosse executado, por�m, um dos
	 * cavaleiros que estava presente e entendia um pouco de matem�tica alertou-a
	 * que seria imposs�vel executar o pagamento, pois a quantidade de gr�o seria
	 * muito alta. Curiosa, a rainha solicitou ent�o a este cavaleiro que era bom em
	 * c�lculo, que fizesse um programa que recebesse como entrada o n�mero de
	 * quadrados a serem usados em um tabuleiro de damas e apresentasse a quantidade
	 * de kg de trigo correspondente, sabendo que cada 12 gr�os do cereal
	 * correspondem a uma grama. Finalmente, o c�lculo da quantidade dever� caber em
	 * um valor inteiro de 64 bits sem sinal.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int graos = 12;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			double trigo = (double) Math.pow(2, x) - 1;
			double gramas = trigo / graos;
			long kilo = (long) (gramas / 1000);
			System.out.printf("%d kg\n", kilo);
		}
		sc.close();
	}
}
