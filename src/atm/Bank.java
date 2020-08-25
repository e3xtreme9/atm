package atm;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;
    private DbDataSource dataSource;

    public Bank(String name) {
        this.name = name;
        //this.customers = new ArrayList<>();
        this.dataSource = new DbDataSource();
        this.customers = dataSource.getCustomerData();
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public Customer findCustomer(int id){

        for (Customer element: customers){
            if (element.getId() == id)
                return element;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
