/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import models.DanhMuc;

/**
 *
 * @author thaitv
 */
public interface DanhMucService {
    
    ArrayList<DanhMuc> getAll();
    
    void add(DanhMuc danhMuc);
    
}
