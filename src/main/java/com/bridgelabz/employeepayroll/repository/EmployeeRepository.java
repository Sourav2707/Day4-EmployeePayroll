package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    @Query(value = "Select * from employee where name = ?", nativeQuery = true)
     EmployeeEntity findByName(String name);
}
