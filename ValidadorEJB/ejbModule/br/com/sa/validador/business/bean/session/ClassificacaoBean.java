package br.com.sa.validador.business.bean.session;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.sa.validador.business.bean.entidades.Classificacao;
import br.com.sa.validador.business.bean.interfaces.IClassificacaoBean;
import br.com.sa.validador.dao.ClassificacaoDAO;

@Stateless
public class ClassificacaoBean implements IClassificacaoBean{
	@PersistenceContext
	EntityManager entityManager;
	ClassificacaoDAO dao;
	
	@PostConstruct
	public void init(){
		dao = new ClassificacaoDAO(entityManager);
	}

	@Override
	public boolean salvar(Classificacao classificacao) {
		return dao.salvar(classificacao);
	}

	@Override
	public List<Classificacao> getAll() {
		return dao.getAll();
	}

	@Override
	public Classificacao getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void excluir(Long id) {
		dao.excluir(id);
	}

}
