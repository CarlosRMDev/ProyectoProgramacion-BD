package Principal;

import java.sql.SQLException;

import BaseDatos.ConexionMySQL;
import InterfazInicio.InicioSesion;

public class Main {

	public static void main(String[] args) {
		// Aplicación 
		
		InicioSesion inicio = new InicioSesion();
		inicio.setVisible(true);
	}

}
