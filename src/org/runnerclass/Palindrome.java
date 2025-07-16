package org.runnerclass;

public class Palindrome {

	public static void main(String[] args) {

       String s = "madam";
       String reversed = "";
       
       for(int i= s.length()-1; i>=0; i--) {
    	   
    	   reversed += s.charAt(i);
       }
       
       if(s.equals(reversed)) {
    	   System.out.println(s + " is a palindrome"); 
       }
       else {
    	   System.out.println(s + " is not a palindrome");
       }

	}

}
