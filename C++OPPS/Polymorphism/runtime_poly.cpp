// also known as dynamic polymorphism
// function overriding
#include <iostream>
using namespace std;

class Parent {
public:
    void getInfo() {
        cout << "parent class" << endl;
    }

    virtual void hello() {
        cout << "hello from parent class" << endl;
    }
};

class Child : public Parent {
public:
    void getInfo() {
        cout << "child class" << endl;
    }

    void hello() {
        cout << "hello from child class" << endl;
    }
};

int main() {
    Child c1;
    c1.getInfo(); // calls child class method
    c1.hello();

    
    return 0;
}