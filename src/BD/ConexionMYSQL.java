package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMYSQL {
    private static final String URL = "jdbc:mysql://localhost:3306/viajaseguro";
    private static final String USER = "root"; // Cambia según tu configuración
    private static final String PASSWORD = ""; // Cambia según tu configuración

    public static Connection conectar() {
        Connection cn = null;
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
        }
        return cn;
    }

    public static void main(String[] args) {
        Connection conn = conectar();
        if (conn != null) {
            System.out.println("Conexión exitosa!");
        } else {
            System.out.println("Conexión fallida!");
        }
    }
}
