class Shape {
  double dim1, dim2;

  Shape(double dim1, double dim2) {
    this.dim1 = dim1;
    this.dim2 = dim2;
  }

  double area() {
    return 0;
  }
}

class Rectangle extends Shape {

  Rectangle(double dim1, double dim2) {
    super(dim1, dim2);
  }

  double area() {
    return dim1 * dim2;
  }
}

class Triangle extends Shape {

  Triangle(double dim1, double dim2) {
    super(dim1, dim2);
  }

  double area() {
    return 0.5 * dim1 * dim2;
  }
}

class Test {
  public static void main(String[] args) {
    Shape s = new Shape(0, 0);
    System.out.println("Shape Area: " + s.area());

    s = new Rectangle(10, 20);
    System.out.println("Rectangle Area: " + s.area());

    s = new Triangle(10, 20);
    System.out.println("Triangle Area: " + s.area());
  }
}