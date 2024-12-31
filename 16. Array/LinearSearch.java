public class LinearSearch {

  public static String Menucard(String[] Menu, String order) {
      for (int i = 0; i < Menu.length; i++) {
          if (Menu[i].equals(order)) {
              return Menu[i];
          }
      }
      return "Item not found"; // Return a message if the order is not found
  }

  public static void main(String[] args) {
      String[] Menu = {"Apple", "Real juice", "Pizza", "Samosa", "Tea", "Milk", "Egg"};
      String Order = "hjjhjyj";  // The order you want to find

      String Value = Menucard(Menu, Order);
      
      // Checking if the item was found
      if (Value.equals("Item not found")) {
          System.out.println("The item you ordered is not available.");
      } else {
          System.out.println("You ordered: " + Value);
      }
  }
}
