#include<iostream>
using namespace std;

class Cricketer{
    public:
    string name;
    int runs;
    float Avg;

    Cricketer(string name, int runs, float Avg){//same variable name use this keyword
        this->name=name;
        this->runs=runs;
        this->Avg=Avg;
    }
};
void change(Cricketer*  c){
   // (*c).Avg=67.7;//same work two line

   c->Avg=67.7;

}
int main(){
    Cricketer c1("Virat Kohli",25000,66.4);
    cout<<c1.Avg<<endl;
    change(&c1);
    cout<<c1.Avg<<endl;
   // Cricketer c2("Rohit Sharma",20000,55.7);
    
 cout<<c1.name<<" "<<c1.runs<<endl;
// cout<<c2.name<<" "<<c2.runs<<endl;
}