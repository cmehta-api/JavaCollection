/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author cmehta
 */
public class LinkedHashSetConcepts {
    
    
   // The important points about Java LinkedHashSet class are:

    //Java LinkedHashSet class contains unique elements only like HashSet.
    //Java LinkedHashSet class provides all optional set operation and permits null elements.
    //Java LinkedHashSet class is non synchronized.
    //Java LinkedHashSet class maintains insertion order.
    
    public static void main(String[]args){
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("one");
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("four");
        lhs.add("five");
        
        Iterator it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }       
    }   
}
