/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author cmehta
 */
public class ListInterface {
    
    public static void main(String []args){
        
        List<Double> ar = new ArrayList();
        ar.add(10.00);
        ar.add(20.20);
        ar.add(30.30);
        ar.add(40.1);
        System.out.println("Size of arraylist " +ar.size());
        //System.out.println(ar.get(0));
        
        Iterator it = ar.iterator();
        while(it.hasNext()){            
            System.out.println(it.next());        
        }
    }    
}
