#include<iostream>
#include<vector>
#include<climits>
using namespace std;

vector<int> findMinMax(vector<int>& arr) {
    int n = arr.size();
    int min = INT_MAX, max = INT_MIN;

    vector<int> temp;
    for(int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    temp.push_back(min);
    temp.push_back(max);
    return temp;
}

int main() {
    vector<int> arr = { 1, 4, 3, 2, 6, 5 };

    vector<int> result = findMinMax(arr);

    for(int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }

    return 0;
}