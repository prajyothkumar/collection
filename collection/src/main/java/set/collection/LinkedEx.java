package set.collection;

import java.util.LinkedList;

public class LinkedEx {

	   public static void main(String[] args) {
	      LinkedList<String> lList = new LinkedList<String>();
	    
	    	 
	      lList.add("0");
	      lList.add("1");
	      lList.add("2");
	      lList.add("3");
	      lList.add("4");
	      lList.add("infinity");
	      System.out.println(lList);
	      
	      lList.addFirst("0");
	      System.out.println(lList);
	      
	      lList.addLast("infinity");
	      System.out.println(lList);
	   }
	}
