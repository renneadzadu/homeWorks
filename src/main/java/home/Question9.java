package home;

public class Question9 {
    /*public static String extractAllEvenNumbers(int[] numbers) {
        for (int x = 0; x <= 12; x++) {
            if (x % 2== 0) {
                System.out.println(x);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] lists = {4, 9, 14, 5, 2, 7, 9, 13};
        System.out.println(extractAllEvenNumbers(lists));
    }
}*/
    public static String extractAllEvenNumbers(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2== 0) {
                System.out.println(numbers[x]);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] lists = {4, 9, 14, 5, 6, 22,2, 7, 9,10, 13};
       extractAllEvenNumbers(lists);
    }
}
