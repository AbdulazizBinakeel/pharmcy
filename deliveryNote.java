/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class deliveryNote {
    // delivery for the medicine that have not 
    private int opreationNumber ;
    private String pacgeInformation;

    public deliveryNote() {
    }

    public deliveryNote(int opreationNumber, String pacgeInformation) {
        this.opreationNumber = opreationNumber;
        this.pacgeInformation = pacgeInformation;
    }

    public int getOpreationNumber() {
        return opreationNumber;
    }

    public void setOpreationNumber(int opreationNumber) {
        this.opreationNumber = opreationNumber;
    }

    public String getPacgeInformation() {
        return pacgeInformation;
    }

    public void setPacgeInformation(String pacgeInformation) {
        this.pacgeInformation = pacgeInformation;
    }

    @Override
    public String toString() {
        return "deliveryNote{" + "opreationNumber=" + opreationNumber + ", pacgeInformation=" + pacgeInformation + '}';
    }
    
  
  
    
    
}
