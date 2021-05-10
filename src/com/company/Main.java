package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BANKAccount bankAccount = new BANKAccount();
        bankAccount.deposit(20000);

        for (int i = 0;; i++) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }

        }

        System.out.println(bankAccount.getAmount());
    }

}
