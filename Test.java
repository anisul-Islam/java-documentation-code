class Person {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

class Teacher extends Person {
  private double salary;

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void printDetails() {
    System.out.println("Name: " + getName());
    System.out.println("Age: " + getAge());
    System.out.println("salary: " + getSalary());
  }
}

class Test {
  public static void main(String[] args) {
    Person p = new Person();
    Teacher t1 = new Teacher();

    System.out.println(p instanceof Person);
    System.out.println(p instanceof Teacher);

    t1.setName("Anisul Islam");
    t1.setAge(33);
    t1.setSalary(4.500);
    t1.printDetails();

    Teacher t2 = new Teacher();
    t2.setName("Anisul Islam");
    t2.setAge(33);
    t2.setSalary(4.500);
    t2.printDetails();
  }

}