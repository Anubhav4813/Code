#include<iostream>
using namespace std;

class Teacher {
private:
    double salary;
public:
    string name;
    int age;
    string dept;
    string subject;

    Teacher() {
        cout << "Constructor called..." << endl;
    }

    Teacher(string n, int aged, string department, string sub, double sal) {
        name = n;
        age = aged;
        dept = department;
        subject = sub;
        salary = sal;
    }

    void changeDept(string newDept) {
        dept = newDept;
    }

    // getter
    double getSalary() {
        return salary;
    }

    // setter
    double setSalary(int s) {
        salary = s;
    }
};

int main() {
    Teacher t1;
    t1.name = "Anubhav";
    t1.age = 24;
    t1.dept = "Computer Science";
    t1.subject = "C++";
    t1.setSalary(25000);


    Teacher t2("Robin", 26, "Computer Science", "Java", 115000);

    cout << t1.name << endl;
    cout << t1.age << endl;
    cout << t1.dept << endl;
    cout << t1.subject << endl;
    cout << t1.getSalary() << endl;

    cout << t2.name << endl;
    cout << t2.age << endl;
    cout << t2.dept << endl;
    cout << t2.subject << endl;
    cout << t2.getSalary() << endl;
    return 0;
}