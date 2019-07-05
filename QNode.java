/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class QNode {
    
    private Prescription data;
    private QNode next;
    
    public QNode (Prescription data){
        this.data=data;
    }
    public QNode(Prescription data, QNode next) {
        this.data = data;
        this.next = next;
    }

    public Prescription getData() {
        return data;
    }

    public void setData(Prescription data) {
        this.data = data;
    }

    public QNode getNext() {
        return next;
    }

    public void setNext(QNode next) {
        this.next = next;
    }
    
    
}
