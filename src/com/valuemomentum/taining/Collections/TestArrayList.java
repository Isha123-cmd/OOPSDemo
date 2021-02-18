
package com.valuemomentum.taining.Collections;


import java.util.List;
import java.util.*;

 

public class TestArrayList {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List <String> al=new ArrayList<String>();
        al.add("Jim");
        al.add("michel");
        al.add("James");
        al.add("andy");
        
        Iterator itr =al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println(al.get(1));
        al.add(3, "Raj");     //adding element in specific index
        al.remove(0);        //delete the content
        al.set(1, "Java");  //replace existing content
        
           
        
        System.out.println("*****Display using for each loop");
        for(String i:al)
        {
        	System.out.println(i);
        }
        
        

 

    }

 

}