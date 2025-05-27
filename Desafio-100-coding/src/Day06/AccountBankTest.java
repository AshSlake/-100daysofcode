package Day06;

public class AccountBankTest {
    public static void main(String[] args) {
        AccountBank account1 = new AccountBank(100,true,1500);

        account1.depositMoney(50000);
        System.out.println(account1.checkBalance());

        account1.makeWithdrawal(2500);
        System.out.println(account1.checkBalance());

        System.out.println(account1.checkSpecialBalance());
    }
}
