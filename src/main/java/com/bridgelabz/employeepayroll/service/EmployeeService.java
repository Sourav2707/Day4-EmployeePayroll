package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.entity.EmployeeEntity;
import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    public String postEmployee(EmployeeEntity empBean) {
        employeeRepository.save(empBean);
        return "succefully saved \n"+empBean;
    }
    public EmployeeEntity getEmployee(String name) {
        return employeeRepository.findByName(name);
    }
    public void deleteEmployee(String name) {
        employeeRepository.delete(employeeRepository.findByName(name));
    }
}
