/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class Avaliability {
    
    private long id ;
    private String medicineName;
    private int locationInPharmacy;
    private int numberOfBoxes;
    private int availbleInStock;
    
    public Avaliability(){
        
    }
   
    public Avaliability(int id,String name , int  locationInPharmacy, int numberOfBoxes, int availbleInStock) {
        this.id=id;
        this.medicineName=name;
        this.locationInPharmacy = locationInPharmacy;
        this.numberOfBoxes = numberOfBoxes;
        this.availbleInStock = availbleInStock;
    }

    public long getId() {
        return id;
    }

    public String getMedicineName() {
        return medicineName;
    }
       
    public void setLocationInPharmacy(int  locationInPharmacy) {
        this.locationInPharmacy = locationInPharmacy;
    }

    public void setNumberOfBoxes(int numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public void setAvailbleInStock(int availbleInStock) {
        this.availbleInStock = availbleInStock;
    }

    public int  getLocationInPharmacy() {
        return locationInPharmacy;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }

    public int getAvailbleInStock() {
        return availbleInStock;
    }

    @Override
    public String toString() {
        return "Avaliability{" + "id=" + id + ", \nmedicineName=" + medicineName + ", \nlocationInPharmacy=" + locationInPharmacy + ", \nnumberOfBoxes=" + numberOfBoxes + ",\n availbleInStock=" + availbleInStock + '}';
    }
   
    
    
}
