package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser{

    private ArrayList<String> patientNotes;

    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    public Physician(Integer id) {
        super(id);
        patientNotes = new ArrayList<String>();
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public boolean assignPin(int pin){
        if(String.valueOf(Math.abs(pin)).length() < 4) {
            return false;
        }else{
            setPin(pin);
            return true;
        }
    }

    public boolean accessAuthorized(Integer confirmedAuthID){
        if(getId() == confirmedAuthID){
            return true;
        }else{
            return false;
        }
    }
}
