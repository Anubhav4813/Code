#include <iostream>
using namespace std;

void invertedTriangle(int n) {
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n - i + 1; j++) {
            cout << "* ";
        }
        cout << endl;
    }
}

int main() {
    int n = 5;
    invertedTriangle(n);


    return 0;
}