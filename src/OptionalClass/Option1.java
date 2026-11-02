package OptionalClass;

public class Option1 {
    public static void main(String [] args){
        Student obj = Student.stud();
    }
}
class Student{
    private Student(){
        System.out.println("*");
    }
    public static Student stud(){
        return new Student();
    }
}
