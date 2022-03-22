package home;

public class Question7 {
    public static int  getAverage(int[] arrayOfAve) {
        int totalBill = 0;
        for (int x = 0; x < arrayOfAve.length; x++) {
            totalBill = totalBill + arrayOfAve[x]/arrayOfAve.length;
        }
        return totalBill;
    }

    public static void main(String[] args) {
        int[] studentFoodBills = {20, 15, 7, 13, 30,160};
        System.out.println(getAverage(studentFoodBills));
    }
}
