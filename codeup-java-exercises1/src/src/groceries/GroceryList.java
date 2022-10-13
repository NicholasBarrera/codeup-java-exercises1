package groceries;

import java.util.HashMap;
import java.util.ArrayList;


public class GroceryList {
   private ArrayList<String> grocerylist = new ArrayList<>();

   public void addGroceryItem(String item) {
       grocerylist.add(item);
   }

   public void printGroceryList() {
       System.out.println("You have " + grocerylist.size() + " in your cart");
       for (int i = 0; i < grocerylist.size(); i++) {
           System.out.println((i + 1) + " " + grocerylist.get(i));
       }
   }

   public void modifyGroceryList( int position, String  newItem) {
           grocerylist.set(position, newItem);
           System.out.println("Grocery item" + (position+1) + "has been modified.");
       }

   public void removeItem(int position) {
       String theItem = grocerylist.get(position);
       grocerylist.remove(position);
   }

  public String findItem (String searchItem) {
       int position = grocerylist.indexOf(searchItem);
       if (position >= 0) {
           return grocerylist.get(position);
       }
       return null;
  }
    }

