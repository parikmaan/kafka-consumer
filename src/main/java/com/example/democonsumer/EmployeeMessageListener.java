package com.example.democonsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMessageListener {
  private static long counter = 0;
  private static final String EMPLOYEE_MESSAGE_TOPIC = "employee-events";
  private final EmployeeRepository repository;

  @Autowired
  public EmployeeMessageListener(EmployeeRepository repository) {
    this.repository = repository;
  }

  @KafkaListener(topics = EMPLOYEE_MESSAGE_TOPIC, groupId = "group-1")
  public void setEmployeeMessageListener(String message) {
    this.saveMessage(message);
  }

  private void saveMessage(String message) {
    this.repository.save(new EmployeeMessage(counter, message)).block();
    counter++;
  }
}
