package ec.edu.ups.EXGodoyByron_Servidor.bisiness;

import javax.ejb.Remote;

import ec.edu.ups.EXGodoyByron_Servidor.modelo.Universidad;

@Remote
public interface UniversidadRemoto {

	public void ingresarUniversidad(Universidad u);
}
