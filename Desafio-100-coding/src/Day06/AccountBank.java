package Day06;

/*
 * Dia 06 do #100daysofcode ,
 *  Continuação dos exercicios do dia anterior.
 * */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class AccountBank {

    private int numberAccount;
    private double balance;
    private boolean theAccountIsSpecial;
    private double specialCheckLimit;

    public AccountBank() {}

    public AccountBank(double balance, boolean theAccountIsSpecial, double specialCheckLimit) {
        this.numberAccount = defineNumberAccount();
        this.balance = balance;
        this.theAccountIsSpecial = theAccountIsSpecial;
        this.specialCheckLimit = specialCheckLimit;
    }

    private int defineNumberAccount() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }

    public void makeWithdrawal(double amount) {
        //this method checks the passed amount and handles possible errors
        if (amount > this.balance) {
            throw new IllegalArgumentException("Amount must be greater than the balance");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        this.balance -= amount;
    }

    public void depositMoney(double amount) {
        //this method makes a deposit into the customers account.
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        this.balance += amount;
    }

    public String checkBalance() {
        //this method checks the customers account balance.
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatter.format(this.balance);
    }

    public String checkSpecialBalance() {
        if (!this.theAccountIsSpecial) {
            return "Account from the customer is not a special account";
        }
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatter.format(this.specialCheckLimit);
    }
}
