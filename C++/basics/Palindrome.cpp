#include <iostream>
using namespace std;

// bool isPalindrome(int num) {
//     int temp = num;
//     int reversed = 0;
//     while(temp > 0) {
//         int digit = temp % 10;
//         reversed = reversed * 10 + digit;
//         temp /= 10;
//     }

//     if(num == reversed) {
//         return true;
//     } else {
//         return false;
//     }
// }

int main() {
    int a;
    cout << "Enter a number: ";
    cin >> a;

    if(isPalindrome(a)) {
        cout << a << " is a palindrome number." << endl;
    } else {
        cout << a << " is not a palindrome number." << endl;
    }


    return 0;
}