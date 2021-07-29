package ec.edu.ups.EXGodoyByron_Servidor.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EXGodoyByron_Servidor.modelo.Universidad;

@Stateless
public class UniversidadDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void ingrsarUniversidad(Universidad u) {
		em.persist(u);
	}
	
	public void actualizarUniversidad(Universidad u) {
		em.merge(u);
	}
	
	public Universidad buscarUniversidad(int codigo) {
		
		Universidad u=em.find(Universidad.class, codigo);
		return u;
	}
	public List<Universidad> getUniversidades(){
		
		String sql="select u from Universidad u";
		Query q=em.createQuery(sql,Universidad.class);
		
		List<Universidad> lista= q.getResultList();
		return lista;
		
	}
}
