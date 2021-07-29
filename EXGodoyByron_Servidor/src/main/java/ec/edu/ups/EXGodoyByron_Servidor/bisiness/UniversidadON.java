package ec.edu.ups.EXGodoyByron_Servidor.bisiness;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EXGodoyByron_Servidor.DAO.UniversidadDAO;
import ec.edu.ups.EXGodoyByron_Servidor.modelo.Universidad;

@Stateless
public class UniversidadON{

	@Inject
	private UniversidadDAO daoUniversidad;
	
	public void ingresarUniversidad(Universidad u) {
		daoUniversidad.ingrsarUniversidad(u);
	}
	
	public List<Universidad> getUniversidades(){
		
		return daoUniversidad.getUniversidades();
	}
}
