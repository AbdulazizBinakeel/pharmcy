/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class PNode {
    private houseDelivery data;
    private PNode next;
    
    public PNode (houseDelivery data){
        this.data=data;
    }
    public PNode(houseDelivery data, PNode next) {
        this.data = data;
        this.next = next;
    }

    public houseDelivery getData() {
        return data;
    }

    public void setData(houseDelivery data) {
        this.data = data;
    }

    public PNode getNext() {
        return next;
    }

    public void setNext(PNode next) {
        this.next = next;
    }
    
    
    
}
