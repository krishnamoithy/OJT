public class Student {
    private String name;
    private int age;
    private char grade;

    public void Student(){
        this.name = "Unknow";
        this.age =0;
        this.grade = 'U';
    }
    public void Student(String name) {
        this.name = name;
        this.age = 0;
        this.grade = 'U';
    }

    public void Student (String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getname(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getgrade(){
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student : Name =" + student.getname()+ ",age = "+ student.getAge()+",Grade ="+ student.getgrade());

        Student student1 = new Student();
        System.out.println("Student : Name =" + student1.getname()+ ",age = "+ student1.getAge()+",Grade ="+ student1.getgrade());
    }
}
