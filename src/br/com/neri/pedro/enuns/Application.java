package br.com.neri.pedro.enuns;

public class Application {

	public static void main(String[] args) {

		for (MesesDoAno mes : MesesDoAno.values()) {
			retornaMes(mes.toString());
		}

	}

	public static void retornaMes(String mes) {

		switch (mes) {
		case "JANEIRO":
			System.out.println(MesesDoAno.JANEIRO.getMes());
			break;
		case "FEVEREIRO":
			System.out.println(MesesDoAno.FEVEREIRO.getMes());
			break;
		case "MARCO":
			System.out.println(MesesDoAno.MARCO.getMes());
			break;
		case "ABRIL":
			System.out.println(MesesDoAno.ABRIL.getMes());
			break;
		case "MAIO":
			System.out.println(MesesDoAno.MAIO.getMes());
			break;
		case "JUNHO":
			System.out.println(MesesDoAno.JUNHO.getMes());
			break;
		case "JULHO":
			System.out.println(MesesDoAno.JULHO.getMes());
			break;
		case "AGOSTO":
			System.out.println(MesesDoAno.AGOSTO.getMes());
			break;
		case "SETEMBRO":
			System.out.println(MesesDoAno.SETEMBRO.getMes());
			break;
		case "OUTUBRO":
			System.out.println(MesesDoAno.OUTUBRO.getMes());
			break;
		case "NOVEMBRO":
			System.out.println(MesesDoAno.NOVEMBRO.getMes());
			break;
		case "DEZEMBRO":
			System.out.println(MesesDoAno.DEZEMBRO.getMes());
			break;
		default:
			System.out.println("mes invalido");

		}

	}

}
