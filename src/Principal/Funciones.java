package Principal;

import java.sql.SQLException;

import BaseDatos.ConexionMySQL;

public class Funciones {
	//Funcion para añadir el nombre a la base
	public static void AnadirNombre(String nombre) {
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
	public static void AnadirApellido1(String apellidos1) {
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
	public static void AnadirApellido2(String apellidos2) {
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
	public static void AnadirNombreUsuario(String usuario) {
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
	public static void AnadirCorreo(String correoElectronico) {
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
	public static void AnadirContrasena(String contrasena) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			String sentencia = "INSERT INTO Usuarios (contraseña) VALUES ( '" + contrasena + "')";
			
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
	public static boolean ConfirmarContrasena(String contr, String compContr) {
		if (contr == compContr) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
