package br.com.sa.validador.business.bean.session;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.sa.validador.business.bean.entidades.Arquivo;
import br.com.sa.validador.business.bean.interfaces.IArquivoBean;
import br.com.sa.validador.dao.ArquivoDAO;

@Stateless
public class ArquivoBean implements IArquivoBean{
	@PersistenceContext
	EntityManager entityManager;
	ArquivoDAO dao;
	
	@PostConstruct
	public void init(){
		dao = new ArquivoDAO(entityManager);
	}
	
	@Override
	public boolean salvar(Arquivo arquivo) {
		dao.salvar(arquivo);
		return true;
	}

}
