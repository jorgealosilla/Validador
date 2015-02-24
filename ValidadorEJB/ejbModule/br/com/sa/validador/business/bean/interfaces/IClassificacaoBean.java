package br.com.sa.validador.business.bean.interfaces;

import java.util.List;

import br.com.sa.validador.business.bean.entidades.Classificacao;

public interface IClassificacaoBean {
	public boolean salvar(Classificacao classificacao);
	public List<Classificacao> getAll();
	public Classificacao getById(Long id);
}
