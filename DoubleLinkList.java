/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class DoubleLinkList {
    // search by name and delet by name 
    // seach by id and deleat by name 
    private Node head ;
    private Node last;
    private int listSize;
    
    public DoubleLinkList(){
       
   }
    
     public boolean isEmpty(){
       return head==null;
   }
     
   public int size(){
       return listSize;
   }
   
   public void addFirst(Medicine val ){
       Node newNode = new Node (val);
       if(head==null)
           head=last=newNode ;
       else{
           newNode.setNext(head);
           head.setPrev(newNode);
           head=newNode;
       }
       listSize++;
   }
   
   public void addlast(Medicine val){
       Node newNode = new Node (val);
       if(isEmpty())
           head=last=newNode;
       else{
       last.setNext(newNode);
      // last.setNext(last.getPrev());
      newNode.setPrev(last);
       last=newNode;
       }
   }
   //Returns true if this list contains the specified element. otherwise return false
    public Medicine searchByNameRetuendata(String searchData)
    {
    	Node current = head;
	while (current != null )
	{
            if( current.getData().getMedicineName().equalsIgnoreCase(searchData))
		return current.getData();
            else
		current = current.getNext();
	}
	return null;
    }
    
    public Medicine get(int index)
    {
        if(index < 0 || index >= listSize )  
        	 throw new IndexOutOfBoundsException("Index " + index + " is out of range");

	Node current=head;
	for(int i=0 ; i<index; i++)
		current= current.getNext();       
	return current.getData();
    }
    
   //add with specific index with return boolean 
   public boolean add(int index , Medicine val ){
       if(index>listSize||index<0){
           System.out.println("Somthing wrong !");
           return false ;
       }
       Node newNode = new Node(val);
       Node current = head;
       if(head==null)
           head=last=null;
       else{
               newNode.setNext(head);
               head.setPrev(newNode);
               head=newNode;
           }
           if(index==listSize){
               last.setNext(newNode);
               newNode.setPrev(last);
               last=newNode;
           }
           else{
               for(int i = 1 ;i<index;i++)
                   current = current.getNext();
               newNode.setNext(current.getNext());
               newNode.setPrev(current);
               current.getNext().setPrev(newNode);
               current.setNext(newNode);
               
           }
           listSize++;
           return true ;
   }
   public boolean removeByName(String searchData) 
    {
       	Node current = head ;
	while (current != null ) 
	{
            if(current.getData().getMedicineName().equalsIgnoreCase(searchData))
            {
            	if (current == head) 
                    head = head.getNext();
                
                if(current == last)
                     last = last.getPrev();
                    
                if(current.getPrev() != null)
                    current.getPrev().setNext(current.getNext());
                if(current.getNext() != null)
                    current.getNext().setPrev(current.getPrev());

                listSize--;
                return true;
            }
            else
                current= current.getNext();       
	}
	return false;
    }
   public boolean removeByID(int  searchData) 
    {
       	Node current = head ;
	while (current != null ) 
	{
            if(current.getData().getId() == searchData)
            {
            	if (current == head) 
                    head = head.getNext();
                
                if(current == last)
                     last = last.getPrev();
                    
                if(current.getPrev() != null)
                    current.getPrev().setNext(current.getNext());
                if(current.getNext() != null)
                    current.getNext().setPrev(current.getPrev());

                listSize--;
                return true;
            }
            else
                current= current.getNext();       
	}
	return false;
    }
    
    
    //id
   public int indexOf(int element)
    {
        Node current = head;
        int index=0;
	while (current != null )
	{
            if(current.getData().getId() == element )
		return index;
            else
            {
                index++;
		current = current.getNext();
            }
        }
	return -1;
    }
   public String toString() {
        String output = "[";
        Node current = head;
        if (current != null) {
            output += current.getData();
            current = current.getNext();
        }
        while (current != null) {
            output += "," + current.getData();
            current = current.getNext();
        }
        output += "]";
        return output;
    }
    
}
