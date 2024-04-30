package Principal;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
			
			String sentencia = "INSERT INTO Usuarios (primerApellido) VALUES ( '" + apellidos1 + "')";
			
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
			
			String sentencia = "INSERT INTO Usuarios (segundoApellido) VALUES ( '" + apellidos2 + "')";
			
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
	public static void AnadirContrasena(String cs) {
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			String sentencia = "INSERT INTO Usuarios (contraseña) VALUES ( '" + cs + "')";
			
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
	
	public static void Registro () {
		String nombre = InterfazInicio.Registrar.txtNombre.getText();
		String apellido1 = InterfazInicio.Registrar.txtApellido1.getText();
		String apellido2 = InterfazInicio.Registrar.txtApellido2.getText();
		String usuario = InterfazInicio.Registrar.txtUsuario.getText();
		String correo = InterfazInicio.Registrar.txtCorreo.getText();
		char[] pass	= InterfazInicio.Registrar.passwordField.getPassword();
		char[] confPass = InterfazInicio.Registrar.passwordField_1.getPassword();
		String contrasena = new String (pass); 
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		try {
			conexion.conectar();
			String sentencia = "SELECT * FROM Usuarios";
			ResultSet datos;
			datos = conexion.ejecutarSelect(sentencia);
				while (datos.next()) {					
					if (datos.getString("nombreUsuario").equals(usuario) || !pass.equals(confPass)) {
						/*InterfazInicio.Registrar.txtUsuario.setText("");
						InterfazInicio.Registrar.txtNombre.setText("");
						InterfazInicio.Registrar.txtApellido1.setText("");
						InterfazInicio.Registrar.txtApellido2.setText("");
						InterfazInicio.Registrar.txtCorreo.setText("");
						InterfazInicio.Registrar.passwordField.setText("");
						InterfazInicio.Registrar.passwordField_1.setText("");*/
						
						JOptionPane.showMessageDialog(null, "Nombre o contraseña incorrectos");
					}
					else {
						String insertar = "INSERT INTO Usuarios (nombre, primerApellido, segundoApellido, correoElectronico, nombreUsuario, contraseña)"
								+ " VALUES ('" + nombre + "', '" + apellido1 + "', '" + apellido2 + "', '" + correo + "', '" + usuario + "', '"
								+ contrasena + "')";
						conexion.ejecutarInsertDeleteUpdate(insertar);
						System.out.println("Insertado correctamente");
					}
				}
			
			
			
			
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
