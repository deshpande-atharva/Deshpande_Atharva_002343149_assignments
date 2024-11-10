/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author athar
 */
public class Business {
        MasterOrderList masterorderList;
    SupplierDirectory supplierDirectory;
    
    public Business(){
        masterorderList = new MasterOrderList();
        supplierDirectory = new SupplierDirectory();
        
    }

    public MasterOrderList getMasterorderList() {
        return masterorderList;
    }

    public void setMasterorderList(MasterOrderList masterorderList) {
        this.masterorderList = masterorderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
    
}
