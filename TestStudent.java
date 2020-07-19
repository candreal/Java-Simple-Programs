class TestStudent
{
  public static void main(String[] args)
  {
    //class needs to be called TestStudent
		//creating instance of encapsulated Student class
		Student s = new Student();

		//setting value in studentId member
		s.setStudentId(123456789);
		//getting value in studentId member
		System.out.println("Student ID: " + s.getStudentId());

		//setting value in studentName member
		s.setStudentName("Celena");
		//getting value in studentName member
		System.out.println("Student Name: " + s.getStudentName());

		//setting value in collegeName member
		s.setCollegeName("University of North Texas");
		//getting value in collegeName member
		System.out.println("College: " + s.getCollegeName());

		//setting value in address member
		s.setAddress("1234 Street Rd");
		//getting value in address member
		System.out.println("Student Address: " + s.getAddress());
  }
}

//Student class, fully encapsulated
class Student
{
  private int studentId;
  private String studentName;
  private String collegeName;
  private String address;
  
  int getStudentId()
  {
    return studentId;
  }

  void setStudentId(int id)
  {
    studentId = id;
  }

  String getStudentName()
  {
    return studentName;
  }

  void setStudentName(String name)
  {
    studentName = name;
  }

  String getCollegeName()
  {
    return collegeName;
  }

  void setCollegeName(String college)
  {
    collegeName = college;
  }

  String getAddress()
  {
    return address;
  }

  void setAddress(String address)
  {
    this.address = address;
  }
}
