package projects;

public class Calculator {

   private int numbers;
   private int secondNumb;

    public void calcNumb() {
        System.out.println();
    }

    /*public Calculator(int numbers, int secondNumb){
         this.numbers = numbers;
         this.secondNumb =secondNumb;
     }*/

     public int getNumbers(){
         return this.numbers;
     }

     public void setNumbers(int numbers){
         this.numbers = numbers;
     }
    public int getSecondNumb(){
        return this.secondNumb;
    }
    public void setSecondNumb(int secondNumb){
        this.secondNumb = secondNumb;
    }

}
