class Animal{

    void sound(){
        System.out.println("animal make a sound");
    }

}
class dog extends Animal{
    void bark(){
        System.out.println("dog make a sound");
    }
}





public class Inheritance {
    public static void main(String[] args) {

        dog  D=new dog();
        D.sound();
        D.bark();
        
    }
    
}
