package py.edu.facitec.tarea.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionManager {
	
	private static Connection conexion;
	public static Statement stm;
	
	private static final String URL = "jdbc:postgresql://localhost:5432/db_tarea";
	private static final String USER= "postgres";
	private static final String PASSWORD= "123456";
	
	
	public static Connection abrirConexion(){
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			conexion  = DriverManager.getConnection(URL, USER, PASSWORD);
			stm= conexion.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;		
	}
	public static void cerrarConexion(){
		try {
			conexion.close();
			stm.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ConexionManager.abrirConexion();
		
	}
	

}
