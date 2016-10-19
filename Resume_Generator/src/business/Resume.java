/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import java.awt.Image;

/**
 *
 * @author saravandeepak
 */
public class Resume {
    
    private String name;
    private String email;
    private long phoneNo;
    private String street;
    private String streetLn1;
    private String streetLn2;    
    private String city;
    private String country;
    private String state;
    private String cityStateCountry;
    private int zipCode;
    private String sex;
    private Image img;
    private String affiliation;
    private String carrierObjStmt;
    private String projects; 
    private String skills;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }
    private String extraCurricular;
    private String pgCollegeName;
    private String pgCourse;
    private String pgDate;
    private String pgPerc;
    private String ugCollegeName;
    private String ugCourse;
    private String ugDate;
    private String ugPerc;
    private String comp1Name;
    private String comp1Role;
    private String comp1StartDate;
    private String comp1EndDate;
    private String comp2Name;
    private String comp2Role;
    private String comp2StartDate;
    private String comp2EndDate;
    private String comp1Date;
    private String comp2Date;


    public String getComp1Date() {
        return comp1Date;
    }

    public void setComp1Date(String comp1Date) {
        this.comp1Date = comp1Date;
    }

    public String getComp2Date() {
        return comp2Date;
    }

    public void setComp2Date(String comp2Date) {
        this.comp2Date = comp2Date;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getUgCourse() {
        return ugCourse;
    }

    public void setUgCourse(String ugCourse) {
        this.ugCourse = ugCourse;
    }
    public String getUgDate() {
        return ugDate;
    }

    public void setUgDate(String ugDate) {
        this.ugDate = ugDate;
    }

    public String getUgPerc() {
        return ugPerc;
    }

    public void setUgPerc(String ugPerc) {
        this.ugPerc = ugPerc;
    }
    
    public String getCityStateCountry() {
        return cityStateCountry;
    }

    public void setCityStateCountry(String cityStateCountry) {
        this.cityStateCountry = cityStateCountry;
    }
    
    public String getStreetLn1() {
        return streetLn1;
    }

    public void setStreetLn1(String streetLn1) {
        this.streetLn1 = streetLn1;
    }

    public String getStreetLn2() {
        return streetLn2;
    }

    public void setStreetLn2(String streetLn2) {
        this.streetLn2 = streetLn2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getPgCollegeName() {
        return pgCollegeName;
    }

    public void setPgCollegeName(String pgCollegeName) {
        this.pgCollegeName = pgCollegeName;
    }

    public String getPgCourse() {
        return pgCourse;
    }

    public void setPgCourse(String pgCourse) {
        this.pgCourse = pgCourse;
    }

    public String getPgDate() {
        return pgDate;
    }

    public void setPgDate(String pgDate) {
        this.pgDate = pgDate;
    }

    public String getPgPerc() {
        return pgPerc;
    }

    public void setPgPerc(String pgPerc) {
        this.pgPerc = pgPerc;
    }

    public String getUgCollegeName() {
        return ugCollegeName;
    }

    public void setUgCollegeName(String ugCollegeName) {
        this.ugCollegeName = ugCollegeName;
    }

    public String getComp1Name() {
        return comp1Name;
    }

    public void setComp1Name(String comp1Name) {
        this.comp1Name = comp1Name;
    }

    public String getComp1Role() {
        return comp1Role;
    }

    public void setComp1Role(String comp1Role) {
        this.comp1Role = comp1Role;
    }

    public String getComp1StartDate() {
        return comp1StartDate;
    }

    public void setComp1StartDate(String comp1StartDate) {
        this.comp1StartDate = comp1StartDate;
    }

    public String getComp1EndDate() {
        return comp1EndDate;
    }

    public void setComp1EndDate(String comp1EndDate) {
        this.comp1EndDate = comp1EndDate;
    }

    public String getComp2Name() {
        return comp2Name;
    }

    public void setComp2Name(String comp2Name) {
        this.comp2Name = comp2Name;
    }

    public String getComp2Role() {
        return comp2Role;
    }

    public void setComp2Role(String comp2Role) {
        this.comp2Role = comp2Role;
    }

    public String getComp2StartDate() {
        return comp2StartDate;
    }

    public void setComp2StartDate(String comp2StartDate) {
        this.comp2StartDate = comp2StartDate;
    }

    public String getComp2EndDate() {
        return comp2EndDate;
    }

    public void setComp2EndDate(String comp2EndDate) {
        this.comp2EndDate = comp2EndDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getCarrierObjStmt() {
        return carrierObjStmt;
    }

    public void setCarrierObjStmt(String carrierObjStmt) {
        this.carrierObjStmt = carrierObjStmt;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExtraCurricular() {
        return extraCurricular;
    }

    public void setExtraCurricular(String extraCurricular) {
        this.extraCurricular = extraCurricular;
    }
    @Override
    public String toString(){
        return this.name;
    }
        
    
    
}
