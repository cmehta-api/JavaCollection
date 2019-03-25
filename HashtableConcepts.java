/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author cmehta
 */
public class HashtableConcepts {
    
    
    public static void main(String[] args){
        
        //it is simillar to Hashmap but it's synchronized
        //strore the values on the basis of key -value
        //key-->Object-->Hashcode-->Value
        //It is thread safe and can be shared between many threads
        //Hashtable doesn't allow any null key or value.
        //Does not allows duplicate key & values
        
       Hashtable ht = new Hashtable(); 
       ht.put("1", "Java");
       ht.put("2", "is");
       ht.put("3", "object");
       ht.put("4", "oriented");
       ht.put("5", "programming");
       ht.put("6", "language");
       
        System.out.println("print the hashtable values :- " +ht);
        
        System.out.println("Size of hashtable :- " +ht.size());
        
        //Returns an enumeration of the values in this hashtable. 
        //Use the Enumeration methods on the returned object to fetch the elements sequentially.
        Enumeration en = ht.elements();
        System.out.println("print the values of hashtable by using enumeration method");
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        
        
        //print the hashtable values by using entrySet method
        Set s = ht.entrySet();
        System.out.println("Print the hashtable values by using entrySet method:- " +s);
        
        
        //Clone the hashtable
        Hashtable ht1 = new Hashtable(); 
        ht1 = (Hashtable)ht.clone();
        System.out.println("Print the values of clone hashtable :- " +ht1);
        
        //does not impact on clone hashtable values even though clear the values of original hashtable
        ht.clear();
        System.out.println("Print the values of clone hashtable :- " +ht1);
        System.out.println("Print the values of original hashtable :- " +ht);
        
        
        //check bothe hashtable are equals 
        
       Hashtable ht2 = new Hashtable(); 
       ht2.put("1", "Java");
       ht2.put("2", "is");
       ht2.put("3", "object");
       ht2.put("4", "oriented");
       ht2.put("5", "programming");
       ht2.put("6", "language");
       
       if(ht1.equals(ht2))
            System.out.println("Both hashtable are equal");
       
       
    //generic hashtable    
    Hashtable<Integer ,String> ht3 = new Hashtable<Integer ,String>();
     ht3.put(1, "Selenium");
     ht3.put(2, "is");
     ht3.put(3, "fun");
     ht3.put(1, "Selenium");                    //Duplicate values ignored by JVM
     //ht3.put(null, "Selenium");                 //Exception in thread "main" java.lang.NullPointerException
     //ht3.put(1, null);                          //Exception in thread "main" java.lang.NullPointerException
     //ht3.put(null, null);                       //Exception in thread "main" java.lang.NullPointerException
     
     //Print the values of hashatble 3 :- {3=fun, 2=is, 1=Selenium}
     System.out.println("Print the values of hashatble 3 :- " +ht3); 
     
     
       System.out.println("**********************************");
       Hashtable ht4 = new Hashtable(); 
       ht4.put("1", "Java");
       ht4.put("2", "java");
       ht4.put("3", "object");
       ht4.put("4", "oriented");
       ht4.put("5", "programming");
       ht4.put("6", "language");
     
        System.out.println(ht4); //{6=language, 5=programming, 4=oriented, 3=object, 2=java, 1=Java}
     
    }
    
}
