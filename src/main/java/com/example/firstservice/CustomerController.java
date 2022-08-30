package com.example.firstservice;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;
    public CustomerController(){
        customers = new ArrayList<>();
        customers.add(new Customer("1010","John","Male",25));
        customers.add(new Customer("1018","Peter","Male",24));
        customers.add(new Customer("1019","Sara","Female",23));
        customers.add(new Customer("1110","Rose","Female",23));
        customers.add(new Customer("1001","Emma","Female",30));
    }

    @RequestMapping(value = "/customers" , method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return customers;
    }

    @RequestMapping(value = "/customerbyid/{id}" , method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("id") String ID){
        for(Customer item:customers){
            if(item.getID().equals(ID)){
               return item;
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerbyname/{n}" , method = RequestMethod.GET)
    public Customer getCustomerByName( @PathVariable("n") String n){
        for(Customer item:customers){
            if(item.getName().equals(n)){
                return item;
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerDelbyID/{id}" , method = RequestMethod.DELETE)
    public boolean delCustomerByID(@PathVariable("id") String ID){
        for(Customer item:customers){
            if(item.getID().equals(ID)){
               return customers.remove(item);
            }
        }
        return false;
    }
    @RequestMapping(value = "/customerDelbyname/{n}" , method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("n") String n){
        for(Customer item:customers){
            if(item.getName().equals(n)){
                 return customers.remove(item);
            }
        }
    return false;
    }
    @RequestMapping(value = "/addCustomer" , method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("id") String ID, @RequestParam("name")String n,
                               @RequestParam("sex") String s, @RequestParam("age") int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }
    @RequestMapping(value = "/addCustomer2" , method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id") String ID, @RequestParam("name")String n,
                               @RequestParam("sex") String s, @RequestParam("age") int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }
}
