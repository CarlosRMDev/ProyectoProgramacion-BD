package Principal;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import BaseDatos.ConexionMySQL;
import InterfazInicio.Inter_juego;

public class Funciones {
	//Funcion para añadir un usuario a la base
	
	public static void Registro () {
		//Primero recogemos todos los fieldtxt del frame registrar para obtener los datos de usuario
		String nombre = InterfazInicio.Registrar.txtNombre.getText();
		String apellido1 = InterfazInicio.Registrar.txtApellido1.getText();
		String apellido2 = InterfazInicio.Registrar.txtApellido2.getText();
		String usuario = InterfazInicio.Registrar.txtUsuario.getText();
		String correo = InterfazInicio.Registrar.txtCorreo.getText();
		char[] pass	= InterfazInicio.Registrar.passwordField.getPassword();
		char[] confPass = InterfazInicio.Registrar.passwordField_1.getPassword();
		//pasamos las contraseñas a string
		String contrasena = new String (pass); 
		String confContra = new String (confPass);
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		try {
			conexion.conectar();
			//Sentencia select para recorrer la base y creación del resulset
			String sentencia = "SELECT * FROM Usuarios";
			ResultSet datos;
			datos = conexion.ejecutarSelect(sentencia);
				while (datos.next()) {	
					//Este principalmente funciona bien, si el nombre de usuario ya está usado o la contraseña no coincide, da error
					if (datos.getString("nombreUsuario").equals(usuario) || !contrasena.equals(confContra)) {
						InterfazInicio.Registrar.txtUsuario.setText("");
						InterfazInicio.Registrar.txtNombre.setText("");
						InterfazInicio.Registrar.txtApellido1.setText("");
						InterfazInicio.Registrar.txtApellido2.setText("");
						InterfazInicio.Registrar.txtCorreo.setText("");
						InterfazInicio.Registrar.passwordField.setText("");
						InterfazInicio.Registrar.passwordField_1.setText("");
						
						JOptionPane.showMessageDialog(null, "Nombre o contraseña incorrectos");
					}
					else {
						String insertar = "INSERT INTO Usuarios (nombre, primerApellido, segundoApellido, correoElectronico, nombreUsuario, contraseña)"
								+ " VALUES ('" + nombre + "', '" + apellido1 + "', '" + apellido2 + "', '" + correo + "', '" + usuario + "', '"
								+ contrasena + "')";
						conexion.ejecutarInsertDeleteUpdate(insertar);
						JOptionPane.showMessageDialog(null, "Registrado correctamente");
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
	public static void InicioSesion() {
		String usuario = InterfazInicio.InicioSesion.textFieldUsuario.getText();
		char[] pass	= InterfazInicio.InicioSesion.passwordField.getPassword();
		//pasamos la contraseña a string
		String contrasena = new String (pass); 
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");
		
		try {
			conexion.conectar();
			String sentencia = "SELECT nombreUsuario FROM Usuarios WHERE nombreUsuario = '" + usuario + "'";
			String sentenciaPass = "SELECT contraseña FROM Usuarios WHERE nombreUsuario = '" + usuario + "'";
			
			ResultSet datos = conexion.ejecutarSelect(sentencia);
			ResultSet comprobar = conexion.ejecutarSelect(sentenciaPass);
			
			while(datos.next()) {
				if (comprobar.getString(1).equals(contrasena)) {
					System.out.println("Iniciado correctamente");
					Inter_juego intjuego = new Inter_juego();
					intjuego.setVisible(true);					
				}
			}
			
			/*while(datos.next()) {
				if (datos.getString("nombreUsuario").toLowerCase() == usuario.toLowerCase()) {
					String comprobarPass = "SELECT contraseña FROM Usuarios WHERE nombreUsuario = '" + usuario + "'";
					ResultSet comprobar = conexion.ejecutarSelect(comprobarPass);
					if (comprobar.getString("contraseña") == contrasena) {
						JOptionPane.showMessageDialog(null, "Inicio de sesión correcto");
						Inter_juego intjuegos = new Inter_juego();
						intjuegos.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Contraseña incorrecta, inténtelo de nuevo");
					}
				}
			}*/
			//JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			
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
	