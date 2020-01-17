package metodos;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import hibernate.Albergue;
import hibernate.Alojamiento;
import hibernate.BBDD;
import hibernate.Camping;
public class InsertarDatos {
	static BBDD connection = new BBDD();
	public  void insertaralbergue(Albergue albergue, int cont) throws IOException {

		String sql = "INSERT INTO albergue VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			// Cogemos la sentencia realizada anteriormente
			PreparedStatement ps = connection.conectarBase().prepareStatement(sql);
			// asignamos los atributos a la consulta
			String IdAlb = "alb"+cont;
			ps.setString(1, IdAlb);
			ps.setString(2, albergue.getNombre());
			ps.setString(3, albergue.getUbicacion());
			ps.setInt(4, albergue.getCapacidad());
			ps.setString(5, albergue.getCategoria());
			ps.setString(6, albergue.getWeb());
			ps.setString(7, albergue.getPrecio());
			ps.setString(8, albergue.getLatitud());
			ps.setString(9, albergue.getLongitud());
			ps.executeUpdate();
			//logger.escribirlog("Insert de empleado ralizado.", "insertarempleado");
			System.out.println("Insert correcto");
		} catch (SQLException e) {
			System.out.println("Insert Erroneo");
			//TODO
			
			//logger.escribirlog("Insert Erroneo", "insertarempleados");
			
			
		}finally {
			connection.desconectar();
		}

		
	}
	public  void insertarAlojamineto(Alojamiento alojamineto, int cont) throws IOException {

		String sql = "INSERT INTO alojamiento VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			// Cogemos la sentencia realizada anteriormente
			PreparedStatement ps = connection.conectarBase().prepareStatement(sql);
			// asignamos los atributos a la consulta
			String IdAlb = "alo"+cont;
			ps.setString(1, IdAlb);
			ps.setString(2, alojamineto.getNombre());
			ps.setString(3, alojamineto.getUbicacion());
			ps.setInt(4, alojamineto.getCapacidad());
			ps.setString(5, alojamineto.getCategoria());
			ps.setString(6, alojamineto.getWeb());
			ps.setString(7, alojamineto.getPrecio());
			ps.setString(8, alojamineto.getLatitud());
			ps.setString(9, alojamineto.getLongitud());
			ps.executeUpdate();
			//logger.escribirlog("Insert de empleado ralizado.", "insertarempleado");
			System.out.println("Insert correcto");
		} catch (SQLException e) {
			System.out.println("Insert Erroneo");
			//TODO
			
			//logger.escribirlog("Insert Erroneo", "insertarempleados");
			
			
		}finally {
			connection.desconectar();
		}

		
	}
	public  void insertarCamping(Camping camping, int cont) throws IOException {

		String sql = "INSERT INTO camping VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			// Cogemos la sentencia realizada anteriormente
			PreparedStatement ps = connection.conectarBase().prepareStatement(sql);
			// asignamos los atributos a la consulta
			String IdAlb = "cam"+cont;
			ps.setString(1, IdAlb);
			ps.setString(2, camping.getNombre());
			ps.setString(3, camping.getUbicacion());
			ps.setInt(4, camping.getCapacidad());
			ps.setString(5, camping.getCategoria());
			ps.setString(6, camping.getWeb());
			ps.setString(7, camping.getPrecio());
			ps.setString(8, camping.getLatitud());
			ps.setString(9, camping.getLongitud());
			ps.executeUpdate();
			//logger.escribirlog("Insert de empleado ralizado.", "insertarempleado");
			System.out.println("Insert correcto");
		} catch (SQLException e) {
			System.out.println("Insert Erroneo");
			//TODO
			
			//logger.escribirlog("Insert Erroneo", "insertarempleados");
			
			
		}finally {
			connection.desconectar();
		}

		
	}
}
