package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.entity.EmployeeEntity;

public interface IEmployeeService {
    String postEmployee(EmployeeEntity empBean);
    EmployeeEntity getEmployee(String name);
    void deleteEmployee(String name);
}
