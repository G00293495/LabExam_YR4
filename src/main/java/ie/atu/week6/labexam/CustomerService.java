package ie.atu.week6.labexam;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequestMapping("/customers")
public class CustomerService {

    private List<Customer> customerList = new ArrayList<Customer>();

    private CustomerService customerService;

    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    public Customer addCustomer(Customer customer){
        customerList.add(customer);
        return customer;
    }
}