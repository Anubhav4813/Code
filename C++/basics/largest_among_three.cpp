#include <iostream>
using namespace std;

void largestAmongThree(int a, int b, int c) {
    if(a >= b && a >= c) {
        cout << a << endl;
    }
    else if(b >= a && b >= c) {
        cout << b << endl;
    }
    else {
        cout << c << endl;
    }
}

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    cout << "The largest number among " << a << ", " << b << ", and " << c << " is: ";
    largestAmongThree(a, b, c);


    return 0;
}