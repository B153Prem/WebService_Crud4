package com.cjc.web.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.web.crud.main.model.Employee;
import com.cjc.web.crud.main.serviceimpl.HomeServiceImpl;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceImpl hsi;
	
	@PostMapping("/saveData")
	public String saveData(@RequestBody Employee e)
	{
		hsi.saveData(e);
		return "Save Data Successfully";
	}
	
	@GetMapping("/getAllData")
	public Iterable<Employee>getAllData()
	{
		  Iterable<Employee>elist=hsi.displayAll();
		  return elist;
	}
	
	@PutMapping("/updateData/{eId}")
	public String updateData(@PathVariable("eId")int eId,@RequestBody Employee e)
	{
		hsi.saveData(e);
		return "Update Data Successfully";	
	}
	
	@DeleteMapping("/deleteData/{eId}")
	public String deleteData(@PathVariable("eId")int eId,@RequestBody Employee e)
	{
		hsi.deleteData(e);
		return "delete Data Successfully";
	}
	
	@GetMapping("/getSingleData/{eId}")
    public Employee getSingleData(@PathVariable("eId")int eId)
    {
    	   Employee e=hsi.getSingleData(eId);
    	   return e;
    }


}
