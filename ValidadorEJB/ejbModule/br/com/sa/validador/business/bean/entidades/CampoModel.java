package br.com.sa.validador.business.bean.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

import br.com.sa.validador.business.enuns.TipoCampo;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:42
 */
@Entity(name="campo")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CampoModel implements Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCampo;
	private String nome;
	private String descricao;
	private String mascara;
	private String valor;// p/ campo de tipoRegistro
	private char caracterPreenchimento;
	private int ladoPreenchimento; // esquerdo direito
	private int tamanhoMaximo;
	private int tamanhoMinimo;
	private int valorMaximo;
	private int valorMinimo;
	/**
	 * 1 - Inteiro;
	 * 2 - Decimal;
	 * 3 - Texto;
	 * 4 - Data
	 * 5 - Tabela Interna
	 * 6 - Agrupador
	 * 
	 */
	private TipoCampo tipoCampo;
	
	public CampoModel(){

	}

	/**
	 * @return the idCampo
	 */
	public Long getIdCampo() {
		return idCampo;
	}

	/**
	 * @param idCampo the idCampo to set
	 */
	public void setIdCampo(Long idCampo) {
		this.idCampo = idCampo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the mascara
	 */
	public String getMascara() {
		return mascara;
	}

	/**
	 * @param mascara the mascara to set
	 */
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
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

	/**
	 * @return the tipoCampo
	 */
	public TipoCampo getTipoCampo() {
		return tipoCampo;
	}

	/**
	 * @param tipoCampo the tipoCampo to set
	 */
	public void setTipoCampo(TipoCampo tipoCampo) {
		this.tipoCampo = tipoCampo;
	}
}