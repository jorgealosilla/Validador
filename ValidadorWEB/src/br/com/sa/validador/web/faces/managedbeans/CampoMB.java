package br.com.sa.validador.web.faces.managedbeans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.sa.validador.business.bean.entidades.CampoModel;
import br.com.sa.validador.business.bean.entidades.CampoSistema;
import br.com.sa.validador.business.bean.interfaces.ICampoBean;

@ManagedBean
@SessionScoped
public class CampoMB {
	@EJB
	private ICampoBean campoBean;
	
	private CampoModel campoSelecionado;
	
	
	@PostConstruct
	public void init() {
		campoSelecionado = new CampoSistema();
	}
	
	public void salvar(){
		campoBean.salvar(campoSelecionado);
	}

	public CampoModel getCampoSelecionado() {
		return campoSelecionado;
	}

	public void setCampoSelecionado(CampoModel campoSelecionado) {
		this.campoSelecionado = campoSelecionado;
	}	
}
