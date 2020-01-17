package hibernate;

	import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	 
public class BBDD {
	
	private Connection conexion;
	//Metodo al que llamaremos para inicializar la conexion con la base de datos
	public Connection conectarBase() {
		
		//Variables para la conexion
		String usuario=Fitxero.user,password=Fitxero.pass,url=Fitxero.URL;
	
		//llamamos al Driver
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver cargado");
			//TODO
		} catch (ClassNotFoundException e) {
			// TODO 
			System.err.println("Driver no encontrado");
			e.printStackTrace();
		}
		
		//establecemos la conexion pasando los parametros definidos
		try {
			 conexion = DriverManager.getConnection(
					   url,
					   usuario,
					   password);
			System.out.println("Conexion completa");
			//TODO
			return conexion;
			
		} catch (SQLException e) {
			System.err.println("Error en la conexion");
			//TODO
			e.printStackTrace();
			return null;
		}
	}
	
	
	//Método para desconectar la BBDD
	
	public void desconectar() {
        if(conexion != null) {
            try {
                conexion.close();
                conexion = null;
                System.out.println("Conexion cerrada");
                //TODO
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
	 
