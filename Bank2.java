import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

import static java.lang.System.exit;

public class Bank2 {
    public void main(String args[]) {
        newbank();
    }
public static int newbank(){

        int i, a, b = 0, c, f;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1.Deposit 2.Withdraw 3.Exit");
        i = scan.nextInt();
        {

            if (i == 1) {

                System.out.println("Deposit");
                System.out.println("Enter Money");
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                b = a + b;
                System.out.println("Your balance is updated to" + b);
            } else if (i == 2) {
                System.out.println("Your current balance is" + b);
                System.out.println("Enter the amount to withdraw");
                Scanner x = new Scanner(System.in);
                c = x.nextInt();
                if (c < b) {
                    b = b - c;
                    System.out.println("Your balance is" + b);
                } else {
                    System.out.println("Insufficient balance");
                }
            } else if (i==3){
                exit(0);
                System.out.println("Exit");
                return 0;
            }
        }
    return 0;
    }

}


