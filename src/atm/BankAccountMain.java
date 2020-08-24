package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount somchai = new BankAccount(787, "Somchai", "Saving");
        BankAccount nancy = new BankAccount(789, "Nancy", "Saving", 1000);
        somchai.deposit(500.00);
        nancy.deposit(999.00);
        somchai.withdraw(1.00);
        nancy.withdraw(1000);
        System.out.println(somchai.toString());
        System.out.println(nancy.toString());
    }
}
