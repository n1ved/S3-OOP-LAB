import java.util.Scanner;

class Employee{
    int id;
    String Emp_name;
    String Emp_designation;
    int Emp_salary;
    Employee(int id, String Emp_name, String Emp_designation, int Emp_salary){
        this.id = id;
        this.Emp_name = Emp_name;
        this.Emp_designation = Emp_designation;
        this.Emp_salary = Emp_salary;
    }
}


public class EmployeeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees : ");
        int n = scanner.nextInt();
        Employee[] emp = new Employee[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter employee id : ");
            int id = scanner.nextInt();
            System.out.print("Enter employee name : ");
            String name = scanner.next();
            System.out.print("Enter employee designation : ");
            String designation = scanner.next();
            System.out.print("Enter employee salary : ");
            int salary = scanner.nextInt();
            emp[i] = new Employee(id, name, designation, salary);
        }
        System.out.println("Enter Emplyee ID to search : ");
        int search_id = scanner.nextInt();
        boolean found = false;
        for(int i=0; i<n; i++){
            if(emp[i].id == search_id){
                found = true;
                System.out.println("Employee found : ");
                System.out.println("ID : " + emp[i].id);
                System.out.println("Name : " + emp[i].Emp_name);
                System.out.println("Designation : " + emp[i].Emp_designation);
                System.out.println("Salary : " + emp[i].Emp_salary);
                break;
            }
        }
        if(!found){
            System.out.println("Employee of "+search_id+" not found");
        }
    }    
}
