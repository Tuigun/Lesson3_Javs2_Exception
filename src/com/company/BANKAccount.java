package com.company;

public class BANKAccount {

    private double amount;


    public double getAmount() {
        return amount;

    }

    public void deposit(double sum) {

        amount = amount + sum;
        //amount += sum; второй вариант
    }

    public void withDraw(int sum) throws LimitException {


        if (sum > amount) {
            throw new LimitException("на счету меньше денег", amount);
        } else {
            amount = amount - sum;

        }

    }
}
