package main;
import java.util.ArrayList;
import java.util.List;
public class HelloWorld1 {
	
	public static void main(String args[]){
		Greeting greet1 = message ->
	    System.out.println("Hello " + message);
	    greet1.getMessage("World");
	    List places = new ArrayList();
		
	    places.add("Seattle");
	    places.add("Kansas");
	    places.add("Alabama");
	    places.add("Ohio");
	    	
	    places.forEach(System.out::println);
	}
	}



