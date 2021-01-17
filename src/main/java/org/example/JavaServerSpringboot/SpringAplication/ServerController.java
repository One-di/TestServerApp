package org.example.JavaServerSpringboot.SpringAplication;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.example.JavaServerSpringboot.SpringAplication.enitity.Customers;
import org.example.JavaServerSpringboot.SpringAplication.repository.CustomersRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServerController {
    private static int result = 0;
    private final CustomersRepository customersRepository;

    public ServerController(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }


    @RequestMapping("/hello")
    public int hello(@RequestParam(value="first", required=false, defaultValue= "0") String first,
                        @RequestParam(value = "second",required = false,defaultValue = "0") String second) {
        result = Integer.parseInt(first)+Integer.parseInt(second);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/customers")
    public String showCustomers() {
        Customers customers = customersRepository.findById(Long.parseLong("3")).get();
        return customers.getFio();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/save")
    public String saveCustomer(@RequestBody Customers customers){
        customersRepository.save(customers);
        System.out.println(customers.getFio());
        return "success";
    }
}
