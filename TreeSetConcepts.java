/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.TreeSet;

/**
 *
 * @author cmehta
 */
public class TreeSetConcepts {
    
    //The important points about Java TreeSet class are:

    //Java TreeSet class contains unique elements only like HashSet.
    //Java TreeSet class access and retrieval times are quiet fast.
    //Java TreeSet class doesn't allow null element.
    //Java TreeSet class is non synchronized.
    //Java TreeSet class maintains ascending order.
    
    public static void main(String[]args){
        
        TreeSet ts = new TreeSet();
        ts.add("TreeSet");
        ts.add("has");
        ts.add("unique");
        ts.add("element");
        ts.add("only");
        ts.add("not");
        ts.add("accept");
        ts.add("null");
        
        System.out.println(ts);
        
    }
    
}
