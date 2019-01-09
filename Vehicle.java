public class Vehicle{
  private int numberOfwheels;
  private String color;

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return color;
  }

  public void setNumberOfWheels(int number){
    numberOfwheels = number;
  }

  public int getNumberOfWheels(int number){
    return number;
  }

  public static void main(String[] args){
    Vehicle bike = new Vehicle();
    Vehicle car = new Vehicle();
    car.setColor("Red");
    bike.setColor("Yellow");
    String bikeColor = bike.getColor();
    int bikeWheels = bike.getNumberOfWheels(2);
    int carWheels = car.getNumberOfWheels(4);

    System.out.println("Bike Wheels - " +  bikeWheels + " Bike Color: " + bikeColor);
    System.out.println(carWheels);
    System.out.println(car.getColor());
  }
}
