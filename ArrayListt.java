/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
import java.util.ArrayList;

    
    // last elemnt +1 insert to the delivery 
    // search by index retuen all content ;
    
public class ArrayListt {
    
    ArrayList<deliveryNote>  array ;

    public ArrayListt() 
    {
        array = new ArrayList<> ();
    }
    public void add(deliveryNote element)
    {
     deliveryNote ele;
    int i=0;
    while( i< array.size())
    {
         ele = array.get(i);
        if( element.getOpreationNumber()< ele.getOpreationNumber())
        {
            array.add(i, element);
            return ;
        }
        i++;
    }
    array.add(element);
    
}
      public void  remove(int index) 
        {
                  array.remove(index);
        }
 
     public void set(int index , deliveryNote element) 
     {
          array.set(index, element);
     }
     
     
     
      public deliveryNote get(int index )
      {
          return array.get(index);
      }
      
      
     public int size() 
     {
         return array.size();
     }
     
    public boolean isEmpty() 
    {
        return array.isEmpty();
    }

    
  public int indexOf(deliveryNote e) 
  {
      return array.indexOf(e);
  }
  
 

   public void clear() 
   {
       array.clear();
   }
   
    //public deliveryNote 
    public int  binarysearch(ArrayList< deliveryNote>  array ,int data)
    {
        int low=0;
        int high=array.size()-1;
        int mid;
        while(low<=high){
           mid=(low+high)/2;
           if(data == array.get(mid).getOpreationNumber())
               return mid;
           else if(data>array.get(mid).getOpreationNumber())
               low=mid+1;
            else
                  high=mid-1;
    
     }
        return -1;

    }

    @Override
    public String toString() {
        return "ArrayListt{" + "array=" + array + '}';
    }
    

}

