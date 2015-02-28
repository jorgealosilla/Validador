package br.com.sa.validador.business.bean.session.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sa.validador.business.bean.entidades.CampoModel;
import br.com.sa.validador.business.bean.interfaces.ICampoBean;

@Path("campo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CampoFacade{
	@EJB
	private ICampoBean campoBean;
	
	@GET
	public List<CampoModel> getAll(){
		return campoBean.getAll();
	}
}
