/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class LoginDao {

    String url = "jdbc:sqlserver://localhost:1433;databasename=Coffee_shop_managers;user=sa;password=123456;encrypt=false;";

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public List<LoginOOP> getAllLogin() {
        List<LoginOOP> list = new ArrayList<>();
        String select = "select * from login";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(select)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String role = rs.getString("Role");

                LoginOOP login = new LoginOOP(username, password, role);
                list.add(login);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

   
}
