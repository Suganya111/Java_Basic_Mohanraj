
package com.aaludra.exception.handling;

public class ThrowExample {
	public static void validate(int age) {  
        if(age<18) {  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
        	System.out.println("person is eligible to vote");  
        }  
    }  
    public static void main(String[] args){  
        validate(17);  
        System.out.println("remaining code...");    
  }    

}
