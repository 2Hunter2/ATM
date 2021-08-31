import java.util.*;
  
public class Tester {
    public static void main(String[] args)
    {
  

        HashMap<String, Double> maps = new HashMap<String, Double>();
  

        maps.put("Geeks", 10.0);
        maps.deposit ("You", 10.0);
     
  

        System.out.println("Initial Mappings are: " + maps);
  
      
        System.out.println("The Value is: " + maps.get("Geeks"));
  
      
        System.out.println("The Value is: " + maps.get("You"));
    }
}