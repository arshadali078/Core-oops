class Calculater{

    int add(int a, int b){

        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a,int b , int c){
        return a+b+c;
    }
}


public class Polymorphism_overloading {
    public static void main(String[] args) {
        Calculater s1=new Calculater();
        System.out.println("sum is a:" +s1.add(5,8));
        System.out.println("sum is a:" +s1.add(1.0,7.2));
        System.out.println("sum is a:" +s1.add(4,8,9));

    }
    
}
