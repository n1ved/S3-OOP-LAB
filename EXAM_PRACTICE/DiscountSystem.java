/*
 * write a java program to implemet a discount system for a beuty salon. Which provides services and sells beauty products.
 * It offers three types of memberships : Premium, Gold and Silver. Premium,Gold and Silver members receive a discount 
 * of 20%, 15% and 10% respectively , for all services provided. Customers without membership receive no discount.
 * All members receive a flat 10% discount on all products purchased.Your system shall consist of three classses: Customer,
 * Discount and Visit. It shall compute the total bill if a customer purchases $x of products and $y of services.
 * for a visit . The class Discount contains only static methods and static variables.
 */

import java.util.Scanner;

class Customer{
    String name;
    String membership;
    public Customer(String name, String membership){
        this.name = name;
        this.membership = membership;
    }
}

class Discount{
    static double DiscountRate(String membership){
        if(membership.equals("premium"))
            return 0.2;
        else if(membership.equals("gold"))
            return 0.15;
        else if(membership.equals("silver"))
            return 0.1;
        else
            return 0;
    }
    static double productDiscount(){
        return 0.1;
    }
}

class Visit{
    Customer customer;
    double serviceExpense;
    double productExpense;
    public Visit(Customer customer, double serviceExpense, double productExpense){
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }
    public double totalExpense(){
        return (serviceExpense - serviceExpense * Discount.DiscountRate(customer.membership)) + (productExpense - productExpense * Discount.productDiscount());
    }
}
public class DiscountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Membership : ");
        String membership = scanner.nextLine().toLowerCase();

        Customer customer = new Customer(name, membership);

        System.out.print("Enter total ammount of services used : ");
        double serviceExpense = scanner.nextDouble();
        
        System.out.print("Enter total ammount of products bought : ");
        double productExpense = scanner.nextDouble();

        Visit visit = new Visit(customer, serviceExpense, productExpense);

        System.out.println("Total Bill of "+membership+" member "+name+" is : "+visit.totalExpense());

        scanner.close();
    }
}
