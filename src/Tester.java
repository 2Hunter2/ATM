import java.util.*;
  
public class Tester {
    public static void main(String[] args)
    {
  
        // Creating an empty HashMap
        HashMap<String, Double> maps = new HashMap<String, Double>();
  
        // Mapping int values to string keys
        maps.put("Geeks", 10.0);
        maps.put("You", 30.0);
        maps.deposit ("Geeks", 20.0);
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + maps);
  
        // Getting the value of "Geeks"
        System.out.println("The Value is: " + maps.get("Geeks"));
  
        // Getting the value of "You"
        System.out.println("The Value is: " + maps.get("You"));
    }
}