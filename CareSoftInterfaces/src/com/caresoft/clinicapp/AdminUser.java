package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser , HIPAACompliantAdmin{

    //... imports class definition...

    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer id , String role) {
        super(id);
        this.role = role;
        securityIncidents = new ArrayList<String>();
    }

    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!

    public void newIncident(String notes) {
        String report = String.format(
                "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
                new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
                "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
                new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    /* TO DO: Setters & Getters */

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }


    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }

    public boolean assignPin(int pin) {
        if(String.valueOf(Math.abs(pin)).length() < 6) {
            return false;
        }else{
            setPin(pin);
            return true;
        }
    }

    public boolean accessAuthorized(Integer confirmedAuthID) {
        if(getId() == confirmedAuthID){
            return true;
        }else{
            authIncident();
            return false;
        }
    }
}
