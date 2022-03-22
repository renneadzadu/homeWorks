package homeWork;

public class Question1 {
     public static void main(String[] args) {
          String product = "Mug";
          int qty = 20;
          float price = 5.0f;
          float total = qty * price;
          System.out.printf("%-10s%-10s%-10s%-10s\n","Product","Qty","Price","Total");
          System.out.printf("%-10s%-10s%-10s%-10s\n","---","---","-----","-----");
          System.out.printf("%-10s%-10d%-10.2f%-10.2f",product, qty, price, total);

      }

  }

