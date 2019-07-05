/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class BinarySearchTree {
    // reverce cheak all the medicine and order every medicine have 5 and less medicine 
    
   private TNode root;
    private int listSize =0;
    
    public BinarySearchTree(){
        
    }
    public boolean insert (Avaliability elemnt ){
        TNode temp = new TNode (elemnt);
        if(root==null){
            root=temp;
            listSize++;
            return true ;
        }
        else{
            TNode cu=root;
            while(true){
                if(elemnt.getMedicineName().compareToIgnoreCase(cu.getData().getMedicineName())<0)
                {
                    if(cu.getLeft()!=null)
                        cu=cu.getLeft();
                    else{
                        cu.setLeft(temp);
                        listSize++;
                        return true;
                        
                    }          
                }
                else {
                    if(cu.getRight()!=null)
                        cu=cu.getRight();
                    else
                    {
                        cu.setRight(temp);
                        listSize++;
                        return true;
                        
                                
                    }
                }
                
            }
        }
    }
    public boolean contins(String searchData){
        TNode ref=root;
        while(ref!=null){
            if(ref.getData().getMedicineName()==searchData)
                return true ;
            else if(searchData.compareToIgnoreCase(ref.getData().getMedicineName())<0)
                ref=ref.getLeft();
            else
                ref=ref.getRight();
    }
        return false;
    }
     public Avaliability continsReturnData(String searchData){
        TNode ref=root;
        while(ref!=null){
            if(ref.getData().getMedicineName()==searchData)
                return ref.getData();
            else if(searchData.compareToIgnoreCase(ref.getData().getMedicineName())<0)
                ref=ref.getLeft();
            else
                ref=ref.getRight();
    }
        return null;
    }
    
        public boolean removeNode(String searchData){
        TNode ref = root;
        TNode back = null;
        
        while(ref!=null)
        {
            if(ref.getData().getMedicineName().compareToIgnoreCase(searchData)<0)
            {
                back=ref;
                ref=ref.getLeft();
            }
            else if(ref.getData().getMedicineName().compareToIgnoreCase(searchData)>0)
            {
                back=ref;
                ref=ref.getRight();
            }
            else
            {
                //one chield on the left
                if(ref.getRight()==null)
                {
                    if(ref==root)
                        root=root.getLeft();
                
                    else if(back.getLeft()==ref)
                         back.setLeft(ref.getLeft());
                
                        else
                         back.setRight(ref.getLeft());
                }
                else if(ref.getLeft()==null)
                {//one chield on the right
                    if(ref==root)
                        root=root.getRight();
                    else if(back.getLeft()==ref)
                        back.setLeft(ref.getRight());
                    else
                        back.setRight(ref.getRight());
                }
                else{//tow children 
                    back=ref;
                    TNode temp = ref.getLeft();
                    while(temp.getRight()!=null)
                    {
                        back=temp;
                        temp=temp.getRight();
                    }
                    ref.setData(temp.getData());
                    if(back==ref)
                        back.setLeft(temp.getLeft());
                    else
                        back.setRight(temp.getLeft());
                    
                  }
            
            
             }
                 listSize--;
                return true;
        }
             return false;
    }
    
        public int size(){
            return listSize;
        }
        
        public int height(){
            return height(root);
        }
        public int height(TNode ref){
            if(ref==null)
                return -1;
            if(ref.getLeft()==null&&ref.getRight()==null)
                return 0;
            int L=height(ref.getLeft());
            int R=height(ref.getRight());
            if(R>L)
                return R;
            return L;
        }
        public int treeLevels(){
        return height(root)+1;
    }
        
        
         public void displayPreOrder(){
        System.out.println("PreOrder : ");
        displayPreOrder(root);
    }
    
    public void displayPreOrder(TNode ref){
        if(ref!=null){
         System.out.print(" "+ref.getData());
            displayPreOrder(ref.getLeft());
            displayPreOrder(ref.getRight());
        }
        
    }
        public void displayInOreder(){
            
            displayInOrder(root);
        }
        private void displayInOrder(TNode ref){
            if(ref!=null){
                if(ref.getLeft()!=null)
                displayInOrder(ref.getLeft());
                System.out.println(" "+ref.getData());
                if(ref.getRight()!=null)
                displayInOrder(ref.getRight());
            } 
        }
        
        public void displayPostOreder(){
        System.out.println("In order :");
        displayPostOreder(root);
    }
    
    public void displayPostOreder(TNode nodeRuf){
        if(root!=null){
            if(nodeRuf.getLeft()!=null)
            displayPostOreder(nodeRuf.getLeft());
            if(nodeRuf.getRight()!=null)
            displayPostOreder(nodeRuf.getRight());
            System.out.print(" "+nodeRuf.getData());
        }
     }

    @Override
    public String toString() {
        return "BinarySearchTree{" + "root=" + root + ", listSize=" + listSize + '}';
    }
    
    }
    

