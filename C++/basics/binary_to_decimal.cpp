#include <iostream>
using namespace std;

int binaryToDecimal(string num) {
    int dec_value = 0;
    int base = 1;

    int len = num.length();

    for(int i = len - 1; i >= 0; i--) {
        if(num[i] == '1') {
            dec_value = dec_value + base;
        }
        base = base * 2;
    }

    return dec_value;
}


int main() {
    string binary_num = "11010100101"; // Example binary number
    int decimal_num = binaryToDecimal(binary_num);
    cout << "Binary: " << binary_num << " => Decimal: " << decimal_num << endl;

    return 0;
}