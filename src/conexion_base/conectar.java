/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Brandon Flores
 */
public class conectar {
    Connection conect = null;
	public Connection conexion()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conect = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
				System.out.println("Conexion establecida al sistema");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Error de conexion");
			}
			return conect;
		}
    
}