package program;

import entities.Account;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // Configurando as configurações baseadas no sistema
        // para facilitar a interpretação da JVM

        // infos tiradas de: https://blog.cod3r.com.br/o-que-e-locale/

        Scanner useInput = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accNumber = useInput.nextInt();

        System.out.print("Enter account holder: ");
        String accHolder = useInput.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = useInput.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialAmount = useInput.nextDouble();

            // fazendo a construção do objeto conta:
            account = new Account(accNumber, accHolder, initialAmount);
        }else{
            account = new Account(accNumber, accHolder);
        }

        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.printf("Enter a deposit value: ");
        double depositValue = useInput.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.printf("Enter a withdraw value: ");
        double withdrawValue = useInput.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();


        useInput.close();
    }
}