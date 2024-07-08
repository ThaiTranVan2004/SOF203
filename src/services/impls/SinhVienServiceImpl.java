/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impls;

import java.util.ArrayList;
import models.SinhVien;
import services.SinhVienService;
import java.sql.*;
import repositories.DBContext;

/**
 *
 * @author thaitv
 */
public class SinhVienServiceImpl implements SinhVienService {

    private Connection conn = DBContext.getConnection();
    
    @Override
    public ArrayList<SinhVien> getList() {
        String sql = "SELECT * FROM SinhVien ORDER BY Tuoi ASC";
        ArrayList<SinhVien> listSinhViens = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Integer gioiTinh = rs.getInt("GioiTinh");
                Integer namSinh = rs.getInt("Tuoi");
                SinhVien sinhVien = new SinhVien(ma, ten, gioiTinh, namSinh);
                listSinhViens.add(sinhVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSinhViens;
    }

    @Override
    public void add(SinhVien sv) {
        String sql = "INSERT INTO SinhVien(Ma, Ten, GioiTinh, Tuoi) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, sv.getMa());
            ps.setObject(2, sv.getTen());
            ps.setObject(3, sv.getGioiTinh());
            ps.setObject(4, sv.getNamSinh());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
