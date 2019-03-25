/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author cmehta
 */
public class LinkedListConcepts {
    
    
    //The important points about Java LinkedList are:

    //Java LinkedList class can contain duplicate elements.
    //Java LinkedList class maintains insertion order.
    //Java LinkedList class is non synchronized.
    //In Java LinkedList class, manipulation is fast because no shifting needs to occur.
    //Java LinkedList class can be used as a list, stack or queue.
    
    public static void main(String[]args){
        
        
        LinkedList ll = new LinkedList(); 
        
        ll.add("Hello");
        ll.add(1);
        ll.add('c');
        ll.add(10.50);
        ll.add(12345);
        
       //LinkedList Example to reverse a list of elements
       Iterator rit =  ll.descendingIterator();
       System.out.println("Print the  linkedlist items in reverse order ");
       while(rit.hasNext()){
           System.out.println(rit.next());
       }
        
        
        System.out.println("Size of linkedlist " +ll.size());
        
        //Print all linkedlist value by using loops
        
        System.out.println("*************By using for loop*********************");
        
        for (int i=0;i<ll.size();i++){
            
            System.out.println(ll.get(i));
            
            
        }
        
        System.out.println("**********************By using each/advance for loop*********");
        
        for(Object j:ll){
            
            System.out.println(j);
        }
        
        
       System.out.println("**********************By using Iterator*********"); 
       
       Iterator it = ll.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
           
       }
       
       
       System.out.println("**********************By using while loop*********");
       
       int num = 0;
       while(ll.size()>num){
           System.out.println(ll.get(num));
           num++;
           
       }
        
        
     
       
        System.out.println("############################ String LinkedList##########################################");
        
        
        LinkedList<String> sll = new LinkedList<String>();
        sll.add("Selenium");
        sll.add("Test");
        sll.add("is");
        sll.add("fun");
        
        
        System.out.println("Size of linkedlist" +sll.size());
        System.out.println(sll);
        
        sll.remove(0);
        System.out.println("Size of linkedlist" +sll.size());
        System.out.println(sll);
        
        sll.addFirst("java");
        System.out.println(sll);
        sll.addLast("end");
        System.out.println(sll);
        
        
        //sll.clear();   //clear all entries from the list
        sll.remove();     // clear the entry by indexing , by default clear first entry
        System.out.println(sll);
        
        System.out.println("**********************By using Iterator*********");
        
        Iterator<String> sit = sll.iterator();
        while(sit.hasNext()){
            
            System.out.println(sit.next());
            
            
        }
        
        
        System.out.println("**********************By using each/advance for loop*********");
        
        for(String str: sll){
            
            System.out.println(str);
        }
        
        
        
        
        System.out.println("############################ Addll LinkedList##########################################");
        
    
       sll.addAll(ll);
       
        System.out.println(sll); //displays all entries of both the linkedlist
               
    }
    
}
