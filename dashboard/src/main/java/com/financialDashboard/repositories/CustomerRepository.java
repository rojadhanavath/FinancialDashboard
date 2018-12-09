package com.financialDashboard.repositories;

import com.financialDashboard.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{


}
