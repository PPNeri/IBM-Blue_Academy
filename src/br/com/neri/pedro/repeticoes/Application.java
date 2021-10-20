package br.com.neri.pedro.repeticoes;

/**
 * 
 * 1- Escrever uma classe, com um m�todo chamado "escreveNome". Usando o while,
 * escrever "Academia IBM" por 5 vezes, usando System.out.println
 * 
 * 2- Na mesma classe do exerc�cio 1, usar um loop for que fa�a a tabuada do 2.
 * A sa�da esperada �
 * 
 * 3. Na mesma classe, criar um m�todo chamado "imprimeTabuada". Usando o for,
 * imprimir as tabuadas de 1 a 9, no mesmo formato do exerc�cio 2 anterior:
 * 
 * 
 * @author pedro.neri
 *
 */
public class Application {

	public static void main(String[] args) {
		AcademiaIbm academia = new AcademiaIbm();

		System.out.println("Exercicio 1");
		academia.escreveNome(5);

		System.out.println("Exercicio 2");
		academia.escreveTabuada(2, 9);

		System.out.println("Exercicio 3");
		academia.imprimeTabuada(9, 9);
	}

}
