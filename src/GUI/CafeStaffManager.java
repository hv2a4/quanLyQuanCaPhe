/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.sun.net.httpserver.Authenticator;
import function.CafeStaff_Managers;
import function.ManagerDAO;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.invoke.MethodHandles;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class CafeStaffManager extends javax.swing.JFrame {

    private String selectedPath = "";
    DefaultTableModel model;
    List<CafeStaff_Managers> list = new ArrayList<>();

    public CafeStaffManager() {
        initComponents();
        dataTable();
        loadData();
        fillTable();
    }

    public void dataTable() {
        model = new DefaultTableModel();
        String arr_table[] = {
            "Employee code",
            "Employee name",
            "Address",
            "Email",
            "Date of birth",
            "Gender",
            "Path",};
        model.setColumnIdentifiers(arr_table);
        tbtEmployee.setModel(model);
    }

    public void fillTable() {
        model.setRowCount(0);
        for (CafeStaff_Managers sp : list) {
            String arr_add[] = {
                sp.getEmployee_code(),
                sp.getEmployee_name(),
                sp.getAddress(),
                sp.getEmail(),
                sp.getDate_of_birth() + "",
                sp.getGender(),
                sp.getPath()
            };
            model.addRow(arr_add);
        }
        model.fireTableDataChanged();
    }

    public void loadData() {
        try {
            ManagerDAO managerDAO = new ManagerDAO();
            list = managerDAO.getAllEmployee();
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No data found in the database.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error while fetching data from database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSortCode = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtEmployee = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblPath = new javax.swing.JLabel();
        rdoOther = new javax.swing.JRadioButton();

        jLabel3.setText("jLabel3");

        jScrollPane1.setViewportView(jTree1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Employee information management");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Employee code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Employee name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Date of birth");

        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoMale.setText("Male");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoFemale.setText("Female");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Gender");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Edit.png"))); // NOI18N
        btnUdate.setText("Update");
        btnUdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Open file.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Save as.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSortCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Actions-view-sort-descending-icon.png"))); // NOI18N
        btnSortCode.setText("Sort name");
        btnSortCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortCodeActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Closed folder.png"))); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSortCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUdate)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpen)
                    .addComponent(btnSave)
                    .addComponent(btnSortCode)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tbtEmployee.setModel(new javax.swing.table.DefaultTableModel(
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
        tbtEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtEmployeeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtEmployee);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPath.setText("Click me");
        lblPath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPath.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPathMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPath, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );

        buttonGroup1.add(rdoOther);
        rdoOther.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoOther, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(txtAddress)
                                    .addComponent(txtEmployeeName)
                                    .addComponent(txtEmployeeID)
                                    .addComponent(txtDateOfBirth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rdoMale)
                    .addComponent(rdoFemale)
                    .addComponent(rdoOther))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkIsEmpty() {
        String ID = txtEmployeeID.getText();
        String name = txtEmployeeName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String dateOfBirth = txtDateOfBirth.getText();
        String path = selectedPath;

        if (ID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee ID is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (!ID.matches("^EMP\\d{3}$")) {
            JOptionPane.showMessageDialog(this, "Invalid Employee ID format! Employee ID must be in the format EMPxxx (e.g., EMP001).", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee name is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (address.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (email.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (dateOfBirth.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date of birth is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Gender is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (path.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Path is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        return false;
    }

    public boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    private Date parseDateOfBirth(String dateStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        return dateFormat.parse(dateStr);
    }

    private String getSelectedGender() {
        if (rdoMale.isSelected()) {
            return "Male";
        } else if (rdoFemale.isSelected()) {
            return "Female";
        } else if (rdoOther.isSelected()) {
            return "Other";
        } else {
            return "";
        }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (checkIsEmpty()) {
            return;
        }

        try {
            String ID = txtEmployeeID.getText();
            String name = txtEmployeeName.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            String dateOfBirthStr = txtDateOfBirth.getText();
            String path = selectedPath;
            String gender = "";

            if (rdoMale.isSelected()) {
                gender += "Male";
            } else if (rdoFemale.isSelected()) {
                gender += "Female";
            } else if (rdoOther.isSelected()) {
                gender += "Other";
            }

            for (CafeStaff_Managers employee : list) {
                if (employee.getEmployee_code().equals(ID)) {
                    JOptionPane.showMessageDialog(this, "Employee ID already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            Date dateOfBirth = parseDateOfBirth(dateOfBirthStr);

            try {

                ManagerDAO managerDAO = new ManagerDAO();
                CafeStaff_Managers cf = new CafeStaff_Managers(ID, name, address, email, dateOfBirth, gender, path);
                managerDAO.checkDuplicateEmployeeCode(ID);
                list.add(cf);
                managerDAO.addEmployee(cf);
                fillTable();
                JOptionPane.showMessageDialog(this, "Added success list!");
                cleanForm();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error while adding employee to database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date of birth format. Please use format yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    public void cleanForm() {
        txtEmployeeID.setText("");
        txtEmployeeName.setText("");
        txtAddress.setText("");
        txtEmail.setText("");
        txtDateOfBirth.setText("");
        lblPath.setText("Click me");
        lblPath.setIcon(null);
        buttonGroup1.clearSelection();
    }

    private void btnUdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUdateActionPerformed
        String employeeID = txtEmployeeID.getText();
        String employeeName = txtEmployeeName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String dateOfBirthStr = txtDateOfBirth.getText();
        String path = selectedPath;
        String gender = "";

        if (rdoMale.isSelected()) {
            gender += "Male";
        } else if (rdoFemale.isSelected()) {
            gender += "Female";
        } else if (rdoOther.isSelected()) {
            gender += "Other";
        }
        if (employeeID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee ID is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!employeeID.matches("^EMP\\d{3}$")) {
            JOptionPane.showMessageDialog(this, "Invalid Employee ID format! Employee ID must be in the format EMPxxx (e.g., EMP001).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Date dateOfBirth = parseDateOfBirth(dateOfBirthStr);

            int confirmUpdate = JOptionPane.showConfirmDialog(this, "Are you sure you want to update?", "Update", JOptionPane.YES_NO_OPTION);
            if (confirmUpdate == JOptionPane.YES_OPTION) {
                // Tìm trong danh sách 'list' xem có nhân viên nào có mã 'employeeID' không
                CafeStaff_Managers managersToUpdate = null;
                for (CafeStaff_Managers sp : list) {
                    if (sp.getEmployee_code().equals(employeeID)) {
                        managersToUpdate = sp;
                        break;
                    }
                }

                if (managersToUpdate != null) {
                    // Cập nhật thông tin của nhân viên được chọn
                    managersToUpdate.setEmployee_name(employeeName);
                    managersToUpdate.setAddress(address);
                    managersToUpdate.setEmail(email);
                    managersToUpdate.setDate_of_birth(dateOfBirth);
                    managersToUpdate.setGender(gender);
                    managersToUpdate.setPath(path);

                    // Gọi phương thức update trong class ManagerDAO để cập nhật vào cơ sở dữ liệu
                    ManagerDAO managerDAO = new ManagerDAO();
                    managerDAO.update(managersToUpdate);

                    // Nạp lại dữ liệu từ cơ sở dữ liệu và điền vào bảng
                    loadData();
                    fillTable();

                    JOptionPane.showMessageDialog(this, "Update was successful!", "Update", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Employee with ID " + employeeID + " not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date of birth format. Please use format yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String employeeID = txtEmployeeID.getText();
        if (employeeID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee ID is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        CafeStaff_Managers cf = null;
        try {
            for (CafeStaff_Managers sp : list) {
                if (employeeID.equals(sp.getEmployee_code())) {
                    cf = sp;
                }
            }
            if (cf != null) {
                int location = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete it?", "Delete", JOptionPane.YES_NO_OPTION);
                if (location == JOptionPane.YES_OPTION) {
                    list.remove(cf);
                    fillTable();
                    ManagerDAO managerDAO = new ManagerDAO();
                    managerDAO.deleteStaffMemberWithSalaryCalculation(employeeID);
                    JOptionPane.showMessageDialog(this, "successful delete!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No salary code to delete!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String ID = txtEmployeeID.getText();
        if (ID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee ID is required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            boolean employeeFound = false;
            for (CafeStaff_Managers cf : list) {
                if (cf.getEmployee_code().equals(ID)) {
                    txtEmployeeID.setText(cf.getEmployee_code());
                    txtEmployeeName.setText(cf.getEmployee_name());
                    txtAddress.setText(cf.getAddress());
                    txtDateOfBirth.setText(String.valueOf(cf.getDate_of_birth()));
                    txtEmail.setText(cf.getEmail());

                    String gender = cf.getGender();
                    if (gender != null && !gender.isEmpty()) {
                        if (gender.equalsIgnoreCase("male")) {
                            rdoMale.setSelected(true);
                        } else if (gender.equalsIgnoreCase("female")) {
                            rdoFemale.setSelected(true);
                        } else {
                            rdoOther.setSelected(true);
                        }
                    } else {
                        buttonGroup1.clearSelection();
                    }

                    // Set the employeeFound flag to true
                    employeeFound = true;

                    // Display the image if available, otherwise clear lblPath
                    String imagePath = cf.getPath();
                    if (imagePath != null && !imagePath.isEmpty()) {
                        lblPath.setText("");
                        Image image = new ImageIcon(imagePath).getImage().getScaledInstance(lblPath.getWidth(), lblPath.getHeight(), Image.SCALE_SMOOTH);
                        lblPath.setIcon(new ImageIcon(image));
                    } else {
                        lblPath.setIcon(null);
                        lblPath.setText("No Image Available");
                    }

                    break;
                }
            }
            if (employeeFound) {
                JOptionPane.showMessageDialog(this, "1 result found!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // If employee is not found, display a message
                JOptionPane.showMessageDialog(this, "Employee with ID " + ID + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

                txtEmployeeName.setText("");
                txtAddress.setText("");
                txtDateOfBirth.setText("");
                txtEmail.setText("");
                buttonGroup1.clearSelection();
                lblPath.setIcon(null);
                lblPath.setText("No Image Available");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cleanForm();
        btnDelete.setEnabled(false);
        btnUdate.setEnabled(false);
        btnAdd.setEnabled(true);
        btnSearch.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        readFile();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveFile();
    }//GEN-LAST:event_btnSaveActionPerformed

    public void sortEmployeesByNameOnForm() {
        Comparator<CafeStaff_Managers> comparator = new Comparator<CafeStaff_Managers>() {
            @Override
            public int compare(CafeStaff_Managers o1, CafeStaff_Managers o2) {
                String employeeName1 = o1.getEmployee_name();
                String employeeName2 = o2.getEmployee_name();
                return employeeName1.compareToIgnoreCase(employeeName2);
            }
        };

        Collections.sort(list, comparator);
    }

    private void btnSortCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortCodeActionPerformed
        ManagerDAO managerDAO = new ManagerDAO();
        sortEmployeesByNameOnForm();
        fillTable();
    }//GEN-LAST:event_btnSortCodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if (!tempList.isEmpty() && tempList.get(0) instanceof CafeStaff_Managers) {
                    list.clear();
                    list.addAll((List<CafeStaff_Managers>) tempList);
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

    private void lblPathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPathMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                selectedPath = fileChooser.getSelectedFile().getAbsolutePath();
                File selectedFile = new File(selectedPath);
                if (selectedFile.isFile() && selectedFile.exists()) {
                    lblPath.setText("");
                    //lấy đường dẫn của jfilechooser
                    selectedFile = fileChooser.getSelectedFile().getAbsoluteFile();
                    // Đọc ảnh từ đường dẫn đã chọn và chuyển đổi thành ImageIcon
                    ImageIcon inImageIcon = new ImageIcon(selectedPath);

                    // Lấy kích thước của nhãn để thay đổi kích thước ảnh
                    int width = lblPath.getWidth();
                    int height = lblPath.getHeight();

                    // Thay đổi kích thước ảnh để phù hợp với kích thước nhãn
                    Image inImage = inImageIcon.getImage();
                    Image outImage = inImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                    ImageIcon outImageIcon = new ImageIcon(outImage);
                    selectedFile = selectedFile.getAbsoluteFile();

                    // Đưa ảnh vào JLabel bằng phương thức setIcon
                    lblPath.setIcon(outImageIcon);
                } else {
                    // Nếu người dùng không chọn ảnh, hiển thị thông báo lỗi
                    JOptionPane.showMessageDialog(this, "No image selected.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error while getting selected path.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (result == JFileChooser.CANCEL_OPTION) {
            // Nếu người dùng bỏ qua việc chọn ảnh
            JOptionPane.showMessageDialog(this, "No image selected.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (result == JFileChooser.ERROR_OPTION) {
            // Nếu xảy ra lỗi khi hiển thị JFileChooser
            JOptionPane.showMessageDialog(this, "An error occurred while opening the file chooser.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblPathMouseClicked

    private void tbtEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtEmployeeMouseClicked
        int selectedRow = tbtEmployee.getSelectedRow();
        if (selectedRow >= 0) {
            CafeStaff_Managers cf = list.get(selectedRow);
            txtEmployeeID.setText(cf.getEmployee_code());
            txtEmployeeName.setText(cf.getEmployee_name());
            txtAddress.setText(cf.getAddress());
            txtEmail.setText(cf.getEmail());

            // Hiển thị ngày sinh
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtDateOfBirth.setText(sdf.format(cf.getDate_of_birth()));

            // Xử lý giới tính
            String gender = cf.getGender();
            if (gender != null && !gender.isEmpty()) {
                if (gender.equalsIgnoreCase("male")) {
                    rdoMale.setSelected(true);
                } else if (gender.equalsIgnoreCase("female")) {
                    rdoFemale.setSelected(true);
                } else {
                    rdoOther.setSelected(true);
                }
            } else {
                buttonGroup1.clearSelection();
            }

            // Xử lý đường dẫn ảnh và hiển thị lên lblPath
            String imagePath = cf.getPath();
            if (imagePath != null && !imagePath.isEmpty()) {
                //xóa đoạn văn bản của lable 
                lblPath.setText("");

                ImageIcon imgIcon = new ImageIcon(imagePath);
                // Đưa ảnh vào lblPath và điều chỉnh kích thước
                Image image = imgIcon.getImage().getScaledInstance(lblPath.getWidth(), lblPath.getHeight(), Image.SCALE_SMOOTH);
                lblPath.setIcon(new ImageIcon(image));
            } else {
                // Nếu đường dẫn ảnh rỗng hoặc không hợp lệ, xóa hình ảnh trong lblPath
                lblPath.setIcon(null);
            }
            // xử lý nút khi người dùng mouclick
            btnAdd.setEnabled(false);
            btnSearch.setEnabled(false);
            btnDelete.setEnabled(true);
            btnUdate.setEnabled(true);
        }
    }//GEN-LAST:event_tbtEmployeeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CafeStaffManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CafeStaffManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CafeStaffManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CafeStaffManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CafeStaffManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSortCode;
    private javax.swing.JButton btnUdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblPath;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JRadioButton rdoOther;
    private javax.swing.JTable tbtEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
