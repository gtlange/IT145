public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
   private String itemName;
   private int itemPrice;
   private int itemQuanity;
   
   /*Default Constructor
    itemName - Initialized to "none"
    itemPrice - Initialized to 0
    itemQuantity - Initialized ito 0
   */
   public ItemToPurchase () {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      }
    
   //public member methods (mutators & accessors)
   
   //setName() & getName() 
   public void setName(String itemName) {
      this.itemName = itemName;
      }
      
   public String getName() {
      return itemName;
      }
      
   //setPrice() & getPrice() 
   public void setPrice(int itemPrice) {
      this.itemPrice = itemPrice;
      }
      
   public int getPrice() {
      return itemPrice;
      }
      
   //setQuantity() & getQuantity() 
   public void setQuantity(int itemQuantity) {
      this.itemQuantity = itemQuantity;
      }
      
   public int getQuantity() {
      return itemQuantity;
      }
   
   //print item to purchase
   
   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
