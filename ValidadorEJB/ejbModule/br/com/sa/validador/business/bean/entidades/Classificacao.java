package br.com.sa.validador.business.bean.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import br.com.sa.validador.business.enuns.TipoLayout;

/**
 * @author JORGE
 * @version 1.0
 * @created 30-jun-2014 14:54:43
 */
@Entity(name="classificacao")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@NamedQueries( {
	@NamedQuery(name = "classificacao.getAll", query = "SELECT c FROM classificacao c"),
	@NamedQuery(name = "classificacao.findByName", query = "SELECT c FROM classificacao c WHERE c.nome LIKE :pnome")})
public class Classificacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClassificacao;
	private String extensaoArquivos;
	private String nome;
	private String descricao;
	private TipoLayout tipoLayout;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="classificacao", fetch=FetchType.EAGER, orphanRemoval=true)
	private List<Arquivo> arquivos;

	public Classificacao(){
		arquivos = new ArrayList<Arquivo>();
	}

	public Long getIdClassificacao() {
		return idClassificacao;
	}

	public void setIdClassificacao(Long idClassificacao) {
		this.idClassificacao = idClassificacao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public TipoLayout getTipoLayout() {
		return tipoLayout;
	}

	public void setTipoLayout(TipoLayout tipoLayout) {
		this.tipoLayout = tipoLayout;
	}
}