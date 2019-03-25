/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cmehta
 */
public class HashMapConcepts {
    
    public static void main(String[]Args){
        
        //HashMap is non synchronized and not thread safe
        //HashMap is better for non-threading applications
        //HashMap allows one null key and multiple null values
        //HashMap is non synchronized. It is not-thread safe 
        //and can’t be shared between many threads without proper synchronization code 
        //whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
        //HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
        //HashMap is generally preferred over HashTable if thread synchronization is not needed
        
        Map hm = new HashMap();
        hm.put(1, "Selenium");
        hm.put(2, "is");
        hm.put(2, "is");
        hm.put(3, "fun");
        hm.put(4, null);
        hm.put(null, "fun");
        hm.put(null, "no");
        hm.put(5, null);
        System.out.println(hm);  //{null=no, 1=Selenium, 2=is, 3=fun, 4=null, 5=null}
        
        Set s = hm.entrySet();
        System.out.println(s);
        
        
        System.out.println("HashMap entries");

        HashMap hm1 = new HashMap();
        hm1.put(1, "Selenium");
        hm1.put(2, "is");
        hm1.put(2, "is");
        hm1.put(3, "fun");
        hm1.put(4, null);
        hm1.put(null, "fun");
        hm1.put(null, "no");
        hm1.put(5, null);
        System.out.println(hm1);
        
        
        System.out.println("LinkedHashMap entries");
        HashMap hm2 = new LinkedHashMap();
        hm2.put(1, "Selenium");
        hm2.put(2, "is");
        hm2.put(2, "is");
        hm2.put(3, "fun");
        hm2.put(4, null);
        hm2.put(null, "fun");
        hm2.put(null, "no");
        hm2.put(5, null);
        System.out.println(hm2);
        
    }
    
}
