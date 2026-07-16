#include<iostream>
using namespace std;

class Person {
public:
    string name;
    int age;
};

class Student : public Person {
public:
    int rollno;
};

class GradStudent : public Student {
public:
    string researchArea;
};

int main () {
    GradStudent s1;
    s1.name = "tony stark";
    s1.age = 34;
    s1.researchArea = "quantum physics";

    cout << "name: " << s1.name << endl;
    cout << "age: " << s1.age << endl;
    cout << "researchArea: " << s1.researchArea << endl;

    return 0;
}