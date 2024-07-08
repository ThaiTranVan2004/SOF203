/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impls;

import java.util.ArrayList;
import models.SanPham;
import services.SanPhamService;
import java.sql.*;
import repositories.DBContext;

/**
 *
 * @author thaitv
 */
public class SanPhamServiceImpl implements SanPhamService {

    private Connection conn = DBContext.getConnection();
    
    @Override
    public ArrayList<SanPham> getList() {
        String sql = "SELECT * FROM SanPham ORDER BY Id ASC";
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                int id = rs.getInt(1);
                String tenSP = rs.getString(2);
                int soLuongTon = rs.getInt(3);
                String danhMuc = rs.getString(4);
                int trangThai = rs.getInt(5);
                SanPham sanPham = new SanPham(id, tenSP, soLuongTon, danhMuc, trangThai);
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    @Override
    public void them(SanPham sanPham) {
        String sql = "INSERT INTO SanPham(TenSP, SoLuongTon, DanhMuc, TrangThai) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, sanPham.getTenSP());
            ps.setObject(2, sanPham.getSoLuongTon());
            ps.setObject(3, sanPham.getDanhMuc());
            ps.setObject(4, sanPham.getTrangThai());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xoa(int id) {
        String sql = "DELETE FROM SanPham WHERE Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sua(SanPham sanPham) {
        String sql = "UPDATE SanPham SET TenSP = ?, SoLuongTon = ?, DanhMuc = ?, TrangThai = ? WHERE Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(5, sanPham.getId());
            ps.setObject(1, sanPham.getTenSP());
            ps.setObject(2, sanPham.getSoLuongTon());
            ps.setObject(3, sanPham.getDanhMuc());
            ps.setObject(4, sanPham.getTrangThai());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
