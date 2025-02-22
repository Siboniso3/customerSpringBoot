package com.example.customer.Service;

import com.example.customer.Model.Customer;
import com.example.customer.Model.Status;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    List<Customer> list = new ArrayList<>();
    private Status status;
    public CustomerService() {
        list.add(new Customer(
                1, "Siboniso",
                "Ncube", "2000-04-30","2024-01-20", "Active" ,12));
        list.add(new Customer(
                2, "John",
                "John", "1998-05-20","2023-01-20", "Active" ,13));
        list.add(new Customer(
                3, "Maria",
                "Jane", "1981-06-10","2012-03-21", "Inactive" ,45));
        list.add(new Customer(
                4, "Ben",
                "Motshwari", "1991-06-10","2015-10-03", "Active" ,28));
        list.add(new Customer(
                5, "Lihle",
                "Cele", "2005-07-15","2025-01-20", "Active" ,21));

    }

    public String CustomerService() {
        System.out.println("here");
        return "IT IS DONE";
    }

    public Customer specificCustomer(int id) {
        if (!list.isEmpty()) {
            for (Customer c : list) {
                if (c.getId() == id) {
                    return c;
                }

            }
        }
        return null;
    }

    public List<Customer> getAllCustomers() {
        return this.list;
    }

//    public void deleteSpecific(int id) {
//        this.list.remove(id);
//    }
    public Customer deleteSpecific(int id) {
        if(list.isEmpty()){
            return null;
        }else {
            for (Customer customer : list) {
                if (customer.getId() == id) {
                    this.list.remove(customer);

                }
            }
        }
        return null;
    }

    public void deleteAllCustomers() {
       this.list.removeAll(list);
    }

    public void addCustomer(Customer customer){
        this.list.add(customer);
    }
    public void editCustomer(Customer c, int id){
        if(!list.isEmpty()){
            for (Customer customer: list) {
                if (c.getId() == id) {
                    this.list.add(c);

                }
            }
        }

    }
}
