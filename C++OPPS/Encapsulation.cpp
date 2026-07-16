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
    t1.dept = "A1";
    t1.subject = "Maths";

    t1.setSalary(25000);

    cout << t1.name << endl;
    cout << t1.age << endl;
    cout << t1.dept << endl;
    cout << t1.subject << endl;
    cout << t1.getSalary() << endl;
    return 0;
}