package ie.atu.week6.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CustomerController {
    private List<Customer> customerList = new ArrayList<Customer>();

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(@PathVariable Long id){
        return customerService.getAllCustomers();
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

}
