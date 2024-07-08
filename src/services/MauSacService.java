/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import models.MauSac;

/**
 *
 * @author thaitv
 */
public interface MauSacService {
    
    ArrayList<MauSac> getList();
    
    void them(MauSac mauSac);
    
    void xoa(int id);
    
    void sua(MauSac mauSac);
    
}
