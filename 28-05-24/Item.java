//4=Design an inventory management system that keeps track of items in a store. Implement an Item class with fields for item ID, name, quantity, and price. Add methods to update the quantity, and display item details.
 

public class Item{
    private int itemID;
    private String name;
    private int quantity;
    private double price;

    public Item(int itemID, String name, int quantity, double price) {
      this.itemID = itemID;
      this.name = name;
      this.quantity = quantity;
      this.price = price;
    }
  
    public void updateQuantity(int newQuantity) {
      this.quantity = newQuantity;
    }
  
    public void displayItemDetails() {
      System.out.println("Item ID: " + itemID);
      System.out.println("Name: " + name);
      System.out.println("Quantity: " + quantity);
      System.out.println("Price:  RS :" + price);
    }

    public static void main(String[] args) {

      Item item = new Item(007, "PlayStation 5 ", 05, 50990);

      item.displayItemDetails();
  
      item.updateQuantity(8);
  

      item.displayItemDetails();
    }
  }
