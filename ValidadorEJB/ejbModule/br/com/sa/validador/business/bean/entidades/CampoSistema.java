package br.com.sa.validador.business.bean.entidades;

import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:42
 */
@Entity
public class CampoSistema extends CampoModel {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	private char caracterPreenchimento;
	/**
	 * Esquerdo Direito
	 */
	private int ladoPreenchimento;
	
//	private String colunaOrigem;
//	private String menuSistema;
//	private String nomeCampoSistema;
//	private String sistemaOrigem;
//	private String tabelaOrigem;
	
	private int tamanhoMaximo;
	private int tamanhoMinimo;
	private int valorMaximo;
	private int valorMinimo;

	public CampoSistema(){

	}

	/**
	 * @return the caracterPreenchimento
	 */
	public char getCaracterPreenchimento() {
		return caracterPreenchimento;
	}

	/**
	 * @param caracterPreenchimento the caracterPreenchimento to set
	 */
	public void setCaracterPreenchimento(char caracterPreenchimento) {
		this.caracterPreenchimento = caracterPreenchimento;
	}

	/**
	 * @return the ladoPreenchimento
	 */
	public int getLadoPreenchimento() {
		return ladoPreenchimento;
	}

	/**
	 * @param ladoPreenchimento the ladoPreenchimento to set
	 */
	public void setLadoPreenchimento(int ladoPreenchimento) {
		this.ladoPreenchimento = ladoPreenchimento;
	}

	/**
	 * @return the tamanhoMaximo
	 */
	public int getTamanhoMaximo() {
		return tamanhoMaximo;
	}

	/**
	 * @param tamanhoMaximo the tamanhoMaximo to set
	 */
	public void setTamanhoMaximo(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
	}

	/**
	 * @return the tamanhoMinimo
	 */
	public int getTamanhoMinimo() {
		return tamanhoMinimo;
	}

	/**
	 * @param tamanhoMinimo the tamanhoMinimo to set
	 */
	public void setTamanhoMinimo(int tamanhoMinimo) {
		this.tamanhoMinimo = tamanhoMinimo;
	}

	/**
	 * @return the valorMaximo
	 */
	public int getValorMaximo() {
		return valorMaximo;
	}

	/**
	 * @param valorMaximo the valorMaximo to set
	 */
	public void setValorMaximo(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	/**
	 * @return the valorMinimo
	 */
	public int getValorMinimo() {
		return valorMinimo;
	}

	/**
	 * @param valorMinimo the valorMinimo to set
	 */
	public void setValorMinimo(int valorMinimo) {
		this.valorMinimo = valorMinimo;
	}
}