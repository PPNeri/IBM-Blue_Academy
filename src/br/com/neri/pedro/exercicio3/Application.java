package br.com.neri.pedro.exercicio3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int opcaoEncolhida;
		
		Scanner menu = new Scanner(System.in);
		Scanner mesEntrada = new Scanner(System.in);

		System.out.println("DIGITE 1-Mes 0-Sair ");
		opcaoEncolhida = menu.nextInt();

		while (opcaoEncolhida != 0) { 
			int mes;
			System.out.println("Digite o mes de entrada: ");
			mes = mesEntrada.nextInt();
		
			Mes ex = new Mes(mes);
			
			String mesRetornado = ex.escreverMesExtenso(mes);
			
			System.out.println("O mes retornado foi : " + mesRetornado);
			
			System.out.println("Sair-0 Continuar-1");
			opcaoEncolhida=menu.nextInt();
		}
		mesEntrada.close();
		menu.close();
		System.out.println("Fim Programa");
	}

}
