/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import function.CafeStaff_Managers;
import function.EmployeeDAO;
import function.EmployeeSalaryManagements;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;

/**
 *
 * @author pc
 */
public class EmployeeSalaryManagement extends javax.swing.JFrame {
    
    private Map<String, Double> jobRolesMap;
    
    List<EmployeeSalaryManagements> list = new ArrayList<>();
    DefaultTableModel model;
    
    public EmployeeSalaryManagement() {
        initComponents();
        dataTable();
        loadDate();
        fillTable();
        initializeJobRolesMap();
        initializeComboBox();
        txtTotal_salary.setEnabled(false);
        
    }
    
    private void dataTable() {
        model = new DefaultTableModel();
        String arr_table[] = {
            "Salary code",
            "Basic salary",
            "Working hours",
            "Overtime hours",
            "Job role",
            "Pay grade",
            "Total salary",
            "Employee code",};
        model.setColumnIdentifiers(arr_table);
        tbleSalary.setModel(model);
        
    }
    
    public void fillTable() {
        
        model.setNumRows(0);
        for (EmployeeSalaryManagements sc : list) {
            String arr_table[] = {
                sc.getSalary_code(),
                sc.getBasic_salary() + "",
                sc.getWorking_hours() + "",
                sc.getOvertime_hours() + "",
                sc.getJob_role(),
                sc.getPay_grade() + "",
                sc.getTotal_salary() + "",
                sc.getEmployee_code(),};
            model.addRow(arr_table);
        }
        model.fireTableDataChanged();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnOpen = new javax.swing.JButton();
        txtID1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtOvertime_hours = new javax.swing.JTextField();
        txtWorking_hours = new javax.swing.JTextField();
        txtBasicSalary = new javax.swing.JTextField();
        cbbJobRole = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleSalary = new javax.swing.JTable();
        btnOpen1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtID2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotal_salary = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Employee information management");

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Open file.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Employee code");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage salary of coffee shop staff");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Employee code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Basic Salary");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Working hours");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Job role");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Overtime hours");

        cbbJobRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your job", "Bartender", "Saff", "Bar staff", "Management staff" }));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Save as.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tbleSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbleSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleSalaryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbleSalary);

        btnOpen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Open file.png"))); // NOI18N
        btnOpen1.setText("Open");
        btnOpen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpen1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Closed folder.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Salary code");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Total salary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOvertime_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbJobRole, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWorking_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(22, 22, 22)
                            .addComponent(txtID))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(47, 47, 47)
                            .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10)
                    .addComponent(txtTotal_salary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpen1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtWorking_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOvertime_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbbJobRole, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotal_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSearch)
                    .addComponent(btnAdd)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnDelete)
                    .addComponent(btnOpen1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeJobRolesMap() {
        jobRolesMap = new HashMap<>();
        jobRolesMap.put("Bartender", 1.2);
        jobRolesMap.put("Saff", 1.0);
        jobRolesMap.put("Bar staff", 1.1);
        jobRolesMap.put("Management staff", 1.5);
        jobRolesMap.put("Cashier", 1.3);
        
    }
    
    private void initializeComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Choose a job");
        for (String jobRole : jobRolesMap.keySet()) {
            model.addElement(jobRole);
        }
        cbbJobRole.setModel(model);
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String salaryCodeToSearch = txtID2.getText();
        
        if (salaryCodeToSearch.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a salary code to search!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!salaryCodeToSearch.matches("^SC\\d{3}$")) {
            JOptionPane.showMessageDialog(null, "Salary code must be in the format SCxxx (e.g., SC001)!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = false;
        for (EmployeeSalaryManagements employee : list) {
            if (employee.getSalary_code().equals(salaryCodeToSearch)) {
                txtID.setText(employee.getEmployee_code());
                txtBasicSalary.setText(String.valueOf(employee.getBasic_salary()));
                txtWorking_hours.setText(employee.getWorking_hours().toString());
                txtOvertime_hours.setText(employee.getOvertime_hours().toString());
                cbbJobRole.setSelectedItem(employee.getJob_role());
                txtTotal_salary.setText(employee.getTotal_salary() + "");
                JOptionPane.showMessageDialog(this, "Salary code found!", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                fillTable();
                found = true;
                break;
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(this, "Salary code not found!", "Search Result", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    private boolean validateInput() {
        String employeeCode = txtID.getText();
        String salaryCode = txtID2.getText();
        String basicSalary = txtBasicSalary.getText();
        String workingHours = txtWorking_hours.getText();
        String overtimeHours = txtOvertime_hours.getText();
        String jobRole = cbbJobRole.getSelectedItem().toString();
        
        if (employeeCode.isEmpty() || salaryCode.isEmpty() || basicSalary.isEmpty()
                || workingHours.isEmpty() || overtimeHours.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!employeeCode.matches("^EMP\\d{3}$")) {
            JOptionPane.showMessageDialog(null, "Employee code must be in the format EMPxxx (e.g., EMP001)!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!salaryCode.matches("^SC\\d{3}$")) {
            JOptionPane.showMessageDialog(null, "Salary code must be in the format SCxxx (e.g., SC001)!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (cbbJobRole.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "You haven't chosen a role yet!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            double basicSalaryValue = Double.parseDouble(basicSalary);
            if (basicSalaryValue < 0 || basicSalaryValue > 1000000) {
                JOptionPane.showMessageDialog(null, "Basic salary must be a non-negative number and within valid salary range!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Basic salary must be numeric!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String timeRegex = "^\\d{2}:\\d{2}:\\d{2}$";
        if (!workingHours.matches(timeRegex) || !overtimeHours.matches(timeRegex)) {
            JOptionPane.showMessageDialog(null, "Working hours and overtime hours must be in the format hh:mm:ss!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String[] workingHoursParts = workingHours.split(":");
        String[] overtimeHoursParts = overtimeHours.split(":");
        int workingHoursHour = Integer.parseInt(workingHoursParts[0]);
        int workingHoursMinute = Integer.parseInt(workingHoursParts[1]);
        int workingHoursSecond = Integer.parseInt(workingHoursParts[2]);
        int overtimeHoursHour = Integer.parseInt(overtimeHoursParts[0]);
        int overtimeHoursMinute = Integer.parseInt(overtimeHoursParts[1]);
        int overtimeHoursSecond = Integer.parseInt(overtimeHoursParts[2]);
        
        if (workingHoursHour < 0 || workingHoursHour > 23 || workingHoursMinute < 0 || workingHoursMinute > 59 || workingHoursSecond < 0 || workingHoursSecond > 59
                || overtimeHoursHour < 0 || overtimeHoursHour > 23 || overtimeHoursMinute < 0 || overtimeHoursMinute > 59 || overtimeHoursSecond < 0 || overtimeHoursSecond > 59) {
            JOptionPane.showMessageDialog(null, "Working hours and overtime hours must be within valid time range!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String Employee_code = txtID.getText();
        String Salary_code = txtID2.getText();
        String Basic_Salary = txtBasicSalary.getText();
        String Working_hours = txtWorking_hours.getText();
        String Overtime_hours = txtOvertime_hours.getText();
        String Job_role = cbbJobRole.getSelectedItem().toString();
        
        EmployeeDAO employeeDAO = new EmployeeDAO();
        if (!validateInput()) {
            return;
        }
        
        if (isSalaryCodeDuplicate(Salary_code)) {
            JOptionPane.showMessageDialog(this, "Salary code already exists in the list!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!employeeDAO.checkEmployeeExist(Employee_code)) {
            JOptionPane.showMessageDialog(this, "Employee code does not exist in the database!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            double basicSalary = Double.parseDouble(Basic_Salary);
            double payGrade = jobRolesMap.get(Job_role);
            
            Date workingHoursDate = timeFormat.parse(Working_hours);
            Date overtimeHoursDate = timeFormat.parse(Overtime_hours);
            
            double totalWorkingHours = calculateTotalHours(workingHoursDate);
            double totalOvertimeHours = calculateTotalHours(overtimeHoursDate);
            
            double dailySalary = totalWorkingHours * basicSalary;
            double overtimePay = totalOvertimeHours * basicSalary * payGrade;
            double totalSalary = dailySalary + overtimePay;
            txtTotal_salary.setText(totalSalary + "");
            EmployeeSalaryManagements sc = new EmployeeSalaryManagements();
            sc.setEmployee_code(Employee_code);
            sc.setSalary_code(Salary_code);
            sc.setBasic_salary(basicSalary);
            sc.setWorking_hours(new Time(workingHoursDate.getTime()));
            sc.setOvertime_hours(new Time(overtimeHoursDate.getTime()));
            sc.setJob_role(Job_role);
            sc.setPay_grade(payGrade);
            sc.setTotal_salary(totalSalary);
            
            employeeDAO.addEmployee(sc);
            list.add(sc);
            fillTable();
            clearForm();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format! Please use the format hh:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Basic salary must be numeric!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private boolean isSalaryCodeDuplicate(String salaryCode) {
        return list.stream().anyMatch(e -> e.getSalary_code().equals(salaryCode));
    }
    
    private void clearForm() {
        txtID.setText("");
        txtID2.setText("");
        txtBasicSalary.setText("");
        txtWorking_hours.setText("");
        txtOvertime_hours.setText("");
        cbbJobRole.setSelectedIndex(0);
        txtTotal_salary.setText("");
    }
    
    private double calculateTotalHours(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        return hours + (minutes / 60.0) + (seconds / 3600.0);
    }
    
    public void loadDate() {
        try {
            EmployeeDAO ep = new EmployeeDAO();
            list = ep.getAllManagementse();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private boolean isValidTimeFormat(String time) {
        String timeRegex = "^\\d{2}:\\d{2}:\\d{2}$";
        return time.matches(timeRegex);
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String Employee_code = txtID.getText();
        String Salary_code = txtID2.getText();
        String Basic_Salary = txtBasicSalary.getText();
        String Working_hours = txtWorking_hours.getText();
        String Overtime_hours = txtOvertime_hours.getText();
        String Job_role = cbbJobRole.getSelectedItem().toString();
        
        EmployeeDAO employeeDAO = new EmployeeDAO();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        if (!isValidTimeFormat(Working_hours) || !isValidTimeFormat(Overtime_hours)) {
            JOptionPane.showMessageDialog(null, "Working hours and overtime hours must be in the format hh:mm:ss!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double basicSalary;
        try {
            basicSalary = Double.parseDouble(Basic_Salary);
            if (basicSalary < 0) {
                JOptionPane.showMessageDialog(this, "Basic salary must be a non-negative number!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Basic salary must be numeric!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String[] workingHoursParts = Working_hours.split(":");
        String[] overtimeHoursParts = Overtime_hours.split(":");
        int workingHoursHour, workingHoursMinute, workingHoursSecond, overtimeHoursHour, overtimeHoursMinute, overtimeHoursSecond;
        
        try {
            workingHoursHour = Integer.parseInt(workingHoursParts[0]);
            workingHoursMinute = Integer.parseInt(workingHoursParts[1]);
            workingHoursSecond = Integer.parseInt(workingHoursParts[2]);
            overtimeHoursHour = Integer.parseInt(overtimeHoursParts[0]);
            overtimeHoursMinute = Integer.parseInt(overtimeHoursParts[1]);
            overtimeHoursSecond = Integer.parseInt(overtimeHoursParts[2]);
            
            if (workingHoursHour < 0 || workingHoursHour > 23 || workingHoursMinute < 0 || workingHoursMinute > 59 || workingHoursSecond < 0 || workingHoursSecond > 59
                    || overtimeHoursHour < 0 || overtimeHoursHour > 23 || overtimeHoursMinute < 0 || overtimeHoursMinute > 59 || overtimeHoursSecond < 0 || overtimeHoursSecond > 59) {
                JOptionPane.showMessageDialog(this, "Working hours and overtime hours must be within valid time range!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format! Please use the format hh:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!employeeDAO.checkEmployeeExist(Employee_code)) {
            JOptionPane.showMessageDialog(this, "Employee ID does not exist in the database!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            double payGrade = jobRolesMap.get(Job_role);
            
            Date workingHoursDate = timeFormat.parse(Working_hours);
            Date overtimeHoursDate = timeFormat.parse(Overtime_hours);
            
            double totalWorkingHours = calculateTotalHours(workingHoursDate);
            double totalOvertimeHours = calculateTotalHours(overtimeHoursDate);
            
            double dailySalary = totalWorkingHours * basicSalary;
            double overtimePay = totalOvertimeHours * basicSalary * payGrade;
            double totalSalary = dailySalary + overtimePay;
            txtTotal_salary.setText(totalSalary + "");
            boolean updated = false;
            for (int i = 0; i < list.size(); i++) {
                EmployeeSalaryManagements sc = list.get(i);
                if (sc.getSalary_code().equals(Salary_code)) {
                    sc.setEmployee_code(Employee_code);
                    sc.setBasic_salary(basicSalary);
                    sc.setWorking_hours(new Time(workingHoursDate.getTime()));
                    sc.setOvertime_hours(new Time(overtimeHoursDate.getTime()));
                    sc.setJob_role(Job_role);
                    sc.setPay_grade(payGrade);
                    sc.setTotal_salary(totalSalary);
                    employeeDAO.updateEmployee(sc);
                    updated = true;
                }
            }
            
            if (updated) {
                fillTable();
                clearForm();
                JOptionPane.showMessageDialog(this, "Update successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Code not found to update!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format! Please use the format hh:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveFile();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearForm();
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnOpen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpen1ActionPerformed
        readFile();
    }//GEN-LAST:event_btnOpen1ActionPerformed
    
    public void saveFile() {
        if (list == null || list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No data to save", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try (FileOutputStream fos = new FileOutputStream("data.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
            JOptionPane.showMessageDialog(rootPane, "File saved successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Error while saving file", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void readFile() {
        try (FileInputStream fis = new FileInputStream("data.txt"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof List) {
                List<?> tempList = (List<?>) obj;
                if (!tempList.isEmpty() && tempList.get(0) instanceof EmployeeSalaryManagements) {
                    list.clear();
                    list.addAll((List<EmployeeSalaryManagements>) tempList);
                    fillTable();
                    JOptionPane.showMessageDialog(rootPane, "File read successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "Error while reading file", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(rootPane, "No valid data found in the file", "Warning", JOptionPane.WARNING_MESSAGE);
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbleSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleSalaryMouseClicked
        int row = tbleSalary.getSelectedRow();
        if (row >= 0) {
            EmployeeSalaryManagements selectedEmployee = list.get(row);
            txtID.setText(selectedEmployee.getEmployee_code());
            txtID2.setText(selectedEmployee.getSalary_code());
            txtBasicSalary.setText(String.valueOf(selectedEmployee.getBasic_salary()));
            txtWorking_hours.setText(selectedEmployee.getWorking_hours().toString());
            txtOvertime_hours.setText(selectedEmployee.getOvertime_hours().toString());
            cbbJobRole.setSelectedItem(selectedEmployee.getJob_role());
            txtTotal_salary.setText(selectedEmployee.getTotal_salary()+"");
        }
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tbleSalaryMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String Salarycode = txtID2.getText();
        EmployeeDAO ec = new EmployeeDAO();
        if (Salarycode.isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have not entered the salary code to delete !", "Errol", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!Salarycode.matches("^SC\\d{3}$")) {
            JOptionPane.showMessageDialog(null, "Salary code must be in the format SCxxx (e.g., SC001)!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int chooser = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete!", "Delete", JOptionPane.YES_NO_OPTION);
        boolean check = false;
        List<EmployeeSalaryManagements> itemsToRemove = new ArrayList<>();
        
        for (EmployeeSalaryManagements ep : list) {
            if (ep.getSalary_code().equals(Salarycode)) {
                if (chooser == JOptionPane.YES_OPTION) {
                    itemsToRemove.add(ep);
                    check = true;
                    JOptionPane.showMessageDialog(this, "Deleted successfully");
                }
            }
            
        }
        if (check) {
            list.removeAll(itemsToRemove);
            fillTable();
            ec.deleteEmployee(Salarycode);
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "No salary code to delete!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalaryManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalaryManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalaryManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalaryManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSalaryManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnOpen1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbJobRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tbleSalary;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtOvertime_hours;
    private javax.swing.JTextField txtTotal_salary;
    private javax.swing.JTextField txtWorking_hours;
    // End of variables declaration//GEN-END:variables
}
