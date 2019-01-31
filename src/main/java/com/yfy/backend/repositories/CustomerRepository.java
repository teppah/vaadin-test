package com.yfy.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yfy.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
