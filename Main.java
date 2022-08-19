import java.util.HashMap;

public class Main{
    public static void main(String args[]){
      // creating a HashMap that can hold String/Integer key-value pairs
       HashMap<String, Integer> map = new HashMap<>();
  
      // adding to the map
       map.put("One", 1);
       map.put("Two", 2);
       map.put("Three", 3);
       map.put("Four", 4);
       map.put("Five", 5);
       map.put("Six", 6);
       map.put("Seven", 7);
       map.put("Eight", 8);
       map.put("Nine", 9);
       map.put("Ten", 10);
       map.put("Buick", 79);
  
       System.out.println(map);
      // removing from the map using a key
       map.remove("Buick");
  
      // printing out the map
       System.out.println(map);
    }
  }