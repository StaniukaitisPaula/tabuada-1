package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicando, minimoMultiplicador, maximoMultiplicador;

	public String[] getTabuada() {

		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;

		while (contador < tamanho) {

			int produto = multiplicando * minimoMultiplicador;

			String resultado = multiplicando + " X " + minimoMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minimoMultiplicador++;
		}
		return tabuada;
	}
}
