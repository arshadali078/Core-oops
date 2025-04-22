class Student{
    private String name;
    private int age;

     public String getname(){
        return name;
     }
     public void setname(String newname){
         name=newname;
     }
     public int getage(){
        return age;
     }
     public void setage(int a){
        if( age > 0){
            age=a;

        }else{
            System.out.println("age is must be positve");
        }
        
     }

}



public class Encapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setname("Arshad");
        s.setage(21);

        System.out.println("name is a:-"+s.getname());
        System.out.println("age is a:-"+s.getage());


        
    }
    
}
