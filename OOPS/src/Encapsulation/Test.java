package Encapsulation;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Anubhav";
//        student.rollNumber = 12;
//        student.age = 23;
//        System.out.println(student.name);

        student.setName("Anubhav");
        student.setRollNumber(12);
        student.setAge(23);
        System.out.println(student.getName());
        System.out.println(student.getRollNumber());
        System.out.println(student.getAge());
    }
}
