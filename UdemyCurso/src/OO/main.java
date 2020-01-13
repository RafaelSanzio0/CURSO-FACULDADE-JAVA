package OO;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;
        double amount;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        System.out.print("Enter account holder: ");
        String holder = scanner.next();

        System.out.print("Is there na initial deposit (y/n)?: ");
        char response = scanner.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            amount = scanner.nextDouble();
            account = new Account(number,holder,amount);
        }else{
             account = new Account(number,holder);
        }
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println(account);
        scanner.close();
    }
}
