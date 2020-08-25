package atm;

import java.util.ArrayList;

public class WebServiceDataSource implements DataSource{

    public ArrayList<Customer> getCustomerData(){
        //จำลองการต่อ Web Service API ดึงข้อมูลลูกค้า
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(300 , "แอนดี้" , "4567"));
        customers.add(new Customer(400 , "ลูซี่" , "5678"));
        return customers;
    }
}
