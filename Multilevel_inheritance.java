class Animal{
    void eat(){
        System.out.println("animal eats food");
    } 
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is braks");
    }
}
class puppy extends Dog{
    void weeps(){
        System.out.println("puppy weeps");
    }
}


public class Multilevel_inheritance {
    public static void main(String[] args) {
        puppy py=new puppy();
        py.weeps();
        py.bark();
        py.eat();
        
    }
    
}
