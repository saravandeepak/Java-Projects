/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author saravandeepak
 */
public class VendorCatalog {
    private ArrayList <Vendor> vendorCatalog ;
    
    public VendorCatalog() {
        this.vendorCatalog = new ArrayList<Vendor>();
    }

    public ArrayList<Vendor> getVendorCatalog() {
        return vendorCatalog;
    }

    public void setVendorCatalog(ArrayList<Vendor> vendorCatalog) {
        this.vendorCatalog = vendorCatalog;
    }

    public void addVendor(Vendor vendor) {
        vendorCatalog.add(vendor);        
    }
    
    public void deleteVendor(Vendor vendor){
        vendorCatalog.remove(vendor);
    }
    
    public Vendor searchVendor(String vendorName){
        for (Vendor vendor: vendorCatalog){
            if (vendor.getVendorName().toLowerCase().equals(vendorName.toLowerCase())){
                return vendor;
            }           
        }
        return null;
    }
    
}
