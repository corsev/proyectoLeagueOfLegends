/*package Utilidades;

import java.sql.*;

public class UtilidadesBBDD {

    private static final String url = "jdbc:mariadb://localhost:3306/leagueOfLegends";
    private static final String user = "root";
    private static final String password = "1234";


    private static Connection conectarConBD() {
        Connection conexion;
        try {
            conexion = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Error en la conexión:" + e.toString());
            return null;
        }
        return conexion;
    }
    public static void insertarFicheros(){

        Connection con = conectarConBD();

        try {
            PreparedStatement stmt = con.prepareStatement("INSERT * ")
        }
    }

   /* public static void mostrarPalas(){

        Connection con = conectarConBD();

        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM luchadores");
            ResultSet rs = stmt.executeQuery();

            //Recorremos los datos
            while (rs.next())
                System.out.println (rs.getString("nombre"));

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            try {
                // Cerramos conexiones
                if (con!=null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println("Error cerrando conexiones: "
                        + e.toString());
            }
        }
    } */





