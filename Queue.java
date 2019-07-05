/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class Queue {
    private QNode front;
    private QNode rear;
    private int listSize;
    
    public Queue(){
        
    }
    public boolean isEmpty(){
        return front==null;
    }
    
        public void enqueue(Prescription rData){
        QNode newNode= new QNode(rData);
        if(front==null)
            front=rear=newNode;
        else{
            
            rear.setNext(newNode);
            rear=newNode;
            
        }
        listSize++;   
    } 
    
    public Prescription dequeue(){
          if(front==null)
           return  null;
          
          Prescription temp=front.getData();
          front=front.getNext();
          if(front==null)
              rear=null;
         
         listSize--;
         return temp;
    }
    
    public Prescription peek(){
        if(front==null)
            return null;
        return front.getData();
    }
    public int size (){
        return listSize;
    }
    
    public void clear()
    {
	front = null; 
        rear = null;
        listSize=0;
    }
    public void print(Queue q){
      Queue temp = new Queue();
	
	Prescription value;
	System.out.println("Queue contains : ");
        
	while(! q.isEmpty())
	{
		value = q.dequeue();
                System.out.print(" "+value);
		temp.enqueue(value);
	}
        
	while(!temp.isEmpty())
            q.enqueue(temp.dequeue());
    } 
   /* 
   public void reverseQueueUsingStack( Queue q){
       if(q.isEmpty())
           return;
       Stack<T> stack = new Stack<> ();
       while(!q.isEmpty())
           stack.push(q.dequeue());
       
       while(!stack.isEmpty())
           q.enqueue(stack.pop());
            
}
*/
   public void addToFrontOfQueue (Queue q ,Prescription elemnt){
       Queue qu = new Queue();
       
       qu.enqueue(elemnt);
       while(!q.isEmpty())
           qu.enqueue(q.dequeue());
       
      while(!qu.isEmpty())
         q.enqueue(qu.dequeue());
   }
   public void reverseQueue2(Queue  q){
       if(q.isEmpty())
           return;
      Prescription elemnt;
       if(!q.isEmpty()){
           elemnt=q.dequeue();
           reverseQueue2(q);
           q.enqueue(elemnt);
       }
           
   }
   public void swapFrontWithRear(Queue q){
       if(q.size()>1){
           
            Prescription elemnt=q.dequeue();
            int size=q.size();
       
       for(int i = 1; i<size;i++)
            q.enqueue(q.dequeue());
            q.enqueue(elemnt);
       
       
       
   }
   }
     
      public void swapIndexes(Queue q){
        if(q.isEmpty())
            return ;
        Prescription elemnt ;
        int size = q.size();
        while(!q.isEmpty()&&size!=-1){
            elemnt=q.dequeue();
            size--;
            if(q.isEmpty()||size==0){
               q.enqueue(elemnt);
                return;
            }
            else{
                q.enqueue(q.dequeue());
                q.enqueue(elemnt);
                size--;
            }
                
            
        }
      }
      //Abohamed soloution 
        public void swapIndexes1(Queue q)
   {
       Prescription element;
       int size = q.size();
       
       for(int i=0 ; i< size ; )
       {
           element = q.dequeue();
           i++;
           if( i < size )
           {
                q.enqueue(q.dequeue());
                i++;
           }
           q.enqueue(element);
       }
   }
        public  int  search (Queue q , Prescription searchData){
            if(q.isEmpty())
                return -1;
            int size=q.size();
            int index=-1;
            Prescription elemnt;
            for(int i = 0 ;i<size;i++){
                elemnt=q.dequeue();
              if(elemnt==searchData&&index==-1)
                    index=i;
                    q.enqueue(elemnt);
                
            } 
            return index;
        }
        public int searchAndRemove(Queue q , Prescription searchData){
            if(q.isEmpty())
                return-1;
            int size=q.size();
            int index=-1;
            Prescription elemnt;
            for(int i = 0 ; i < size ; i ++){
                elemnt=q.dequeue();
                if(elemnt == searchData&&index==-1)
                    index=i;
                else
                    q.enqueue(elemnt);
            }
            return index;
        }
        public int removeAllElemntsMatching(Queue q , Prescription searchData){
            if(q.isEmpty())
                return -1;
            int size=q.size();
            int index=0;
            Prescription elemnt;
            
            for(int i=0;i<size;i++){
                elemnt = q.dequeue();
                if(elemnt==searchData)
                    index++;
                else
                    q.enqueue(elemnt);
                
            }
            return index ;
                    
        }
       public Prescription getElemntAtIndex(Queue q,int index){
           if(q.isEmpty())
               return null;
           int size=q.size();
           Prescription elemnt;
           Prescription returnable=null;
           
           for(int i = 0 ; i < size ;i ++){
               elemnt=q.dequeue();
               if(i==index)
                   returnable=elemnt;
                   else
                    q.enqueue(elemnt);
            
           }
        return returnable;   
       }
       public void decideSizeOfRearRevers(Queue  q, int n){
           if(q.isEmpty())
               return ;
           int size = q.size();
           int diff = size - n;
           for(int i = 0 ; i <diff;i++){
               q.enqueue(q.dequeue());
           }
           
           
           
           reverseNElemntFromBottom( q,  n);
           
           
                       
       }
            public void reverseNElemntFromBottom(Queue q,  int n){
                if(q.isEmpty() || n == 0 )
                    return;
                
                    Prescription elemnt=q.dequeue();
                    System.out.println("");
                    System.out.println("  "+elemnt);
                    reverseNElemntFromBottom(q,n-1);
                  
                    q.enqueue(elemnt);
                
                
            } 

    @Override
    public String toString() {
        return "Queue{" + "front=" + front + ", rear=" + rear + ", listSize=" + listSize + '}';
    }
            
          
      }
    

