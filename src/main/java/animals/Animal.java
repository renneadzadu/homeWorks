package animals;

public class Animal {
    private String food;

    public void makeNoise(){
        System.out.println("sounds");
    }
    public String getFood(){
        return this.food;
    }
    public void setFood(String food){
        this.food = food;
    }
}
