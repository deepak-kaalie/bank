import java.util.Scanner;


public class newbank {
    public static int newbank() {
        int i=0,j;
        int a,b=0;
        Scanner scan = new Scanner(System.in);
        for (j = 0; i!=4; i++) {
            System.out.println("Enter your choice");
            System.out.println("1.Deposit 2.Withdraw 3.Exit");
            i = scan.nextInt();
            if (i == 1) {

                System.out.println("Deposit");
                System.out.println("Enter Money");
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                b = a + b;
                System.out.println("Your balance is updated to" + b);


            } else if (i == 2) {
                int  c;
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

            }

        }


        return i;
    }

}
