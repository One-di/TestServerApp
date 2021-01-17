package org.example.JavaServerSpringboot.SpringAplication.repository;

import org.example.JavaServerSpringboot.SpringAplication.enitity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

    List<Customers> findAllByFio(String fio_customer);

    List<Customers> findAllById(int i);

}
