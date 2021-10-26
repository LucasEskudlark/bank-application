/*
* Cadastro: - Número da Conta
*           - Nome do titular da conta
*           - Valor de depósito inicial (opcional) - Caso não tenha, saldo inicial é 0
*
* OBS: Uma vez aberta a conta, o número da conta NUNCA poderá ser alterado. Já o nome sim
*
* O saldo da conta SÓ PODE ser alterado por método de depósito ou saque, podendo ficar negativo.
*
* */


package bankApplication;

import bankEntities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Locale + Scanner definition */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        /* Account number request */
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();

        /* Account holder request */
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();

        /* Deposit option request */
        System.out.print("Is there an initial deposit (y/n)? ");
        char option = scanner.next().charAt(0);

        /* If option = y -> Initial deposit request +
        * Instantiate object with account number, holder and initial deposit value*/
        Account account;
        if (option == 'y') {
            System.out.print("Enter initial deposit value: $");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }

        /* If option = n -> Instantiate object with account number and holder only */
        else {
            account = new Account(number, holder);
        }

        /* Printing account data(object) */
        System.out.println("\nAccount data:");
        System.out.println(account);

        /* Deposit value request */
        System.out.print("\nEnter a deposit value: ");
        double value = scanner.nextDouble();
        account.deposit(value); // Using deposit method
        /* Printing updated account data(updated object) */
        System.out.println("Updated account data: ");
        System.out.println(account);

        /* Withdrawal value request */
        System.out.print("\nEnter a withdrawal value: ");
        value = scanner.nextDouble();
        account.withdrawal(value); // Using withdrawal method
        /* Printing updated account data(updated object) */
        System.out.println("Updated account data: ");
        System.out.println(account);

    }
}
