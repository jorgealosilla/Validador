package br.com.sa.validador.business.bean.interfaces;

import javax.ejb.Local;

import br.com.sa.validador.business.bean.entidades.CampoModel;

@Local
public interface ICampoBean {
	
	public boolean salvar(CampoModel campo);

}
