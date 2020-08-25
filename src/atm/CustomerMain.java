package atm;

public class CustomerMain {

    public static void main(String[] args) {
        Customer peter = new Customer(1331 , "Peter Corp", "195874");
        Customer nancy = new Customer(1332 , "Nancy Ananya", "354127");
        //System.out.println(peter.checkPin("195874"));


        Bank bank = new Bank("KTB Bank");
        bank.addCustomer(peter);
        bank.addCustomer(nancy);

        ATM atm = new ATM(bank);
        atm.validateCustomer(1331 , "195874");
        atm.deposit(1000);
        System.out.println(peter);

        atm.transfer(1332 , 2000);
        System.out.println(peter);
        System.out.println(nancy);

//        System.out.println(bank.findCustomer(1331));
//        Customer c1 = bank.findCustomer(1331);
//        Customer c2 = bank.findCustomer(5888);
//        System.out.println(bank.toString());
        //System.out.println(c1);
        //System.out.println(c2);
        System.out.println("==============");
        System.out.println(bank);
    }
}
