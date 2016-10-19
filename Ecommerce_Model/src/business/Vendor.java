/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author saravandeepak
 */
public class Vendor {
    private String vendorName;
    private String vendorEmail;
    private String vendorPassword;
    private String vendorDescription;
    private Date vendorCreatedDate;

    

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getVendorDescription() {
        return vendorDescription;
    }

    public void setVendorDescription(String vendorDescription) {
        this.vendorDescription = vendorDescription;
    }

    public Date getVendorCreatedDate() {
        return vendorCreatedDate;
    }
    public void setVendorCreatedDate() {
        this.vendorCreatedDate = new Date();
    }
    @Override
    public String toString(){
        return this.vendorName;
    }
    
}
