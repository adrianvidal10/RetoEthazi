package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Fitxero {

	protected static PreparedStatement statement = null;
	protected static ResultSet rs = null;
	static String pass="root2";
	static String user="root2";
	static String nombre="retoethazi";
	static String server="192.168.106.14";
	static String URL="jdbc:mysql://"+server+":3306/"+nombre+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
}