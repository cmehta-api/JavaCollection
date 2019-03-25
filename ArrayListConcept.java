/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cmehta
 */
public class ArrayListConcept {
    
    public static void main (String[]args){
        
        //Java ArrayList class can contain duplicate elements.
        //Java ArrayList class maintains insertion order.
        //Java ArrayList class is non synchronized.
        //Java ArrayList allows random access because array works at the index basis.
        //In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur 
        //if any element is removed from the array list
        
        ArrayList al = new ArrayList();
        
        al.add("Selenium");
        al.add("is");
        al.add("is");
        al.add("fun");        
        al.add("tool");        
        System.out.println(al);
        
        Iterator it = al.iterator();
        System.out.println("the values of the arraylist");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
        
        System.out.println("******************Generic arraylist***************************");
        
        ArrayList<Integer> ail = new ArrayList<Integer>();
        ail.add(1);
        ail.add(2);
        ail.add(2);
        ail.add(3);        
        ail.add(4);        
        System.out.println(ail);
        
        
        ArrayList<String> asl = new ArrayList<String>();
        asl.add("Selenium");
        asl.add("is");
        asl.add("is");
        asl.add("fun");        
        asl.add("tool");        
        System.out.println(asl);
        
    }
    
}
