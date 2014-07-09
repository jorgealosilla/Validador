package br.com.sa.validador.dao;

import javax.persistence.EntityManager;

import br.com.sa.validador.business.bean.entidades.CampoModel;

public class CampoDAO {
	EntityManager em;
	public CampoDAO(EntityManager em){
		this.em = em;
	}
	
	public void salvar(CampoModel campo){
		em.persist(campo);
	}

}
