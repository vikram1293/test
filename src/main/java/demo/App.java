package demo;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

	List<String> persons = new ArrayList<>();
	persons.add("akhil");
	persons.add("vikram");
	persons.add("hitesh");
	persons.add("piyush");
	
	for(String name:persons)
        System.out.println( "Hello "+name );
    }
}
