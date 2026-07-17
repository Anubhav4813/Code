#include<iostream>
#include<vector>
#include<algorithm>
#include<climits>
using namespace std;

int kthElement(vector<int>& arr, int k) {
    sort(arr.begin(), arr.end());
    return arr[k - 1];
}

int main() {
    vector<int> arr = { 14, 4, 31, 22, 64, 50 };
    int k = 3;

    int result = kthElement(arr, k);

    cout << "The " << k << "th smallest element is: " << result << endl;

    return 0;
}