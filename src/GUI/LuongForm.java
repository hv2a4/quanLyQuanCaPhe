/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LuongForm extends JFrame implements ActionListener {

    private JTextField tfMucLuongCoBan;
    private JTextField tfSoGioLamViec;
    private JTextField tfSoGioLamThem;
    private JComboBox<String> cbCongViec;
    private JButton btnTinhLuong;
    private JLabel lblKetQuaLuong;

    private Map<String, Double> heSoLuongMap;

    public LuongForm() {
        setTitle("Tính lương");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);

        // Tạo các thành phần giao diện
        tfMucLuongCoBan = new JTextField(10);
        tfSoGioLamViec = new JTextField(10);
        tfSoGioLamThem = new JTextField(10);
        cbCongViec = new JComboBox<>();
        btnTinhLuong = new JButton("Tính toán lương");
        lblKetQuaLuong = new JLabel("");

        // Thiết lập layout
        setLayout(new GridLayout(6, 2));

        // Tạo danh sách công việc và hệ số lương tương ứng
        heSoLuongMap = new HashMap<>();
        heSoLuongMap.put("Nhân viên pha chế", 1.2);
        heSoLuongMap.put("Nhân viên phục vụ", 1.0);
        heSoLuongMap.put("Nhân viên quản lý", 1.5);
        heSoLuongMap.put("Nhân viên thu ngân", 1.3);
        heSoLuongMap.put("Nhân viên quầy bar", 1.1);
        // Thêm các công việc khác và hệ số lương tương ứng vào map

        // Thêm các công việc vào combobox
        for (String congViec : heSoLuongMap.keySet()) {
            cbCongViec.addItem(congViec);
        }

        // Thêm các thành phần vào giao diện
        add(new JLabel("Mức lương cơ bản:"));
        add(tfMucLuongCoBan);
        add(new JLabel("Số giờ làm việc:"));
        add(tfSoGioLamViec);
        add(new JLabel("Số giờ làm thêm:"));
        add(tfSoGioLamThem);
        add(new JLabel("Công việc:"));
        add(cbCongViec);
        add(btnTinhLuong);
        add(lblKetQuaLuong);

        // Đăng ký sự kiện cho nút Tính toán lương
        btnTinhLuong.addActionListener(this);

        // Hiển thị giao diện
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTinhLuong) {
            // Lấy giá trị từ các trường nhập liệu
            double mucLuongCoBan = Double.parseDouble(tfMucLuongCoBan.getText());
            double soGioLamViec = Double.parseDouble(tfSoGioLamViec.getText());
            double soGioLamThem = Double.parseDouble(tfSoGioLamThem.getText());
            String congViec = (String) cbCongViec.getSelectedItem();
            double heSoLuong = heSoLuongMap.get(congViec);

            // Tính toán lương
            double luongThuongNgay = soGioLamViec * mucLuongCoBan;
            double luongLamThem = soGioLamThem * mucLuongCoBan * heSoLuong;
            double tongLuong = luongThuongNgay + luongLamThem;

            // Hiển thị kết quả lương
            lblKetQuaLuong.setText("Tổng lương: " + tongLuong);
        }
    }

    public static void main(String[] args) {
        new LuongForm();
    }
}
