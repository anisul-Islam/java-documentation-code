class Car {
  // properties
  String brand, color;
  int year;

  // constructor - same name as the class it belongs to and no return type not even void
  Car(String brand, String color, int year) {
    this.brand = brand;
    this.color = color;
    this.year = year;
  }

  // behaviours
  void startEngine() {
    System.out.println("Engine started");
  }

  void drive() {
    System.out.println("Car is driving");
  }

  void printDetails() {
    System.out.println("Car details: ");
    System.out.println("---------------");
    System.out.println("Brand: " + brand);
    System.out.println("Color: " + color);
    System.out.println("Year: " + year);
    System.out.println();
  }

}

class Test {
  public static void main(String[] args) {
    // create Car objets
    Car car1 = new Car("Toyota", "red", 2016);
    Car car2 = new Car("Honda", "blue", 2019);

    // priniting cars details
    car1.printDetails();
    car2.printDetails();

    // Invoke object behaviors
    car1.startEngine();
    car1.drive();
    car2.startEngine();
    car2.drive();
  }
}