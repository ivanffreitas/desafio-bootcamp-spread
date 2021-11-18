package com.ivanilson;

import java.util.Scanner;

public class Trigo_no_tabuleiro {
	/*
	 * Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria
	 * qualquer preço. O monge, necessitando de alimentos, perguntou a rainha se o
	 * pagamento poderia ser feito em grãos de trigo dispostos em um tabuleiro de
	 * damas, de forma que o primeiro quadrado tivesse apenas um grão, e os
	 * quadrados subseqüentes, o dobro do quadrado anterior. A rainha considerou o
	 * pagamento barato e pediu que o serviço fosse executado, porém, um dos
	 * cavaleiros que estava presente e entendia um pouco de matemática alertou-a
	 * que seria impossível executar o pagamento, pois a quantidade de grão seria
	 * muito alta. Curiosa, a rainha solicitou então a este cavaleiro que era bom em
	 * cálculo, que fizesse um programa que recebesse como entrada o número de
	 * quadrados a serem usados em um tabuleiro de damas e apresentasse a quantidade
	 * de kg de trigo correspondente, sabendo que cada 12 grãos do cereal
	 * correspondem a uma grama. Finalmente, o cálculo da quantidade deverá caber em
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
