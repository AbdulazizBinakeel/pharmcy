/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class houseDelivery {
    private int pirorty;
    private int numberDelivery;
    private String PacgeInformation;

    public houseDelivery(){
        
    }
    public houseDelivery(int pirorty, int numberDelivery, String PacgeInformation) {
        this.pirorty = pirorty;
        this.numberDelivery = numberDelivery;
        this.PacgeInformation = PacgeInformation;
    }

    public int getPirorty() {
        return pirorty;
    }

    public void setPirorty(int pirorty) {
        this.pirorty = pirorty;
    }

    public int getNumberDelivery() {
        return numberDelivery;
    }

    public void setNumberDelivery(int numberDelivery) {
        this.numberDelivery = numberDelivery;
    }

    public String getPacgeInformation() {
        return PacgeInformation;
    }

    public void setPacgeInformation(String PacgeInformation) {
        this.PacgeInformation = PacgeInformation;
    }

    @Override
    public String toString() {
        return "houseDelivery{" + "pirorty=" + pirorty + ", numberDelivery=" + numberDelivery + ", PacgeInformation=" + PacgeInformation + '}';
    }
    
    
    
}
