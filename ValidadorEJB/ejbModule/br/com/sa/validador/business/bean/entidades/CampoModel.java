package br.com.sa.validador.business.bean.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:42
 */
@Entity(name="campo")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class CampoModel implements Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCampo;
	private String nome;
	private int sequencia;
	private int tamanho;
	/**
	 * 1 - Inteiro;
	 * 2 - Decimal;
	 * 3 - Texto;
	 * 4 - Data
	 */
	//private Enum tipo;
	//private Enum obrigatoriedade;
	
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
	 * @return the sequencia
	 */
	public int getSequencia() {
		return sequencia;
	}

	/**
	 * @param sequencia the sequencia to set
	 */
	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	/**
	 * @return the tamanho
	 */
	public int getTamanho() {
		return tamanho;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	
	/**
	 * @return the obrigatoriedade
	 */
//	public Enum getObrigatoriedade() {
//		return obrigatoriedade;
//	}

	/**
	 * @param obrigatoriedade the obrigatoriedade to set
	 */
//	public void setObrigatoriedade(Enum obrigatoriedade) {
//		this.obrigatoriedade = obrigatoriedade;
//	}
	
	/**
	 * @return the tipo
	 */
//	public Enum getTipo() {
//		return tipo;
//	}

	/**
	 * @param tipo the tipo to set
	 */
//	public void setTipo(Enum tipo) {
//		this.tipo = tipo;
//	}
}