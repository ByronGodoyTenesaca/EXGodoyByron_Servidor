package ec.edu.ups.EXGodoyByron_Servidor.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.EXGodoyByron_Servidor.bisiness.UniversidadON;
import ec.edu.ups.EXGodoyByron_Servidor.modelo.Universidad;


@Named
@ViewScoped
public class UniversidadBean implements Serializable{
	
	private List<Universidad> lista;

	@Inject
	private UniversidadON universidadon;
	
	@PostConstruct
	public void init() {
		lista=universidadon.getUniversidades();
	}

	public List<Universidad> getLista() {
		return lista;
	}

	public void setLista(List<Universidad> lista) {
		this.lista = lista;
	}	
}
