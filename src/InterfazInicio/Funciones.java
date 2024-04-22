package InterfazInicio;

import java.sql.SQLException;

import BaseDatos.ConexionMySQL;

public class Funciones {
	//Función para introducir datos de registro
	public void ConexionBD() {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			//Conectamos la base de datos
			conexion.conectar();
			
			//Ahora añadimos la información del registro con las sentencias
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conexion.desconectar();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
