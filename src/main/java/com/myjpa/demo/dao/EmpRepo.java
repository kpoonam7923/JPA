package com.myjpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.myjpa.demo.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{

}
