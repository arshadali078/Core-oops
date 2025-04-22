
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
class puppy extends Animal{
    void weeps(){
        System.out.println("puppy weeps");
    }
}


public class HierarchicalDemo_inheritance {
    public static void main(String[] args) {
        Dog py=new Dog();
        
        py.bark();
        py.eat();

        puppy p=new puppy();
        p.weeps();
        p.eat();
        
    }
    
}
