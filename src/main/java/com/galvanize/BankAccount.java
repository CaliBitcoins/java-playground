package com.galvanize;

public class BankAccount {
    private long bankAccount = 0;
    private boolean overDrawn = false;

    public void deposit(long cents) {
        bankAccount += cents;
    }

    public void withdraw(long cents) {
        bankAccount -= cents;
    }

    public long balance() {
        return bankAccount;
    }

    public boolean isOverDrawn() {
        if (bankAccount >= 0) {
            overDrawn = false;
        } else if (bankAccount < 0) {
            overDrawn = true;
        }
        return overDrawn;
    }

}
