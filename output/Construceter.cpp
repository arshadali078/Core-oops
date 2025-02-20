#include<iostream>
using namespace std;
//construcer is not return typre

class Student{
public:
    string name;
    int Roll_num;
    float cgpa;


 Student(string s, int r , float g){
    name=s;
    Roll_num=r;
    cgpa=g;

 }
};
int main(){
    Student s1("Arshad Ali",75, 7.3);
    

   
    

    cout<<s1.name<<""<<s1.Roll_num<<" " <<s1.cgpa<<" "<<endl;
    
}