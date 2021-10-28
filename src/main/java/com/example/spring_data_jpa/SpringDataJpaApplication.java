package com.example.spring_data_jpa;

import com.example.spring_data_jpa.entity.Employee;
import com.example.spring_data_jpa.respository.EmployeeRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(EmployeeRespository employeeRespository){
        return args -> {
            insertEmployee(employeeRespository);
        };
    }

    private void insertEmployee(EmployeeRespository employeeRespository){
        Employee employee = Employee.builder()
                .firstName("Minh")
                .lastName("Dao")
                .email("daominh@gmail.com")
                .build();
        employeeRespository.save(employee);
    }

}


