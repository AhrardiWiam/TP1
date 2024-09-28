/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void save(Site s) {
        String url = "jdbc:mysql://localhost/db";
        String user = "root";
        String password = "";
        Connection cn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
            st = cn.createStatement();
            String req = "INSERT INTO SITE VALUES (NULL,'" + s.getNom() + "')";
            st.executeUpdate(req);
        } catch (SQLException e) {
            System.out.println("Erreur SQL");
        } catch (ClassNotFoundException ex) {
            System.out.println("Impossible de charger le driver");
        } finally {
            try {
                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }

    }

    public static void load() {
        String url = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String password = "";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
            st = cn.createStatement();
            String req = "SELECT * FROM site";
            rs = st.executeQuery(req);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Impossible de charger le driver");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {

                st.close();
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources " );
            }
        }
    }


public static void main(String[] args){
    //save(new Site("SAFFI"));
    //save(new Site("MARRAKECH"));
    //save(new Site ("EL JADIDA"));
    load();
}
}
