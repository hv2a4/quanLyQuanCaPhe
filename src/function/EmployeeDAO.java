/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class EmployeeDAO {

    String url = "jdbc:sqlserver://localhost:1433;databasename=Coffee_shop_managers;user=sa;password=123456;encrypt=false";
    List<EmployeeSalaryManagements> list;

    public Connection connection() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public boolean checkEmployeeExist(String employeeCode) {
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

    public boolean checkDuplicateSalary(String Salary_code) {
        String query = "SELECT COUNT(*) FROM salaryCalculation WHERE Salary_code = ?";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(query)) {
            pr.setString(1, Salary_code);

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

    public List<EmployeeSalaryManagements> getAllManagementse() {
        List<EmployeeSalaryManagements> list = new ArrayList<>();
        String query = "select * from salaryCalculation";
        try (Connection conn = connection(); PreparedStatement prms = conn.prepareStatement(query)) {
            ResultSet rs = prms.executeQuery();
            while (rs.next()) {
                EmployeeSalaryManagements sp = new EmployeeSalaryManagements();
                sp.setSalary_code(rs.getString("Salary_code"));
                sp.setBasic_salary(rs.getDouble("Basic_salary"));
                sp.setWorking_hours(rs.getTime("Working_hours"));
                sp.setOvertime_hours(rs.getTime("Overtime_hours"));
                sp.setJob_role(rs.getString("Job_role"));
                sp.setPay_grade(rs.getDouble("Pay_grade"));
                sp.setTotal_salary(rs.getDouble("Total_salary"));
                sp.setEmployee_code(rs.getString("Employee_code"));
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addEmployee(EmployeeSalaryManagements ep) {
        String insertCode = "INSERT INTO salaryCalculation (Salary_code, Basic_salary, Working_hours, Overtime_hours, Job_role, Pay_grade, Total_salary, Employee_code)\n"
                + "VALUES (?, ?, ?, ?, ?,?, ?, ?);";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(insertCode)) {
            conn.setAutoCommit(false);
            pr.setString(1, ep.getSalary_code());
            pr.setDouble(2, ep.getBasic_salary());
            pr.setTime(3, ep.getWorking_hours());
            pr.setTime(4, ep.getOvertime_hours());
            pr.setString(5, ep.getJob_role());
            pr.setDouble(6, ep.getPay_grade());
            pr.setDouble(7, ep.getTotal_salary());
            pr.setString(8, ep.getEmployee_code());

            int rows = pr.executeUpdate();
            if (rows == 1) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(String saraly) {
        String deleteCode = "delete from salaryCalculation where Salary_code = ?";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(deleteCode)) {
            conn.setAutoCommit(false);
            pr.setString(1, saraly);
            int rows = pr.executeUpdate();
            if (rows == 1) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {

        }
    }

    public void updateEmployee(EmployeeSalaryManagements ep) {
        String updateCode = "UPDATE salaryCalculation SET Basic_salary = ?, Working_hours = ?, Overtime_hours = ?, "
                + "Job_role = ?, Pay_grade = ?, Total_salary = ?, Employee_code = ? WHERE Salary_code = ?";
        try (Connection conn = connection(); PreparedStatement pr = conn.prepareStatement(updateCode)) {
            conn.setAutoCommit(false);
            pr.setDouble(1, ep.getBasic_salary());
            pr.setTime(2, ep.getWorking_hours());
            pr.setTime(3, ep.getOvertime_hours());
            pr.setString(4, ep.getJob_role());
            pr.setDouble(5, ep.getPay_grade());
            pr.setDouble(6, ep.getTotal_salary());
            pr.setString(7, ep.getEmployee_code());
            pr.setString(8, ep.getSalary_code());

            int rows = pr.executeUpdate();
            if (rows == 1) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();     
        }
    }

}
