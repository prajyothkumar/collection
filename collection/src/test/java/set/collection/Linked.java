package set.collection;

import java.util.Iterator; 
import java.util.LinkedList; 

public class Linked{
	public static void main(String args[]){
		
	  LinkedList<String> list = new LinkedList<String>(); 
	  
      
      list.add("apple"); 
      list.add("mango"); 
      list.add("banana"); 
      list.add("apricots"); 
      list.add("cherry"); 
      list.add("pitaya");
      list.add("plum");
      list.add("pluot");
      list.add("damson");
      list.add("blueberry");
      
      System.out.println(list);
      
   
      System.out.println("LinkedList Elements :");
      int i = 0;
 	while (list.size() > i) {
    	  System.out.println(list.get(i));
    	  i++;
          }
 	
      
      list.addFirst("mango");
      
     list.add(2, "kiwi");
      list.add(5, "lemon");
    
      list.remove("pluot"); 
      list.remove("damson");  
      
     
      list.add(1,"orange");
      list.add(5,"papaya");
      list.add(7,"fig");
      System.out.println(list);
      
      list.remove("plum"); 
      list.remove("pitaya");   
      
      System.out.println(list);
      Iterator<String> iterator=list.iterator();
      while(iterator.hasNext()){
        System.out.println(iterator.next());
          }
    }
}

  
    
