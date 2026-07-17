// you cannot use ++ or -- operator directly on the objects of a class.
// But you can overload these operators to use them on the objects of a class. this is operator overloading in c++.

#include <iostream>
using namespace std;

class Channel {
    int subscribers;
public:
    Channel(int s) {
        subscribers = s;
    }

    void operator++() {
        subscribers++;
    }

    void display() {
        cout << "Subscribers: " << subscribers << endl;
    }
};

int main() {
    Channel c1(100);
    c1.display();
    ++c1; // Using the overloaded operator
    c1.display();

    return 0;
}