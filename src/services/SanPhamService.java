/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import models.SanPham;

/**
 *
 * @author thaitv
 */
public interface SanPhamService {
    
    ArrayList<SanPham> getList();
    
    void them(SanPham sanPham);
    
    void xoa(int id);
    
    void sua(SanPham sanPham);
}
