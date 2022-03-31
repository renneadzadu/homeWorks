package products;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;

    abstract void calcTotal();

//    public Vehicle(int qty, int price) {
//        this.qty = qty;
//        this.price = price;
//    }
    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.getName());
    }

    public int getQty() {
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
