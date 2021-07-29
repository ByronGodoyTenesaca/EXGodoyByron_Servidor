package ec.edu.ups.EXGodoyByron_Servidor.service;


import ec.edu.ups.EXGodoyByron_Servidor.bisiness.CarreraON;
import ec.edu.ups.EXGodoyByron_Servidor.modelo.Carrera;


public class CarreraService {

	
	private CarreraON carreraON;
	
	
	public Carrera listarCarrera(int codigo) {
		
		Carrera c=carreraON.buscarCarrera(codigo);
		
		return c;
	}
	
}
