#include<iostream>
using namespace std;
//construcer is not return typre

class Student{
public:
    string name;
    int Roll_num;
    float cgpa;


 Student(){//Deafutl constructor
   

 }
 Student(string name, int r, float g){//parameterized constructor
    name=name;
    Roll_num=r;
    cgpa=g;

}
};
int main(){
    Student s1("Arshad Ali",75, 7.3);

    Student s2;
   s2.name="afjal ali";
   s2.Roll_num==90;
   s2.cgpa=5.8;
  // s2.type='sedan';

   
    

    cout<<s1.name<<""<<s1.Roll_num<<" " <<s1.cgpa<<" "<<endl;
    
}