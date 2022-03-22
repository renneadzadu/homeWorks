package home;

public class Questions8 {
    public static String extractAllOddNumbers(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 2 !=0){
                System.out.println(numbers[x]);
            }
            }

        return null;
    }

    public static void main(String[] args){
            int[] lists = {4, 9, 11,3, 14, 5, 2, 7, 9, 23,13};
            extractAllOddNumbers(lists);

        }

    }

