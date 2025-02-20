#include<iostream>
using namespace std;

class Car{
    public:

    string name;
    int price;
    int seats;
    string type;
};

void Print(Car c){
    cout<<c.name<<c.price<<c.seats<<c.type<<endl;
}
int main(){
      Car s1;

      s1.name="Honda city";
      s1.price==564789;
      s1.seats=5;
      s1.type='sedan';

      Car s2;

      s2.name="Toyoto";
      s2.price==564789;
      s2.seats=5;
      s2.type='Suv';


      Print(s1);
      Print(s2);

}