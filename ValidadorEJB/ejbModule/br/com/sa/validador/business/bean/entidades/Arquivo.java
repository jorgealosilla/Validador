package br.com.sa.validador.business.bean.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:42
 */
@Entity
public class Arquivo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idArquivo;
	private String nome;
	private boolean possuiCabecalho;
	private boolean possuiRodape;
	private int tamaho;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idLayout")
	private Layout layout;
	//public Linha m_Linha;

	public Arquivo(){

	}

	public Long getIdArquivo() {
		return idArquivo;
	}

	public void setIdArquivo(Long idArquivo) {
		this.idArquivo = idArquivo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPossuiCabecalho() {
		return possuiCabecalho;
	}

	public void setPossuiCabecalho(boolean possuiCabecalho) {
		this.possuiCabecalho = possuiCabecalho;
	}

	public boolean isPossuiRodape() {
		return possuiRodape;
	}

	public void setPossuiRodape(boolean possuiRodape) {
		this.possuiRodape = possuiRodape;
	}

	public int getTamaho() {
		return tamaho;
	}

	public void setTamaho(int tamaho) {
		this.tamaho = tamaho;
	}

/*	public Linha getM_Linha() {
		return m_Linha;
	}

	public void setM_Linha(Linha m_Linha) {
		this.m_Linha = m_Linha;
	}

	public Layout getM_Layout() {
		return m_Layout;
	}

	public void setM_Layout(Layout m_Layout) {
		this.m_Layout = m_Layout;
	}*/
}