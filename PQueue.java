/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class PQueue {
    private PNode front ;
    private PNode rear ;
    private int size;
    
    public PQueue(){
        
    }

    public PQueue(PNode front, PNode rear, int listSize) {
        this.front = front;
        this.rear = rear;
        this.size = listSize;
    }
    
      
   
    
    public boolean isEmpty () {
        return front == null;
    }
    
    public int size () {
        return size ;
    }
    
    public void clear (){
        front = rear = null;
        size =0;
    }
    
    public void enqueue (houseDelivery data)
    {

        PNode newNode = new PNode (data);
        
        if (front == null)
            front = rear = newNode;
        else  if(data.getPirorty() <= rear.getData().getPirorty() )
           // if (data.getPriority() >= rear.getData().getPriority() )
        {
            rear.setNext(newNode);
            rear = newNode;
        }
        else if(data.getPirorty() > front.getData().getPirorty())
            //if (data.getPriority() < front.getData().getPriority()) 
        {
            newNode.setNext(front);
            front = newNode;
        }
        else {
            PNode current = front;
            while (data.getPirorty() <= current.getNext().getData().getPirorty())
               // while (data.getPriority() >=  current.getNext().getData().getPriority())
                current = current.getNext();
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size ++;
    }
    public houseDelivery dequeue ()
    {
        if (front == null) 
            return null;
        
        houseDelivery element = front.getData();
        front = front.getNext();
        if (front == null)
            rear = null;
        size--;
        return element ;
    }
    public houseDelivery peek (){
        if (front == null ) return null;
        return front.getData();
    }
    
    
    
    
    
}
