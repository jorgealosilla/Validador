package br.com.sa.validador.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sa.validador.business.bean.entidades.CampoModel;

public class CampoDAO {
	EntityManager em;
	public CampoDAO(EntityManager em){
		this.em = em;
	}
	
	public void salvar(CampoModel campo){
		em.persist(campo);
	}
	
	public List<CampoModel> getAll(){
		Query query = em.createNamedQuery("campo.getAll"); 
		List<CampoModel> resultList = (List<CampoModel>) query.getResultList();
		return resultList;
	}

}
