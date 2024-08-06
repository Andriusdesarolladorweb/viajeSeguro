package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConexionMYSQL {
    private static final String URL = "jdbc:mysql://localhost:3306/viajaseguro";
    private static final String USER = "root"; // Cambia según tu configuración
    private static final String PASSWORD = ""; // Cambia según tu configuración

     public void ActualizarTickets(JTextField nombre, JTextField codigo, JTextField categoria, JTextField precio, String id)
    {
        String sql = "update productos set nombre = '" + nombre.getText() +"', codigo = '" + codigo.getText()+"', categoria = '" + categoria.getText()+ "', precio = '" + precio.getText() + "' where idProducto = " + id;
        Statement st;
           ConexionMYSQL con = new ConexionMYSQL();
    Connection cn = con.conectar();
        
        try
        {
            st = cn.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
     

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
