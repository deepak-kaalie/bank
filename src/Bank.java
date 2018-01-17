import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Bank {
    public static void main(String args[]) {
        int i, a, b = 0,c,f;
        Scanner scan = new Scanner(System.in);
        for(f=0;f<3;f++) {
        System.out.println("Enter your choice");
        i = scan.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Deposit");
                    System.out.println("Enter Money");
                    Scanner input = new Scanner(System.in);
                    a = input.nextInt();
                    b = a + b;
                    System.out.println("Your balance is updated to" + b);
                    break;
                case 2:
                    System.out.println("Your current balance is" +b);
                    System.out.println("Enter the amount to withdraw");
                    Scanner x=new Scanner(System.in);
                    c=x.nextInt();
                    if(c<b) {
                        b = b - c;
                        System.out.println("Your balance is" + b);
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    break;





            }


        }
    }
}
