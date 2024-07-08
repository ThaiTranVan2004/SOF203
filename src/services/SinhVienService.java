/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import models.SinhVien;

/**
 *
 * @author thaitv
 */
public interface SinhVienService {
    
    ArrayList<SinhVien> getList();
    
    void add(SinhVien sv);
    
}
