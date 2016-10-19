/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.college.department.departmentjobs;

import java.util.ArrayList;

/**
 *
 * @author nithinkartha
 */
public class JobPosition {
    private ArrayList<Role> roleList;

    public JobPosition() {
        roleList = new ArrayList<Role>();
    }

    public Role addRole() {
        Role role = new Role();
        roleList.add(role);
        return role;
    }

    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(ArrayList<Role> role) {
        this.roleList = role;
    }

}
