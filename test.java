/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test{
    /*
        Medicine m = new Medicine ();
        Avaliability a = new Avaliability();
        houseDelivery h= new houseDelivery();
        deliveryNote d = new deliveryNote();
        Prescription p=new Prescription ();
        */
    //rember constructer 
    
    public static void main(String[] args) throws Exception 
    {
       DoubleLinkList DLL =new DoubleLinkList();
        BinarySearchTree BST = new BinarySearchTree();
        PQueue PQ = new PQueue();
        ArrayListt list = new ArrayListt();
        Queue Q = new Queue();
        Scanner in = new Scanner(System.in);
        
        
        
        
          System.out.println("\n \n \n \n new file : \n");
        try(BufferedReader b = new BufferedReader(new FileReader("/Users/yousef/Desktop/simpleProjectFile/Medicines information Sample record.txt")))
        {
            String line ;
            String [] word ;
            int a =b.read();
            b.readLine();
            while( (line = b.readLine()) != null)
            {
                word = line.split("-");
             Medicine m = new Medicine (Integer.parseInt(word[0]) , word[1] , word[2] , Double.parseDouble(word[3]) , word [4] );
                DLL.addlast(m);
                System.out.println(m.toString());
                System.out.println("________________________");
                
                
               
            }
            
        
        }
         System.out.println("\n \n \n \n new file : \n");
            try(BufferedReader b = new BufferedReader(new FileReader("/Users/yousef/Desktop/simpleProjectFile/Availability of the Medicines Sample record.txt")))
            {
                
            String line1 ;
            String [] word1 ;
            int a =b.read();
            b.readLine();
            while( (line1 = b.readLine()) != null)
               {
                word1 = line1.split("-");

                Avaliability AM = new Avaliability(Integer.parseInt(word1[0]),
                        word1[1], Integer.parseInt(word1[2]), Integer.parseInt(word1[3]), Integer.parseInt(word1[4]) );
                BST.insert(AM);
            System.out.println(AM.toString());
            System.out.println("________________________");
               }
           
            }
            
        catch(IOException e)
        {
            System.err.println(e);
        }
       
            System.out.println();
               System.out.println("\n \n \n \n new file : \n");
             try(BufferedReader b = new BufferedReader(new FileReader("/Users/yousef/Desktop/simpleProjectFile/InHouse delivery Sample record.txt")))
             {
                 String line2 ;
                 String [] word2 ;
                  int a =b.read();
            b.readLine();
            while( (line2 = b.readLine()) != null)
            {
              word2 = line2.split("-");

                houseDelivery DH = new houseDelivery(Integer.parseInt(word2[0]), Integer.parseInt(word2[1]), word2[2]);

                PQ.enqueue(DH);
                System.out.println(DH.toString());
                System.out.println("________________________");

            }
            
             }
             
        catch(IOException e)
        {
            System.err.println(e);
        }
       
             System.out.println();
            
                System.out.println("\n \n \n \n new file : \n");
             try(BufferedReader b = new BufferedReader(new FileReader("/Users/yousef/Desktop/simpleProjectFile/Prescriptions Sample record.txt")))
             {
                 String line3 ;
                 String [] word3 ;
                 int a =b.read();
            b.readLine();
            while( (line3 = b.readLine()) != null)
            {
                 word3 = line3.split("-");

                Prescription P = new Prescription(Integer.parseInt(word3[0]), word3[1], Integer.parseInt(word3[2]), word3[3]);
                Q.enqueue(P);
                System.out.println(P.toString());
                System.out.println("________________________");
      
            }
            
      
             }
             
             
        catch(IOException e)
        {
            System.err.println(e);
        }
       
           System.out.println();
            System.out.println("\n \n \n \n new file : \n");
             try(BufferedReader b = new BufferedReader(new FileReader("/Users/yousef/Desktop/simpleProjectFile/Delivery Notes Sample record.txt")))
             {
                 String line4 ;
                 String [] word4  ;
                 int a =b.read();
            b.readLine();
            while( (line4 = b.readLine()) != null)
            {
                 word4 = line4.split("-");

                deliveryNote DN = new deliveryNote(Integer.parseInt(word4[0]), word4[1]);

                list.add(DN);
                System.out.println(DN.toString());
                System.out.println("________________________");

            }
      
             }
        catch(IOException e)
        {
            System.err.println(e);
        }
             
             
       //add new medicine 
        Medicine x = new Medicine(1004,"Night","",15.01,"Pandol");
        DLL.addlast(x);
        DLL.removeByID(12);
        System.out.println(DLL.toString());
       
        //
        
        Prescription i ;
        i=Q.dequeue();
       Avaliability a= BST.continsReturnData(i.getMedicinename());
        if(a.getNumberOfBoxes()>i.getNumberOfBoxes())
            System.out.println("");
       
        
        
        
    }

    
    }


