package ec.edu.ups.EXGodoyByron_Servidor.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.EXGodoyByron_Servidor.modelo.Carrera;
import ec.edu.ups.EXGodoyByron_Servidor.modelo.Universidad;

@Stateless
public class CarreraDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void ingrsarCarrea(Carrera u) {
		em.persist(u);
	}
	
	public void actualizarCarrera(Carrera u) {
		em.merge(u);
	}
	
	public Carrera buscarCarrera(int codigo) {
		
		Carrera u=em.find(Carrera.class, codigo);
		return u;
	}
	
	
}
