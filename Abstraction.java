abstract class vechle{
     abstract void start();

     void fuel(){
        System.out.println(" fuel is need....");
     }
}
class Car extends vechle{
    void start(){
        System.out.println("Car is working");
    }
}
class bike extends Car{
    void start(){
        System.out.println("new bike is comming.....");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        vechle v1=new Car();
        v1.start();
        v1.fuel();

        vechle v2=new bike();
        v2.fuel();
        v2.start();
        
    }
    
}
