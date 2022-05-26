package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        ConnectionPool pool = new ConnectionPool();
        Connection con = null;
        try {
            con = pool.dataSource.getConnection();

            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from actor");
            while (rs.next()) {
                System.out.println("| " + rs.getInt(1) + " | " + rs.getString(2) + "|");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



    }
}
