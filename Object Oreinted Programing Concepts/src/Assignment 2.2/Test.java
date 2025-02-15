import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        
        String[] customers = {"Jamie", "Bill", "Joe"};
        
        // Create items
        StockItem milk = new StockItem("Milk", 3.00);
        StockItem chicken = new StockItem("Chicken", 5.00);
        StockItem eggs = new StockItem("Egg", 0.50);
        StockItem apple = new StockItem("Apple", 1.00);
        StockItem orange = new StockItem("Orange", 1.50);

     
        PurchaseOrder po1 = new PurchaseOrder("Jamie");
        po1.addItem(new OrderItem(milk, 2));
        po1.addItem(new OrderItem(chicken, 2));
        po1.addItem(new OrderItem(eggs, 12));

        PurchaseOrder po2 = new PurchaseOrder("Jamie");
        po2.addItem(new OrderItem(apple, 5));
        po2.addItem(new OrderItem(orange, 10));

        PurchaseOrder po3 = new PurchaseOrder("Bill");
        po3.addItem(new OrderItem(chicken, 5));
        po3.addItem(new OrderItem(apple, 10));

        ArrayList<PurchaseOrder> orders = new ArrayList<>();
        orders.add(po1);
        orders.add(po2);
        orders.add(po3);


        System.out.println("Orders to be shipped:");
        for (PurchaseOrder order : orders) {
            System.out.println("Customer: " + order.getCustomerName());
            for (OrderItem item : order.getItems()) {
                System.out.println(item.getQuantity() + " x " + item.getItem().getName());
            }
            System.out.println("Total: $" + order.getTotal());
            System.out.println();
        }

        shipOrder(po1);
        shipOrder(po3);
        shipOrder(po2);

      
        printTotalSales(orders);

        printInvoices(orders);
        
       System.out.println("Occurrences of 'to': " + checkOccurrences("To be or not to be", "to"));
       String[] productNames = initProductNames();
       System.out.println("Is 'Milk' present? " + isPresent(productNames, "Milk"));
       int[] numbers = {1, 2, 3, 4, 5};
       System.out.println("Position of 3: " + findPosition(3, numbers));
       System.out.println("Reversed paragraph: " + reverseWordsInParagraph("To be or not to be"));
   }

   private static void shipOrder(PurchaseOrder order) {
       System.out.println("Shipping order for: " + order.getCustomerName());
   }

   private static void printTotalSales(ArrayList<PurchaseOrder> orders) {
       double totalSalesJamie = 0;
       double totalSalesBill = 0;

       for (PurchaseOrder order : orders) {
           if (order.getCustomerName().equals("Jamie")) {
               totalSalesJamie += order.getTotal();
           } else if (order.getCustomerName().equals("Bill")) {
               totalSalesBill += order.getTotal();
           }
       }
       System.out.println("Total sales for Jamie: $" + totalSalesJamie);
       System.out.println("Total sales for Bill: $" + totalSalesBill);
   }

   private static void printInvoices(ArrayList<PurchaseOrder> orders) {
       for (PurchaseOrder order : orders) {
           System.out.println("--- Invoice ---");
           System.out.println("Customer: " + order.getCustomerName());
           for (OrderItem item : order.getItems()) {
               System.out.printf("%d x %s @ $%.2f each\n", item.getQuantity(), item.getItem().getName(), item.getItem().getPrice());
           }
           System.out.printf("Total: $%.2f\n", order.getTotal());
           System.out.println("----------------");
       }
   }

   static int checkOccurrences(String sentence, String word) {
       String[] words = sentence.split("\\s+");
       int count = 0;
       for (String w : words) {
           if (w.equalsIgnoreCase(word)) count++;
       }
       return count;
   }

   static String[] initProductNames() {
       return new String[]{"Milk", "Chicken", "Egg", "Apple", "Orange"};
   }


   static boolean isPresent(String[] productNames, String keyword) {
       for (String name : productNames) {
           if (name.equalsIgnoreCase(keyword)) return true;
       }
       return false;
   }

   // Method to find the position of a number in an array
   static int findPosition(int num, int[] nos) {
       for (int i = 0; i < nos.length; i++) {
           if (nos[i] == num) return i; 
       }
       return -1; 
   }

   
   static String reverseWordsInParagraph(String paragraph) {
       String[] words = paragraph.split("\\s+");
       StringBuilder reversedParagraph = new StringBuilder();

       for (String word : words) {
           StringBuilder reversedWord = new StringBuilder(word).reverse();
           reversedParagraph.append(reversedWord).append(" ");
       }
       
       return reversedParagraph.toString().trim();
   }
}
