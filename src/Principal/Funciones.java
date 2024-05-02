package Principal;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

import BaseDatos.ConexionMySQL;
import InterfazInicio.Inter_juego;

public class Funciones {
	//Funcion para añadir un usuario a la base
	
	public static boolean Registro () {
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
			
			//Controlamos la entrada de 2 contraseñas correctas y si es así, entramos a recorrer el nombre de usuario
			boolean entra = true;
			boolean existeUsuario = false;
			
			if (contrasena != confContra) {
				entra = false;
			}
			else {
				InterfazInicio.Registrar.passwordField.setText("");
				InterfazInicio.Registrar.passwordField_1.setText("");
				JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
				return false;
			}
			//Ahora si entramos en nuestra base de datos y miramos usuario por usuario si se repite el nombre de usuario
			while (entra && datos.next()) {
				if (datos.getString("nombreUsuario").equals(usuario)) {
					existeUsuario = true;
					InterfazInicio.Registrar.txtUsuario.setText("");
					JOptionPane.showMessageDialog(null, "Nombre de Usuario existente");
					return false;
				}
				else {
					existeUsuario = false;
				}
			}
			
			if (!existeUsuario) {
				String insertar = "INSERT INTO Usuarios (nombre, primerApellido, segundoApellido, correoElectronico, nombreUsuario, contraseña)"
						+ " VALUES ('" + nombre + "', '" + apellido1 + "', '" + apellido2 + "', '" + correo + "', '" + usuario + "', '"
						+ contrasena + "')";
				conexion.ejecutarInsertDeleteUpdate(insertar);
				JOptionPane.showMessageDialog(null, "Registrado correctamente");
				System.out.println("Insertado correctamente");
				return true;
			}
			else {
				return false;
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
		return false;
	}
	public static boolean InicioSesion() {
		String usuario = InterfazInicio.InicioSesion.textFieldUsuario.getText();
		char[] pass	= InterfazInicio.InicioSesion.passwordField.getPassword();
		//pasamos la contraseña a string
		String contrasena = new String(pass); 
		ConexionMySQL conexion = new ConexionMySQL("root", "test", "mydb");	
		
		System.out.println("Establece conexión");
		
		try {
			conexion.conectar();
			String sentenciaPass = "SELECT * FROM Usuarios WHERE nombreUsuario = '" + usuario + "';";
			ResultSet contras;
			contras = conexion.ejecutarSelect(sentenciaPass);
			System.out.println(sentenciaPass);
			//primero comprobaremos que exista el usuario
			while(contras.next()) {
				System.out.println(contras.getString("nombreUsuario"));
				if (contrasena.equals(contras.getString("contraseña"))){
					System.out.println("contraseña correcta" + contras.getString("contraseña"));
					
					return true;
				}
				else {
					System.out.println("contraseña incorrecta");
					return false;
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
		return false;
	}
}
	