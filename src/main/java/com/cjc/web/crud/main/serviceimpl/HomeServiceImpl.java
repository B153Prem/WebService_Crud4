package com.cjc.web.crud.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.web.crud.main.model.Employee;
import com.cjc.web.crud.main.repository.HomeRepository;
import com.cjc.web.crud.main.servicei.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
	
	    @Autowired
	    HomeRepository hr;

		@Override
		public void saveData(Employee e) 
		{
			hr.save(e);	
		}

		@Override
		public Iterable<Employee> displayAll() 
		{
	        
			return hr.findAll();
		}

		@Override
		public void deleteData(Employee e)
		{
			hr.delete(e);
			
		}

		@Override
		public Employee getSingleData(int eId) 
		{
			
			return hr.findAllByeId(eId);
		}



		
		

}
