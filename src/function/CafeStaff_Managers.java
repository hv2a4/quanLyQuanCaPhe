    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package function;

import java.io.Serializable;
    import java.util.Date;

    /**
     *
     * @author pc
     */
   public class CafeStaff_Managers implements  Serializable{

    // Private fields representing attributes of cafe staff managers
    private String employee_code;
    private String employee_name;
    private String address;
    private String Email;
    private Date Date_of_birth;
    private String Gender;
    private String path;

    // Constructor to initialize the attributes
    public CafeStaff_Managers(String employee_code, String employee_name, String address, String Email, Date Date_of_birth, String Gender, String path) {
        this.employee_code = employee_code;
        this.employee_name = employee_name;
        this.address = address;
        this.Email = Email;
        this.Date_of_birth = Date_of_birth;
        this.Gender = Gender;
        this.path = path;
    }

    // Default constructor (no arguments)
    public CafeStaff_Managers() {
    }

    // Getters and setters for all attributes

    public String getEmployee_code() {
        return employee_code;
    }

    public void setEmployee_code(String employee_code) {
        this.employee_code = employee_code;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(Date Date_of_birth) {
        this.Date_of_birth = Date_of_birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
