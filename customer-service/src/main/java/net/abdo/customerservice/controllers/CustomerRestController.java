package net.abdo.customerservice.controllers;

import net.abdo.customerservice.entities.Customer;
import net.abdo.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @GetMapping("/customers/{id}")
    public Customer findCustomerById(Long id){
        return  customerService.findCustomerById(id);
    }
    @PostMapping("/customers")
    public Customer saveCustomer(Customer customer){
        return customerService.saveCustomer(customer);
    }
}
