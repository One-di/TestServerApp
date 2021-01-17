package org.example.JavaServerSpringboot.SpringAplication.service;

import org.example.JavaServerSpringboot.SpringAplication.enitity.Customers;
import org.example.JavaServerSpringboot.SpringAplication.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public void createCustomers(Customers customers){
        customersRepository.save(customers);
    }

    public List<Customers> findAllByFiocustomer(String fio){
        return customersRepository.findAllByFio(fio);
    }
    public List<Customers> findAll(){
        return customersRepository.findAll();
    }
}
