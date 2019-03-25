/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cmehta
 */
public class ArrayListVSLinkedList {
    
    //ArrayList    
    //1) ArrayList internally uses a dynamic array to store the elements.	
    //2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.	
    //3) An ArrayList class can act as a list only because it implements List only.	
    //4) ArrayList is better for storing and accessing data.
    
    //LinkedList
    //LinkedList internally uses a doubly linked list to store the elements.
    //Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
    //LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
    //LinkedList is better for manipulating data.
    
    
    
    public static void main (String[]args){
        
        List al = new ArrayList();
        al.add("Testing");
        al.add("is");
        al.add("not");
        al.add("easy");
        
        List ll = new LinkedList();
        ll.add("Testing");
        ll.add("is");
        ll.add("not");
        ll.add("easy");
        
        System.out.println("ArrayList:- " +al);
        System.out.println("LinkedLsit:- " +ll);
        
    }
    
}
