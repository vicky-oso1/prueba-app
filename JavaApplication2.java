/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author MARIA VICTORIA
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

public class ConexionJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tu_base_de_datos"; // Cambia "tu_base_de_datos" por el nombre de tu base de datos
        String usuario = "root"; // Usuario de la base de datos
        String contraseña = ""; // Contraseña de la base de datos (si aplica)

        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí puedes realizar operaciones con la base de datos
                // Por ejemplo, ejecutar consultas o insertar datos
                // ...

                // Cerrar la conexión
                conexion.close();
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}

}
