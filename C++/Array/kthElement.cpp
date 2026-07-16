#include<iostream>
#include<vector>
#include<climits>
using namespace std;

int kthElement(vector<int>& arr) {
    
}

int main() {
    vector<int> arr = { 1, 4, 3, 2, 6, 5 };

    vector<int> result = kthElement(arr);

    for(int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }

    return 0;
}