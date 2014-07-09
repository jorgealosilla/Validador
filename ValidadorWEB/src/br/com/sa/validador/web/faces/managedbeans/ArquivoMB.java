package br.com.sa.validador.web.faces.managedbeans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.sa.validador.business.bean.entidades.Arquivo;
import br.com.sa.validador.business.bean.interfaces.IArquivoBean;

@ManagedBean
@SessionScoped
public class ArquivoMB {
	@EJB
	private IArquivoBean arquivoBean;
	
	private Arquivo arquivoSelecionado;
	
	
	@PostConstruct
	public void init() {
		arquivoSelecionado = new Arquivo();
	}
	
	public void salvar(){
		arquivoBean.salvar(arquivoSelecionado);
	}

	public Arquivo getArquivoSelecionado() {
		return arquivoSelecionado;
	}

	public void setArquivoSelecionado(Arquivo arquivoSelecionado) {
		this.arquivoSelecionado = arquivoSelecionado;
	}	
}
