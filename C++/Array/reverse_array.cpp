#include<iostream>
#include<vector>
using namespace std;

void reverseArray(vector<int>& arr) {
    int n = arr.size();

    vector<int> temp(n);

    for(int i = 0; i < n; i++) {
        temp[i] = arr[n - i - 1];
    }

    for(int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}

void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}

void reverseTwoPointerApproach(vector<int>& arr) {
    int left = 0;
    int right = arr.size() - 1;

    while(left < right) {
        swap(arr[left], arr[right]);
        left++;
        right--;
    }
}

int main() {
    vector<int> arr = { 1, 4, 3, 2, 6, 5 };
    // reverseArray(arr);

    // cout << "array after reversing: ";
    // for(int i = 0; i < arr.size(); i++) {
    //     cout << arr[i] << " ";
    // }
    cout << "Array after reversing: ";
    reverseTwoPointerApproach(arr);

    for(int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }

    return 0;
}