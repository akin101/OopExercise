package bank_account;

import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount("0602240",22500);
        BankAccount acc2 = new BankAccount("B200", 1000);

        boolean running = true;
        while (running) {
            System.out.println("1 → Deposit");
            System.out.println("2 → Withdraw");
            System.out.println("3 → Account Details");
            System.out.println("4 → Exit");
            System.out.print("Seçiminiz: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Hangi hesap? 1 veya 2: ");
                    int dAcc = sc.nextInt();
                    System.out.print("Miktar: ");
                    double dAmount = sc.nextDouble();
                    if(dAcc == 1) acc1.deposit(dAmount);
                    else acc2.deposit(dAmount);
                    break;

                case 2:
                    System.out.print("Hangi hesap? 1 veya 2: ");
                    int wAcc = sc.nextInt();
                    System.out.print("Miktar: ");
                    double wAmount = sc.nextDouble();
                    if(wAcc == 1) acc1.withdraw(wAmount);
                    else acc2.withdraw(wAmount);
                    break;


                case 3:
                    acc1.accountDetails();
                    acc2.accountDetails();
                    break;

                case 4:
                    running = false;
                    System.out.println("program sonlandırıldı, görüşmek üzere");
                    break;
            }
        }

    }
}
