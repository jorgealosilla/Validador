package br.com.sa.validador.dao;

import javax.persistence.EntityManager;

import br.com.sa.validador.business.bean.entidades.Arquivo;

public class ArquivoDAO {
	EntityManager em;
	public ArquivoDAO(EntityManager em){
		this.em = em;
	}
	
	public void salvar(Arquivo arquivo){
		em.persist(arquivo);
	}

}
