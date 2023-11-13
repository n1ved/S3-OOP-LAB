class Employee{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    void printSalary(){
        System.out.println("Salary: "+salary);
    }
}
class Officer extends Employee{
    String specialization;
}
class Manager extends Employee{
    String department;
}

class InheritanceExample {
    public static void main(String[] args) {
        Officer o = new Officer();
        Manager m = new Manager();

        o.name = "John";
        o.age = 30;
        o.phoneNumber = "1234567890";
        o.address = "123, Main Street, New York";
        o.salary = 100000;
        o.specialization = "Finance";

        m.name = "Mary";
        m.age = 35;
        m.phoneNumber = "1234567890";
        m.address = "123, Main Street, New York";
        m.salary = 200000;
        m.department = "Finance";

        System.out.println("Officer Details:");
        System.out.println("Name: "+o.name);
        System.out.println("Age: "+o.age);
        System.out.println("Phone Number: "+o.phoneNumber);
        System.out.println("Address: "+o.address);
        o.printSalary();
        System.out.println("Specialization: "+o.specialization);

        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: "+m.name);
        System.out.println("Age: "+m.age);
        System.out.println("Phone Number: "+m.phoneNumber);
        System.out.println("Address: "+m.address);
        m.printSalary();
        System.out.println("Department: "+m.department);

    }
}
