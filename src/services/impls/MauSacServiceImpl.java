/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impls;

import java.util.ArrayList;
import models.MauSac;
import services.MauSacService;
import java.sql.*;
import repositories.DBContext;

/**
 *
 * @author thaitv
 */
public class MauSacServiceImpl implements MauSacService {
    
    private Connection conn = DBContext.getConnection();

    @Override
    public ArrayList<MauSac> getList() {
         String sql = "SELECT * FROM MauSac";
        ArrayList<MauSac> listMauSac = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                int id = rs.getInt(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                int trangThai = rs.getInt(4);
                MauSac mauSac = new MauSac(id, ma, ten, trangThai);
                listMauSac.add(mauSac);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMauSac;
    }

    @Override
    public void them(MauSac mauSac) {
        String sql = "INSERT INTO MauSac(Ma, Ten, TrangThai) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, mauSac.getMa());
            ps.setObject(2, mauSac.getTen());
            ps.setObject(3, mauSac.getTrangThai());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xoa(int id) {
        String sql = "DELETE FROM MauSac WHERE Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sua(MauSac mauSac) {
        String sql = "UPDATE MauSac SET Ma = ?, Ten = ?, TrangThai = ? WHERE Id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, mauSac.getMa());
            ps.setObject(2, mauSac.getTen());
            ps.setObject(3, mauSac.getTrangThai());
            ps.setObject(4, mauSac.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
