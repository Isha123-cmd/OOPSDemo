package com.valuemomentum.training.ExceptionHandling;

class StringBufferDemo {
    /** Constructor. */
    protected StringBufferDemo() {
    }
    public static void main(final String []args) {

 

    StringBuffer buf = new StringBuffer("Java");
    buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
    buf.append(7);
    int index = 5;   // Insert  // Java Student Guide Ver1/7 
    buf.insert(index, "Student ");                               
    index = 23;      // Set  // Java Student Guide Ver1.7
    buf.setCharAt(index, '.');                                    
    int start = 24;   // Replace  // Java Student Guide Ver1.8
    int end = 25;
    String s;
    
    buf.replace(start, end, "8");                             
            String s1= buf.toString();   
            System.out.println(s1);
            }
        }