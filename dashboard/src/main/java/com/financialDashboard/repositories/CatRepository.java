package com.financialDashboard.repositories;

import com.financialDashboard.models.Cats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cats, Long> {




}
