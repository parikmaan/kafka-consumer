package com.example.democonsumer;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<EmployeeMessage, Long> {
}
