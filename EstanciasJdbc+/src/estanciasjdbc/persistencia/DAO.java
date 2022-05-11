package estanciasjdbc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected ResultSetMetaData resultadoMeta = null; // Este sirve cuando queremos traer informacion de tablas. Como cuantas columnas hay de x informacion
    protected Statement sentencia = null;
    private String user = "root";
    private String password = "root";
    private String database = "estancias_exterior";

    protected void conectarBase() throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + database + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            throw new Exception("Error de Sistemas");
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error de Sistemas");
        }
    }
    
    protected void consultarBase(String sql) throws Exception {
        try {
            //Creamos la conexión a la base
            conectarBase();
            //Creamos la sentencia
            sentencia = conexion.createStatement();
            //Ejecutamos la sentencia y obtenemos los resultados
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error de Sistemas");
        }
    }

}
