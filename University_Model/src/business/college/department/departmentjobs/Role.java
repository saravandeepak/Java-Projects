/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.departmentjobs;

/**
 *
 * @author nithinkartha
 */
public class Role {
    String roleName;
    String roleDescription;
    private int salary;
    private Person person;
    
    public void addPerson(String fN, String lN, String addr, String email, long phone, long ssn, Role role) {
        person = new Person();
        person.setAddress(addr);
        person.setEmail(email);
        person.setFirstName(fN);
        person.setLastName(lN);
        person.setPhoneNo(phone);
        person.setSsn(ssn);
        person.setRole(role);
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getRoleName() {
        return roleName;
    }
    
    public String getRoleDescription() {
        return roleDescription;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
    
}
