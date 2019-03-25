/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author cmehta
 */
public class DequeConcepts {
    
    //The important points about ArrayDeque class are:

    //Unlike Queue, we can add or remove elements from both sides.
    //Null elements are not allowed in the ArrayDeque.
    //ArrayDeque is not thread safe, in the absence of external synchronization.
    //ArrayDeque has no capacity restrictions.
    //ArrayDeque is faster than LinkedList and Stack.
    
    
    public static void main(String[]args){
        //Creating Deque and adding elements  
        Deque<String> deque = new ArrayDeque<String>();  
        deque.add("Ravi");    
        deque.add("Vijay");     
        deque.add("Ajay");    
        //Traversing elements  
            for (String str : deque) {  
                System.out.println(str);  
            }  
            
            
            
            ArrayDeque<String> deque1=new ArrayDeque<String>();  
            deque1.offer("arvind");  
            deque1.offer("vimal");  
            deque1.add("mukul");  
            deque1.offerFirst("jai");  
            System.out.println("After offerFirst Traversal...");  
                for(String s:deque1){  
                    System.out.println(s);  
                }  
            //deque.poll();  
            //deque.pollFirst();//it is same as poll()  
            deque1.pollLast();  
            System.out.println("After pollLast() Traversal...");  
                for(String s:deque1){  
                    System.out.println(s);  
                } 
        }    
    }
