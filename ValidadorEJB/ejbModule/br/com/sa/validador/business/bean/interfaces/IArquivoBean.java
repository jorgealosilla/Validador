package br.com.sa.validador.business.bean.interfaces;

import javax.ejb.Local;

import br.com.sa.validador.business.bean.entidades.Arquivo;

@Local
public interface IArquivoBean {
	
	public boolean salvar(Arquivo arquivo);

}