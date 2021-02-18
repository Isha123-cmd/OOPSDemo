package com.valuemomentum.taining.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

 public static void main(String[] args) {
ArrayList<Students> al=new ArrayList<Students>();
al.add(new Students(111,"john",29));
al.add(new Students(222,"Mike",21));
al.add(new Students(555,"Mary",26));
Collections.sort(al);
for(Students st:al)
{

System.out.println(st.rollNo+""+st.name+""+st.age);
}
}
}