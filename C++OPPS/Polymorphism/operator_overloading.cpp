#include <iostream>
using namespace std;

class Box {
public:
    int items;

    Box(int count) : items(count) {}

    // Adds a plain integer directly to the Box count
    Box operator+(int extra_items) {
        return Box(this->items + extra_items);
    }
};

int main() {
    Box myBox(10);

    // Using the overloaded + operator
    Box updatedBox = myBox + 5;

    cout << "Items in box: " << updatedBox.items << endl;
    // Output: Items in box: 15

    return 0;
}
