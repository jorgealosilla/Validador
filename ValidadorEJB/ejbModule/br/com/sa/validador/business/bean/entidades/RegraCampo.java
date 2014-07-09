package br.com.sa.validador.business.bean.entidades;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:43
 */
public class RegraCampo {

	private boolean particionado;
	/**
	 * se tipoParticionamento == Extremidades
	 * 1 - direita_esquerda;
	 * 2 - esquerda_direita;
	 */
	private Enum sentidoParticionamento;
	/**
	 * se particionado == true
	 * 1 - Extremidades;
	 * 2 - Centro;
	 */
	private Enum tipoParticionamento;

	public RegraCampo(){

	}

	public void finalize() throws Throwable {

	}

}