#include<iostream>
#include<cmath>
using namespace std;

int main() {
    double principal, rate, time, compound_interest, Amount;
    cout << "Enter the principal amount: ";
    cin >> principal;
    cout << "Enter the annual interest rate (in %): ";
    cin >> rate;
    cout << "Enter the time (in years): ";
    cin >> time;
    Amount = principal * pow((1 + rate / 100), time);
    compound_interest = Amount - principal;

    cout << "Compound Interest: " << compound_interest << endl;

    return 0;
}