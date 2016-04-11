package com.naafa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
	
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Singleton..
	 * Una sola instancia de manipulacion a la base de datos.
	 */
	public final static BaseDatos basedatos = new BaseDatos();
	/**
	 * Objeto conexion.
	 */
	private Connection connection = null;
	
	/**
	 * Obtenemos singleton.
	 * @return
	 */
	public BaseDatos getBaseDatos(){
		return basedatos;
	}
	
	public void conectar(String host,String usuario,String password){
		try{
		connection = DriverManager.getConnection(host,usuario,password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	if (connection != null) {
		System.out.println("Base de datos conectada.");
	} else {
		System.out.println("Fallo la conexion a la base de datos!");
	}
	}
	
	/**
	 * Query
	 * @param query
	 */
	public void query(String query){
		
	}
	
}
