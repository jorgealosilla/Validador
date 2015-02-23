package br.com.sa.validador.business.bean.interfaces;

import java.util.List;

import br.com.sa.validador.business.bean.entidades.CampoModel;

public interface ICampoBean {
	public boolean salvar(CampoModel campo);
	public List<CampoModel> getAll();

}
