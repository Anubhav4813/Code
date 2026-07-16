// Function Overloading, compile time polymorphism
#include<iostream>
using namespace std;

class Print {
public:
    void show(int x) {
        cout << "Integer: " << x << endl;
    }

    void show(char ch) {
        cout << "Character: " << ch << endl;
    }
};

int main(){
    Print p1;
    p1.show(5);
    p1.show('a');

    return 0;
}