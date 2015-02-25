/**
 * 
 */
package br.com.sa.validador.business.bean.session.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.websocket.server.PathParam;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sa.validador.business.bean.entidades.Classificacao;
import br.com.sa.validador.business.bean.interfaces.IClassificacaoBean;

/**
 * @author JORGE
 * 
 */
@RequestScoped
@ApplicationPath("resources")
@Path("classificacao")
@Produces(MediaType.APPLICATION_JSON)
public class ClassificacaoFacade {
	@EJB
	private IClassificacaoBean classificacaoBean;
	
	@GET
	public List<Classificacao> getAll(){
		return classificacaoBean.getAll();
	}
	
	@GET
	@Path("{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Classificacao getById(@PathParam("id") Long id){
		return classificacaoBean.getById(id);
	}
	
	@POST	
	public boolean salvar(Classificacao classificacao){
		return classificacaoBean.salvar(classificacao);
	}
	
	@DELETE
	@Path("{id}")
	public void excluir(Long id){
		classificacaoBean.excluir(id);
	}

}
