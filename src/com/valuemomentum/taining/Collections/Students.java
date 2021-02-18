package com.valuemomentum.taining.Collections;

import java.lang.*;
public class Students implements Comparable<Students> {
    int rollNo;
    String name;
    int age;
    public Students(int rollNo, String name, int age) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    public int compareTo(Students st) {
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
   
}

		 