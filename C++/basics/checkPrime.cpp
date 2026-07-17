#include <iostream>
using namespace std;

bool isPrime(int num) {
    int count = 0;
    if(num <= 1) {
        return false;
    } else {
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}

int main() {
    int number; 
    cout << "Enter a number: ";
    cin >> number;
    if(isPrime(number)) {
        cout << number << " is a prime number." << endl;
    } else {
        cout << number << " is not a prime number." << endl;
    }


    return 0;
}