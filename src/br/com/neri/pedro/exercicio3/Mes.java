package br.com.neri.pedro.exercicio3;

import java.util.Scanner;

/*
 * Escrever uma classe, com um atributo int chamado "mes". Criar um método
 * chamado "escreverMesExtenso". Caso o "mes" seja igual a 1, escrever através
 * de System.out.println a String "Janeiro". Caso o "mes" seja igual a 2,
 * escrever a String "Fevereiro", e assim por diante. Modificar o valor de "mes"
 * para testar várias possibilidades.
 * 
 */

/**
 * Classe que representa o mes
 * 
 * @author pedro.neri
 *
 */
public class Mes {

	private int mes;

	public Mes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String escreverMesExtenso(int mes) {

		switch (mes) {

		case 1:
			return "JANEIRO";
		case 2:
			return "FEVEREIRO";
		case 3:
			return "MARCO";
		case 4:
			return "ABRIL";
		case 5:
			return "MAIO";
		case 6:
			return "JUNHO";
		case 7:
			return "JUNHO";
		case 8:
			return "AGOSTO";
		case 9:
			return "SETEMBRO";
		case 10:
			return "OUTUBRO";
		case 11:
			return "NOVEMBRO";
		case 12:
			return "DEZEMNBRO";
		default:
			return "MES INVÁLIDO";

		}

	}

}
