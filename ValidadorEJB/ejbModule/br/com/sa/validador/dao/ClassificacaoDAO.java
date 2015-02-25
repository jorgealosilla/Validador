package br.com.sa.validador.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sa.validador.business.bean.entidades.Classificacao;

public class ClassificacaoDAO {
	
	EntityManager em;
	public ClassificacaoDAO(EntityManager em){
		this.em = em;
	}

	public boolean salvar(Classificacao classificacao){
		try {
			em.persist(classificacao);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Classificacao> getAll(){
		Query query = em.createNamedQuery("classificacao.getAll"); 
		List<Classificacao> resultList = (List<Classificacao>) query.getResultList();
		return resultList;
	}

	public Classificacao getById(Long id) {
		return em.find(Classificacao.class, id);
	}

	public void excluir(Long id) {
		em.remove(getById(id));
	}
}
