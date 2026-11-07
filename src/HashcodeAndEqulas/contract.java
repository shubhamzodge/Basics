package HashcodeAndEqulas;

class student {
    int age;
    String name;
    student(int age,String name){
        this.age= age;
        this.name = name;
    }
}
public class contract {
    public static void main(String [] args){
        student obj = new student(8,"Raju");
        student obj2 = new student(8,"Raju");
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
}
