import java.util.Scanner;
class CompareTwoNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(a+" is less than "+b);
        }
        else{
            System.out.println("Both are equal");
        }
        scanner.close();
    }
}