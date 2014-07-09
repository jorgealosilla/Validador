package br.com.sa.validador.business.bean.session;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.sa.validador.business.bean.entidades.CampoModel;
import br.com.sa.validador.business.bean.interfaces.ICampoBean;
import br.com.sa.validador.dao.CampoDAO;

@Stateless
public class CampoBean implements ICampoBean{
	@PersistenceContext
	EntityManager entityManager;
	CampoDAO dao;
	
	@PostConstruct
	public void init(){
		dao = new CampoDAO(entityManager);
	}
	
	@Override
	public boolean salvar(CampoModel campo) {
		dao.salvar(campo);
		return true;
	}

}
