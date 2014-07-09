package br.com.sa.validador.business.bean.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author JORGE
 * @version 1.0
 * @created 30-jun-2014 14:54:43
 */
@Entity
public class Layout {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLayout;
	private String extensaoArquivos;
	private String nome;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="layout", fetch=FetchType.EAGER, orphanRemoval=true)
	private List<Arquivo> arquivos;

	public Layout(){
		arquivos = new ArrayList<Arquivo>();
	}

	public Long getIdlayout() {
		return idLayout;
	}

	public void setIdLayout(Long idLayout) {
		this.idLayout = idLayout;
	}

	public String getExtensaoArquivos() {
		return extensaoArquivos;
	}

	public void setExtensaoArquivos(String extensaoArquivos) {
		this.extensaoArquivos = extensaoArquivos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Arquivo> getArquivos() {
		return arquivos;
	}

	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}	
}