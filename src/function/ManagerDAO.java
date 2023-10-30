/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.net.URI;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author pc
 */
public class ManagerDAO {

    String url = "jdbc:sqlserver://localhost:1433;databasename=Coffee_shop_managers;user=sa;password=123456;encrypt=false";
    List<CafeStaff_Managers> list;

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public boolean checkDuplicateEmployeeCode(String employeeCode) {
        String query = "SELECT COUNT(*) FROM staffMember WHERE Employee_code = ?";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(query)) {
            pr.setString(1, employeeCode);

            try (ResultSet rs = pr.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<CafeStaff_Managers> getAllEmployee() {
        list = new ArrayList<>();
        String query = "select * from staffMember";
        try (Connection conn = connection(); PreparedStatement prms = conn.prepareStatement(query)) {
            ResultSet rs = prms.executeQuery();
            while (rs.next()) {
                CafeStaff_Managers sp = new CafeStaff_Managers();
                sp.setEmployee_code(rs.getString("Employee_code"));
                sp.setEmployee_name(rs.getString("Employee_name"));
                sp.setAddress(rs.getString("Address"));
                sp.setEmail(rs.getString("Email"));
                sp.setDate_of_birth(rs.getDate("Date_of_birth"));
                sp.setGender(rs.getString("Gender"));
                sp.setPath(rs.getString("path"));
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addEmployee(CafeStaff_Managers sp) {
        String insertQuery = "INSERT INTO staffMember (Employee_code, Employee_name, Address, Email, Date_of_birth, Gender, path) VALUES (?,?,?,?,?,?,?);";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(insertQuery)) {
            conn.setAutoCommit(false);

            pr.setString(1, sp.getEmployee_code());
            pr.setString(2, sp.getEmployee_name());
            pr.setString(3, sp.getAddress());
            pr.setString(4, sp.getEmail());
            pr.setDate(5, new java.sql.Date(sp.getDate_of_birth().getTime()));
            pr.setString(6, sp.getGender());
            pr.setString(7, sp.getPath());

            int rows = pr.executeUpdate();
            if (rows > 0) {
                System.out.println("Thêm nhân viên thành công!");
                conn.commit();
            } else {
                System.out.println("Thêm nhân viên thất bại!");
                conn.rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(CafeStaff_Managers sp) {
        String queryUpdate = "UPDATE staffMember SET Employee_name = ?, Address = ?, Email = ?,\n"
                + "Date_of_birth = ?, Gender = ?, path = ? WHERE Employee_code = ?";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(queryUpdate)) {
            conn.setAutoCommit(false);
            pr.setString(1, sp.getEmployee_name());
            pr.setString(2, sp.getAddress());
            pr.setString(3, sp.getEmail());
            pr.setDate(4, new java.sql.Date(sp.getDate_of_birth().getTime()));
            pr.setString(5, sp.getGender());
            pr.setString(6, sp.getPath());
            pr.setString(7, sp.getEmployee_code());

            int rows = pr.executeUpdate();
            if (rows == 1) {
                System.out.println("Cập nhật thông tin nhân viên thành công!");
                conn.commit();
            } else {
                System.out.println("Không tìm thấy nhân viên có mã " + sp.getEmployee_code() + " để cập nhật.");
                conn.rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteStaffMemberWithSalaryCalculation(String employeeCode) {
        String deleteStaffMemberSQL = "DELETE FROM staffMember WHERE Employee_code = ?";
        String deleteSalaryCalculationSQL = "DELETE FROM salaryCalculation WHERE Employee_code = ?";
        Connection conn = null;
        PreparedStatement deleteStaffMemberStmt = null;
        PreparedStatement deleteSalaryCalculationStmt = null;

        try {
            conn = connection();
            conn.setAutoCommit(false); 

            deleteSalaryCalculationStmt = conn.prepareStatement(deleteSalaryCalculationSQL);
            deleteSalaryCalculationStmt.setString(1, employeeCode);
            deleteSalaryCalculationStmt.executeUpdate();

            deleteStaffMemberStmt = conn.prepareStatement(deleteStaffMemberSQL);
            deleteStaffMemberStmt.setString(1, employeeCode);
            int rowsDeleted = deleteStaffMemberStmt.executeUpdate();

            if (rowsDeleted > 0) {
                conn.commit(); 
            } else {
                conn.rollback(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (deleteSalaryCalculationStmt != null) {
                    deleteSalaryCalculationStmt.close();
                }
                if (deleteStaffMemberStmt != null) {
                    deleteStaffMemberStmt.close();
                }
                if (conn != null) {
                    conn.setAutoCommit(true); 
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public CafeStaff_Managers search(String ID) {
        String search = "select * from staffMember where Employee_code = ?";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(search)) {
            pr.setString(1, ID);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                CafeStaff_Managers cf = new CafeStaff_Managers();
                cf.setEmployee_code(rs.getString(1));
                cf.setEmployee_name(rs.getString(2));
                cf.setAddress(rs.getString(3));
                cf.setEmail(rs.getString(4));
                cf.setDate_of_birth(rs.getDate(5));
                cf.setGender(rs.getString(6));
                cf.setPath(rs.getString(7));
                return cf;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

}
