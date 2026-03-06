import javax.swing.JOptionPane;
 
//Main clss that runs the program
public class QuickServerApp {
    
    public static void main(String[] args) {
        
        //Ask the user for order information with pop up dialogues
        String name = JOptionPane.showInputDialog("Enter your name:");
        String studentNo = JOptionPane.showInputDialog("Enter your student: ");
        String item = JOptionPane.showInputDialog("Enter item ordered:");
        
        //Change quantity input from text to integer
        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter quantity:")
        );
        
        //Change price input from text to double
        double price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter price per item:")
        );
        
        //Create new Order using the user's input
        Order order = new Order(name, studentNo, item, quantity, price);
        
        double subtotal = order.getSubtotal();
        double discount = order.getDiscount();
        double vat = order.getVAT();
        double total = order.getTotal();
        
        //Create a receipt string to display the results 
        String receipt = 
                "Campus QuickServe Receipt\n\n" +
                "Customer: " + name + "\n" +
                "Student Number: " + studentNo + "\n" +
                "Item: " + item + "\n" +
                "Quantity: " + quantity + "\n\n" +
                 "Subtotal: R" + subtotal + "\n" +
                 "Discount: R" + discount + "\n" +
                "VAT: R" + vat + "\n\n" +
                   "Total: R" + total;
        
        //Display the receipt to the user
        JOptionPane.showMessageDialog(null, receipt);
    }

}
