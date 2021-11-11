package com.cjss.ecomapp.controller;


import com.cjss.ecomapp.controller.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

interface CustomerRepository extends JpaRepository<Customer, Long> {

}