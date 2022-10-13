package groceries;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryApplication {

    private static GroceryList grocerylist = new GroceryList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("Please select an option: ");
            choice = Integer.parseInt(sc.nextLine());

                switch(choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        grocerylist.printGroceryList();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        searchForItem();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print options");
        System.out.println("\t 1 - to print the list of grocery items.");
        System.out.println("\t 2 - to add item to list.");
        System.out.println("\t 3 - to modify list.");
        System.out.println("\t 4 - to remove item from list.");
        System.out.println("\t 5 - to search for item in list.");
        System.out.println("\t 6 - to quit the application.");

    }

    public static void addItem () {
        System.out.println("Please enter the grocery item.");
        Scanner scanner = new Scanner(System.in);
        grocerylist.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        Scanner scanner2 = new Scanner(System.in);
        int itemNo = scanner2.nextInt();
        scanner2.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner2.nextLine();
        grocerylist.modifyGroceryList(itemNo - 1, newItem);
    }

    public static void removeItem () {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter item number: ");
        int itemNo = scanner3.nextInt();
        grocerylist.removeItem(itemNo - 1);
    }

    public static void searchForItem() {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Search for item: ");
        String searchItem = scanner4.nextLine();
        if (grocerylist.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem  + " in grocery list.");
        } else {
            System.out.println(searchItem + " was not found.");
        }
    }

}
