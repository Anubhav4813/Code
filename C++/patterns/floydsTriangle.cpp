#include <iostream>
using namespace std;

void flyodsTriangle(int n) {
    int count = 0;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            count++;
            cout << count << " ";
        }
        cout << endl;
    }
}

int main() {
    int n = 5;
    flyodsTriangle(n);


    return 0;
}

// Need an odd number sequence? $(2i - 1)
// Need a decreasing sequence? $(n - i)