// 5=mplement a student management system. Create a Student class with fields for student ID, name, age, and grades. Add methods to update grades, and display student information.

class Student {
    private int studentID;
    private String name;
    private int age;
    private double[] grades;

    public Student(int studentID, String name, int age, double[] grades) {
      this.studentID = studentID;
      this.name = name;
      this.age = age;
      this.grades = grades;
    }
  
    public void updateGrades(double[] newGrades) {
      this.grades = newGrades;
    }
  
    public void displayStudentInfo() {
      System.out.println("Student ID: " + studentID);
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.print("Grades: ");
      for (double grade : grades) {
        System.out.print(grade + " ");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
    
      double[] grades = {85.5, 90.0, 78.0};
      Student student = new Student(1, "KRISHNAMOORTHY", 20, grades);
      student.displayStudentInfo();
      double[] newGrades = {100, 100, 100};
      student.updateGrades(newGrades);
      student.displayStudentInfo();
    }
  }
  