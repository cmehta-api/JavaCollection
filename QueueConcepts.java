/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsConcepts;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author cmehta
 */
public class QueueConcepts {
    
    public static void main(String[] args){
        
        Queue q = new PriorityQueue();
        
        q.add("queue 1");
        q.add("queue 1");
        q.add("queue 2");
        q.add("queue 3");
       // q.add(null);                    //Exception in thread "main" java.lang.NullPointerException
        q.add("queue 4");
        
        System.out.println(q);
        
       System.out.println("PriorityQueue contents"); 
       PriorityQueue pq = new PriorityQueue(); 
        pq.addAll(q);
        
        System.out.println(pq);
        
    }
    
}
