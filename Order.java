
// This is an order from a customer
public class Order {
  
   //These are variables to store order information
   String customerName;
   String studentNumber;
   String item;
   int quantity;
   double price;
   
   final double VAT = 0.15;
   
   //Constuctor to create an order object
   public Order(String name, String studentNo, String itemName, int qty, double itemPrice) {
       customerName = name;
       studentNumber = studentNo;
       item = itemName; 
       quantity = qty;
       price = itemPrice;
       
   }
   
   //Calculate subtotal price x quantity 
   public double getSubtotal() { 
       return quantity * price;
       
   }
   
   //Calculate discount if quantity is more than 3
   public double getDiscount() {
       if (quantity > 3) {
           return getSubtotal() * 0.10;
           
       }
       return 0;
      
   } 
   //Calculate VAT on the discounted amount 
   public double getVAT() {
       double amount = getSubtotal() - getDiscount();
       return amount * VAT;
   }
   //Calculate the final total
   public double getTotal() {
       return getSubtotal() - getDiscount() + getVAT();
       
   }
}


