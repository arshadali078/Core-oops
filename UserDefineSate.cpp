#include<iostream>
using namespace std;

class Student{
public:
    string name;
    int Roll_num;
    float cgpa;

};
int main(){
    Student s1;
    Student s2;

    s1.name = "Arshad Ali";
    s1.Roll_num = 1;
    s1.cgpa=7.9;

    s2.name = "Afjal Ali";
    s2.Roll_num = 4;
    s2.cgpa=9.9;

    cout<<s1.name<<""<<s1.Roll_num<<" " <<endl;
    cout<<s2.name<<""<<s2.Roll_num<<" " <<endl;
}