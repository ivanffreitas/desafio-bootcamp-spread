package com.ivanilson;

import java.io.IOException;
import java.util.Scanner;

public class Par_ou_Impar {
	/*
	 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão
	 * lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo
	 * se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo
	 * (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta
	 * seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir
	 * apenas NULL.
	 */
	public static void main(String[] args) throws IOException {
		String evenOod = "";
		String positivoNegativo = "";

		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			int numero = leitor.nextInt();

			if (numero != 0) {

				if (numero % 2 == 0) {
					evenOod = "EVEN";
				}
				if (numero % 2 != 0) {
					evenOod = "ODD";
				}
				if (numero < 0) {
					positivoNegativo = "NEGATIVE";
				}
				if (numero > 0) {
					positivoNegativo = "POSITIVE";
				}
				System.out.println(evenOod + " " + positivoNegativo);
			} else {
				System.out.println("NULL");
			}
		}
	}
}
