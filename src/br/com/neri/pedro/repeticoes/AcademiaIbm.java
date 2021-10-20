package br.com.neri.pedro.repeticoes;

import java.math.BigDecimal;

/*
 * 1- Escrever uma classe, com um método chamado "escreveNome". Usando o while,
 * escrever "Academia IBM" por 5 vezes, usando System.out.println
 */
/**
 * @author pedro.neri
 *
 */
public class AcademiaIbm {

	static final String NOME = "Academia IBM";

	/**
	 * escrever "Academia IBM" com numero de repetições de acorso com o limite
	 * passado
	 * 
	 * @param interacoes
	 */
	public static void escreveNome(int interacoes) {

		System.out.printf("Escreve Academia %d vezes \n", interacoes);
		int ref = 0;
		while (interacoes > ref) {
			ref++;
			System.out.println(NOME);
		}
		System.out.println();
	}

	/**
	 * Escreve a tabuada de acordo com a tabuada passada até o limite passado por
	 * parametro
	 * 
	 * @param tabuada
	 * @param limite
	 */
	public void escreveTabuada(int tabuada, int limite) {
		System.out.printf("Tabuada de %d, até %d \n", tabuada, limite);
		for (int i = 0; i <= limite; i++) {
			int resultado = i * tabuada;
			System.out.printf("%d x %d = %d \n", tabuada, i, resultado);
		}
	}

	/**
	 * Escreve toda a tabuada
	 * 
	 * @param tabuada
	 * @param limite
	 */
	public void imprimeTabuada(int tabuada, int limite) {
		int counter = 1;
		while (counter <= tabuada) {
			escreveTabuada(counter, 9);
			counter++;

		}
	}

}
