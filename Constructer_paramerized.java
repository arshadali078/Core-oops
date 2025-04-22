class Student{
     String name;
     int age;

     Student(String name, int age){
         this.name=name;
         this.age=age;
     }
     void display(){
        System.out.println("Name is: " + name + "  ,age is :"+age);
     }
}

public class Constructer_paramerized {
    public static void main(String[] args) {

        Student s1=new Student("Arshad", 20);
        s1.display();
        
    }
    
}
