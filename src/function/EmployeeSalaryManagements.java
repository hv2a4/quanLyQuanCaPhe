/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.io.Serializable;
import java.sql.Time;

public class EmployeeSalaryManagements implements Serializable{

    private String Salary_code;
    private double Basic_salary;
    private Time Working_hours;
    private Time Overtime_hours;
    private String Job_role;
    private double Pay_grade;
    private double Total_salary;
    private String Employee_code;

    public EmployeeSalaryManagements(String Salary_code, double Basic_salary, Time Working_hours, Time Overtime_hours, String Job_role, double Pay_grade, double Total_salary, String Employee_code) {
        this.Salary_code = Salary_code;
        this.Basic_salary = Basic_salary;
        this.Working_hours = Working_hours;
        this.Overtime_hours = Overtime_hours;
        this.Job_role = Job_role;
        this.Pay_grade = Pay_grade;
        this.Total_salary = Total_salary;
        this.Employee_code = Employee_code;
    }

    public EmployeeSalaryManagements() {
    }

    
    public String getSalary_code() {
        return Salary_code;
    }

    public void setSalary_code(String Salary_code) {
        this.Salary_code = Salary_code;
    }

    public double getBasic_salary() {
        return Basic_salary;
    }

    public void setBasic_salary(double Basic_salary) {
        this.Basic_salary = Basic_salary;
    }

    public Time getWorking_hours() {
        return Working_hours;
    }

    public void setWorking_hours(Time Working_hours) {
        this.Working_hours = Working_hours;
    }

    public Time getOvertime_hours() {
        return Overtime_hours;
    }

    public void setOvertime_hours(Time Overtime_hours) {
        this.Overtime_hours = Overtime_hours;
    }

    public String getJob_role() {
        return Job_role;
    }

    public void setJob_role(String Job_role) {
        this.Job_role = Job_role;
    }

    public double getPay_grade() {
        return Pay_grade;
    }

    public void setPay_grade(double Pay_grade) {
        this.Pay_grade = Pay_grade;
    }

    public double getTotal_salary() {
        return Total_salary;
    }

    public void setTotal_salary(double Total_salary) {
        this.Total_salary = Total_salary;
    }

    public String getEmployee_code() {
        return Employee_code;
    }

    public void setEmployee_code(String Employee_code) {
        this.Employee_code = Employee_code;
    }
}
