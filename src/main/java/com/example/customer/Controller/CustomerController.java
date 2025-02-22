package com.example.customer.Controller;

import com.example.customer.Model.Customer;
import com.example.customer.Service.CustomerService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(value = "")
    public List<Customer>getAllCustomer(){
        return this.customerService.getAllCustomers();
    }

    @GetMapping(value = "/{id}")
    public Customer getSpecificCustomer(@PathVariable int id){
        return this.customerService.specificCustomer(id);
    }
    @RequestMapping(value = "/{id}/delete")
    public void deleteSpecific(@PathVariable int id){
     this.customerService.deleteSpecific(id);
    }
    @DeleteMapping(value = "/delete")
    public void deleteAll(){
        this.customerService.deleteAllCustomers();
    }

//    @GetMapping
//    public String getMessage(){
//        return "Hello, world";
//    }

}
