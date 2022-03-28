package projects;

public abstract class Calculator {

   private int numbers;
   private int secondNumb;


     public void calcNumb(){
         System.out.println();
     }

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
