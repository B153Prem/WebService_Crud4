package com.cjc.web.crud.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.web.crud.main.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{
	
   public Employee findAllByeId(int eId);

}
