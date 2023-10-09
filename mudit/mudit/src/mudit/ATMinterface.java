package mudit;
import java.util.Scanner;

public class ATMinterface {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Enter Your Id : ");
        String id=sc.next();
        BankAccount ba = new BankAccount(name, id);
        ba.checkId();
    }

} 
