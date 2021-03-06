/**
 * 
 */
package br.com.sa.validador.business.bean.session.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sa.validador.business.bean.entidades.Classificacao;
import br.com.sa.validador.business.bean.interfaces.IClassificacaoBean;

/**
 * @author JORGE
 * 
 */
@Path("classificacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClassificacaoFacade{
	@EJB
	private IClassificacaoBean classificacaoBean;
	
	@GET
	public List<Classificacao> getAll(){
		return classificacaoBean.getAll();
	}
	
	@GET
	@Path("{id}")
	public Classificacao find(@PathParam("id") Long id){
		return classificacaoBean.getById(id);
	}
	
	@POST
	public boolean salvar(Classificacao classificacao){
		return classificacaoBean.salvar(classificacao);
	}
	
	@DELETE
	@Path("{id}")
	public void excluir(@PathParam("id") Long id){
		classificacaoBean.excluir(id);
	}

}
