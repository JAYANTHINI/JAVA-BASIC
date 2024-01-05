package newprogram;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise {
public static void main(String[]args) {
	ArrayList<String>  color=new ArrayList<String>();
	  color.add("pink");
	  color.add("yellow");
	  color.add("skyblue");
	  System.out.println(color);
	  System.out.println(color.get(0));
	
	  ArrayList<Integer>  number=new ArrayList<Integer>();
	  number.add(2);
	  number.add(3);
	  number.add(6);
	  System.out.println(number);
	  
	  
	  
	  LinkedList<Integer>  number1=new LinkedList<Integer>();
	  number1.add(2);
	  number1.add(3);
	  number1.add(6);
	  number1.remove(1);	
	  System.out.println(number1);
	  
	
	
}
}
