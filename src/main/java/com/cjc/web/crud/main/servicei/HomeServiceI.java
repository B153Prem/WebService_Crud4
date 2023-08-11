package com.cjc.web.crud.main.servicei;

import com.cjc.web.crud.main.model.Employee;

public interface HomeServiceI {
	
	public void saveData(Employee e);
	
	public Iterable<Employee>displayAll();
	
	public void deleteData(Employee e);
	
	public Employee getSingleData(int eId);

}
