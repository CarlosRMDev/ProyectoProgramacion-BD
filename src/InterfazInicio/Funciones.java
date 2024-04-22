package InterfazInicio;

import java.sql.SQLException;

import BaseDatos.ConexionMySQL;

public class Funciones {
	//Funcion para añadir el nombre a la base
	public void AñadirNombre(String nombre) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			
			//Sentencia para añadir el nombre
			
			String sentencia = "INSERT INTO Usuarios (nombre) VALUES ( '" + nombre + "')";
			
			conexion.ejecutarInsertDeleteUpdate(sentencia);
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
	public void AñadirApellido1(String apellidos1) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			
			//Sentencia para añadir el nombre
			
			String sentencia = "INSERT INTO Usuarios (apellidos1) VALUES ( '" + apellidos1 + "')";
			
			conexion.ejecutarInsertDeleteUpdate(sentencia);
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
	public void AñadirApellido2(String apellidos2) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			
			//Sentencia para añadir el nombre
			
			String sentencia = "INSERT INTO Usuarios (apellidos2) VALUES ( '" + apellidos2 + "')";
			
			conexion.ejecutarInsertDeleteUpdate(sentencia);
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
	public void AñadirNombreUsuario(String usuario) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			
			//Sentencia para añadir el nombre
			
			String sentencia = "INSERT INTO Usuarios (nombreUsuario) VALUES ( '" + usuario + "')";
			
			conexion.ejecutarInsertDeleteUpdate(sentencia);
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
	public void AñadirCorreo(String correoElectronico) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			
			//Sentencia para añadir el nombre
			
			String sentencia = "INSERT INTO Usuarios (correoElectronico) VALUES ( '" + correoElectronico + "')";
			
			conexion.ejecutarInsertDeleteUpdate(sentencia);
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
	public void AñadirContraseña(String contraseña) {
		
	}



}
