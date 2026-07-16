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

class Teacher : public Person {
public:
    string subject;
    double salary;
};

class TA : public Student, public Teacher {
public:
};

int main () {
    TA t1;
    t1.name = "tony stark";
    t1.age = 34;
    t1.rollno = 101;
    t1.subject = "quantum physics";
    t1.salary = 10000;

    cout << "name: " << t1.name << endl;
    cout << "age: " << t1.age << endl;
    cout << "rollno: " << t1.rollno << endl;
    cout << "subject: " << t1.subject << endl;
    cout << "salary: " << t1.salary << endl;

    return 0;
}