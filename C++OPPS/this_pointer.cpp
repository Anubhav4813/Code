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

    // obj.func()
    Teacher(string name, int age, string dept, string subject, double salary) {
        this->name = name;
        this->age = age;
        this->dept = dept;
        this->subject = subject;
        this->salary = salary;
    }

    // copy constructor
    Teacher(Teacher &orgObj) { // pass by reference
        cout << "this is a custom copy constructor...\n";
        this->name = orgObj.name;
        this->age = orgObj.age;
        this->dept = orgObj.dept;
        this->subject = orgObj.subject;
        this->salary = orgObj.salary;
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

    Teacher t3(t1); // default copy constructor -invoked

    cout << t3.name << endl;
    cout << t3.age << endl;
    cout << t3.dept << endl;
    cout << t3.subject << endl;
    cout << t3.getSalary() << endl;
    return 0;
}