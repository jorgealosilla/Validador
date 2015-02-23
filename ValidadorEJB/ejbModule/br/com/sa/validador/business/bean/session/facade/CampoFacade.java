package br.com.sa.validador.business.bean.session.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import br.com.sa.validador.business.bean.entidades.CampoModel;
import br.com.sa.validador.business.bean.interfaces.ICampoBean;

@RequestScoped
@ApplicationPath("resources")
@Path("campo")
public class CampoFacade extends Application {
	@EJB
	private ICampoBean campoBean;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CampoModel> getAll(){
		return campoBean.getAll();
	}
}
