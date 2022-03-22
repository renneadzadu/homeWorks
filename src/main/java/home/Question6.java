package home;

public class Question6 {
    public static int getSum(int[] sumUp) {
   int totalBill = 0;
   for (int x = 0; x < sumUp.length; x++){
       totalBill = totalBill + sumUp[x];

   }
        return totalBill;
    }


    public static void main(String[] args) {
        int[] studentFoodBills = {20, 5, 7, 13, 30,160};
        System.out.println(getSum(studentFoodBills));
    }
}

