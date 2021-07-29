package ec.edu.ups.EXGodoyByron_Servidor.bisiness;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EXGodoyByron_Servidor.DAO.CarreraDAO;
import ec.edu.ups.EXGodoyByron_Servidor.modelo.Carrera;

@Stateless
public class CarreraON {

	@Inject
	private CarreraDAO daoCarrera;
	
	public void insertarUniversidad(Carrera c) {
		daoCarrera.ingrsarCarrea(c);
	}
	
	public Carrera buscarCarrera(int c) {
		return daoCarrera.buscarCarrera(c);
	}
}
