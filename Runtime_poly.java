class Student{
    String name;
    int age;

    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    Student(String n, int a){
        this.name=n;
        this.age=a;
    }
}

public class Runtime_poly{
    public static void main(String args[]){
        Student s1=new Student("Neel",18);
        Student s2=new Student(s1);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}