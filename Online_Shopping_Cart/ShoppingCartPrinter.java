import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
    System.out.println("Item 1");
    System.out.println("Enter the item name: ");
        item1.setName(scnr.nextLine());

        System.out.println("Enter the item price: ");
        item1.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt());  
        
        scnr.nextLine();
        System.out.println("");
 
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      item2.setName(scnr.nextLine());

      System.out.println("Enter the item price: ");
      item2.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt());

      System.out.println("");
      
      // Add costs of two items and print total
      System.out.println("TOTAL COST");
      item1.printItemPurchase();
      item2.printItemPurchase();
      
      
      // cartTotal = item one price + item two price
      cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
      System.out.println("");
      
      // Total Cost
      System.out.println("Total: $" + cartTotal);
      // item one information
      // item two information
      // Total output
      
      return;
   }
   }
