package com.example.spring_data_jpa.respository;

import com.example.spring_data_jpa.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends CrudRepository<Employee, Long>{


}
