package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.entity.EmployeeEntity;
import com.bridgelabz.employeepayroll.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    /**
     * This method is to demonstarte the post method in employe payroll app
     * @param empBean
     * @return the success message along with the json data which we have posted
     */
    @PostMapping("/posting")
    public String postingEmp(@RequestBody EmployeeEntity empBean) {
        return employeeService.postEmployee(empBean);
    }
    /**
     * This method is to demonstarte the put method in employe payroll app
     * @param empBean
     * @return the success message along with the json data which we have put
     */
    @PutMapping("/putting")
    public String puttingEmp(@RequestBody EmployeeEntity empBean) {
        return employeeService.postEmployee(empBean);
    }
    /**
     * This method is to get mapping along with query on repository to get by name
     * @param name
     * @return the data from the table with respect to name
     */
    @GetMapping("/getByName/{name}")
    public EmployeeEntity gettingByName(@PathVariable String name) {
        return employeeService.getEmployee(name);
    }
    @DeleteMapping("/delete/{name}")
    public String deleteByName(@PathVariable String name) {
        employeeService.deleteEmployee(name);
        return "Deleted successfully";
    }
}
