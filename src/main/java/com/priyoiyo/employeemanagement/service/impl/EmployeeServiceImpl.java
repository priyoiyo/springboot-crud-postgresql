package com.priyoiyo.employeemanagement.service.impl;

import com.priyoiyo.employeemanagement.entity.EmployeeEntity;
import com.priyoiyo.employeemanagement.repository.EmployeeRepository;
import com.priyoiyo.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }



    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }


}
