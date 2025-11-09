import java.io.File; //Java needs this to understand what File means
import java.io.PrintWriter;
import java.util.Scanner;

public class inventorySystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[5];
        int[] itemQuan = new int[5];
        double[] itemPrice = new double[5];
        int itemCount = 0;
        boolean running = true;

        // 🔁 Load previous data from file
        try { //try, You "try" to run code that might go wrong
            File file = new File("inventory.txt"); //Create a File object that points to a file called
            if (file.exists()) {
                Scanner fileReader = new Scanner(file); 
                while (fileReader.hasNextLine()) { //Keep reading lines from the file as long as there's another line to read.
                    String name = fileReader.nextLine();
                    int quantity = Integer.parseInt(fileReader.nextLine());
                    double price = Double.parseDouble(fileReader.nextLine());
                    itemName[itemCount] = name;
                    itemQuan[itemCount] = quantity;
                    itemPrice[itemCount] = price;
                    itemCount++;
                     // Use Integer.parseInt(sc.nextLine()) instead of sc.nextInt()
                     // nextInt() leaves newline (\n), causing bugs when using nextLine()
                     // nextLine() reads cleanly + parseInt() converts to int safely

                }
                fileReader.close();
            }
        } catch (Exception e) { // If an error (called an exception) happens in the try block             
            System.out.println("Error loading data." + e.getMessage());
            //Java jumps to catch to handle it without crashing the program

        }

        while (running) {
            System.out.println("\nInventory Menu:");
            System.out.println("1. Add Item.");
            System.out.println("2. View Inventory.");
            System.out.println("3. Update Item.");
            System.out.println("4. Delete Item.");
            System.out.println("5. Search Item.");
            System.out.println("6. Exit.");
            System.out.print("\nChoose an option: ");
            int option = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (option == 1) {
                if (itemCount < itemName.length) {
                    System.out.print("Enter item name: ");
                    String existName = sc.nextLine();
                    
                    //check for duplicate
                    boolean exist = false;

                     for (int i = 0; i < itemCount; i++) {
                        if (itemName[i].equalsIgnoreCase(existName)) {
                           exist = true;
                           break;
                    }
                }

                    if(exist){
                        System.out.println("The item is already existed in the inventory.");
                        System.out.println("\nPress Enter to return to the menu...");
                        sc.nextLine();
                        }
                    else{    
                        
                        itemName[itemCount] = existName;
                        System.out.print("Enter quantity: ");
                        itemQuan[itemCount] = sc.nextInt();
                        System.out.print("Enter price (per unit): RM ");
                        itemPrice[itemCount] = sc.nextDouble();
                        sc.nextLine();
                        itemCount++;
                        System.out.println("Item added.");
                } }
                else {
                    System.out.println("Inventory full!");
                 }
                
           
            }
            else if (option == 2) {
                System.out.println("\nInventory List:");
                if (itemCount == 0) {
                    System.out.println("No items added.");
                } else {
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println((i + 1) + ". " + itemName[i] + " | Quantity: " + itemQuan[i] + " units | Price: RM " + itemPrice[i]);
                    }
                }
                System.out.println("\nPress Enter to return to the menu...");
                sc.nextLine();
            }

            else if (option == 3) {
                System.out.print("Enter the item name to update: ");
                String updateItem = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < itemCount; i++) {
                   if(itemName[i].equalsIgnoreCase(updateItem)){
                     System.out.println("What do you want to update?");
                     System.out.println("1. Quantity only");
                     System.out.println("2. Price only");
                     System.out.println("3. Both");
                     System.out.print("Choose: ");
                     int updateOption = Integer.parseInt(sc.nextLine());

                     if(updateOption == 1 || updateOption == 3){
                        System.out.print("Enter new quantity: ");
                        itemQuan[i] = Integer.parseInt(sc.nextLine()); //if want to use normal input, need to put sc.nextLine
                     }

                     if(updateOption == 2 || updateOption == 3){
                        System.out.print("Enter new price: ");
                        itemPrice[i] = Double.parseDouble(sc.nextLine());
                     }

                     System.out.println("\nItem updated.");
                     System.out.println(itemName[i] + " | Quantity: " + itemQuan[i] + " units | Price: RM " + itemPrice[i]);
                     found = true;
                     break;
                   }
               }               
                     if (!found) {
                        System.out.println("Item not found.");
                     }
                     System.out.println("\nPress Enter to return to the menu...");
                     sc.nextLine();
            }

            else if (option == 4) {
                System.out.print("Enter the item name to delete: ");
                String deleteItem = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < itemCount; i++) {
                    if (itemName[i].equalsIgnoreCase(deleteItem)) {
                        for (int k = i; k < itemCount - 1; k++) {
                            itemName[k] = itemName[k + 1];
                            itemQuan[k] = itemQuan[k + 1];
                            itemPrice[k] = itemPrice[k + 1];
                        }
                        itemCount--;
                        System.out.println("Item deleted.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("\nItem not found.");
                }
            }
            
            else if(option == 5){
               System.out.print("Enter item to be searched: ");
               String itemSearch = sc.nextLine();
               boolean found = false;
      
               for (int i= 0; i < itemCount; i++){
                  if (itemName[i].equalsIgnoreCase(itemSearch)){
                     System.out.println("Item found. " + itemName[i] + " | Quantity: " + itemQuan[i] + " units | Price: RM " + itemPrice[i]);
                     found = true;
                     
                     break;
                     }}
               if (!found) {
                    System.out.println("Item not found.");
                    }
                    System.out.println("\nPress Enter to return to the menu...");
                    sc.nextLine();
                    
                }
      
            else if (option == 6) {
                // 📝 Save inventory to file before exit
                try {
                    PrintWriter writer = new PrintWriter("inventory.txt");
                    for (int i = 0; i < itemCount; i++) {
                        writer.println(itemName[i]);
                        writer.println(itemQuan[i]);
                        writer.println(itemPrice[i]);
                    }
                    writer.close();
                    System.out.println("Inventory saved.");
                } catch (Exception e) {
                    System.out.println("Error saving inventory.");
                }

                running = false;
                System.out.println("Exiting the system. Goodbye!");
            }

            else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
