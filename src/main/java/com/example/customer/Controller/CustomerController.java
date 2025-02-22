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
    @RequestMapping(value = "", method=RequestMethod.GET)
    public List<Customer>getAllCustomer(){
        return this.customerService.getAllCustomers();
    }

    @RequestMapping(value = "/{id}" ,method=RequestMethod.GET)
    public Customer getSpecificCustomer(@PathVariable int id){
        return this.customerService.specificCustomer(id);
    }
    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public void deleteSpecific(@PathVariable int id){
     this.customerService.deleteSpecific(id);
    }
    @DeleteMapping(value = "/delete")
    public void deleteAll(){
        this.customerService.deleteAllCustomers();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer){
        this.customerService.addCustomer(customer);
    }
    @RequestMapping(value = "/{id}/edit", method = RequestMethod.PUT)
    public void editCustomer(@RequestBody Customer customer, @PathVariable int id){
        this.customerService.editCustomer(customer,id);
    }

//    @GetMapping
//    public String getMessage(){
//        return "Hello, world";
//    }

}
