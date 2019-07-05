/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class Medicine {
    // add or remove folow by any company ;
    private int id ;
    private String type;
    private String medicineName;
    private double price;
    private String copanyName;
    
    public Medicine(){
        
    }
    
    public Medicine(int ID , String Type,String MName ,double Price ,String CName   ){
     this.id=ID ;
     this.type=Type;
     this.medicineName=MName;
     this.price=Price;
     this.copanyName=CName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopanyName(String copanyName) {
        this.copanyName = copanyName;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public double getPrice() {
        return price;
    }

    public String getCopanyName() {
        return copanyName;
    }

    @Override
    public String toString() {
        return "Medicine{\n" + "id=" + id + ", type=" + type + ", medicineName=" + medicineName + "\n price=" + price + ", copanyName=" + copanyName + "\n}\n\n";
    }
    
}
