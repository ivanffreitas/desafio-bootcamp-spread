package com.ivanilson;

import java.io.IOException;
import java.util.Scanner;

public class Par_ou_Impar {
	/*
	 * Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o
	 * lidos em seguida. Para cada valor lido, mostre uma mensagem em ingl�s dizendo
	 * se este valor lido � par (EVEN), �mpar (ODD), positivo (POSITIVE) ou negativo
	 * (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri��o correta
	 * seja (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir
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
