package ec.edu.ups.EXGodoyByron_Servidor.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carrera {

	@Id
	private int codigo;
	private String nombre;
	private String directorCarrera;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirectorCarrera() {
		return directorCarrera;
	}
	public void setDirectorCarrera(String directorCarrera) {
		this.directorCarrera = directorCarrera;
	}
	
	
}
