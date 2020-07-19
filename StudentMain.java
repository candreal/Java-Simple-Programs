class StudentMain
{
  public static void main(String[] args)
  {
    System.out.println("Hello world!");

    Student4 s1 = new Student4(111, "Celena");
    Student4 s2 = new Student4(222, "Todd", 28);

    s1.display();
    s2.display();
  }
}

//new class, template for creating an object of class student4
class Student4
{
  //a student4 object has the following states/data types: id, name, and age
  int id;
  String name;
  int age;

  //constructors, with constructor overloading
  Student4(int i, String n)
  {
    id = i;
    name = n;
  }
  Student4(int i, String n, int a)
  {
    id = i;
    name = n;
    age = a;
  }

  //a student4 object has the following behaviors/methods: display
  void display()
  {
    System.out.println(id + " " + name + " " + age);
  }
}
