/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class Prescription {

   
    private int patientId;
    private String Medicinename;
    private int NumberOfBoxes;
    private String dosage;
    
     public Prescription() {
    }
     
    public Prescription(int patientId, String Medicinename, int NumberOfBoxes, String dosage) {
        this.patientId = patientId;
        this.Medicinename = Medicinename;
        this.NumberOfBoxes = NumberOfBoxes;
        this.dosage = dosage;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getMedicinename() {
        return Medicinename;
    }

    public void setMedicinename(String Medicinename) {
        this.Medicinename = Medicinename;
    }

    public int getNumberOfBoxes() {
        return NumberOfBoxes;
    }

    public void setNumberOfBoxes(int NumberOfBoxes) {
        this.NumberOfBoxes = NumberOfBoxes;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Prescription{" + "patientId=" + patientId + ",\n Medicinename=" + Medicinename + ",\n NumberOfBoxes=" + NumberOfBoxes + ",\ndosage=" + dosage + '}';
    }
    
    
    
}
