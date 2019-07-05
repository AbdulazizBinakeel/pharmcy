/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class Node {
    
   private Medicine data;
   private Node next;
   private Node prev;
   
   public Node (){
    
   }
   
   public Node ( Medicine data){
       this.data=data;
   }
   
   public Node (Medicine data , Node next , Node prev){
       this.data=data;
       this.next=next;
       this.prev=prev;
   }

    public void setData(Medicine data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Medicine getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
    
   
   
}
