package com.eksad.latihanjpa.dao;

import java.util.List;

import com.eksad.latihanjpa.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAll();
	
	public Employee getById (Integer Id);
	
	public void save(Employee employee);
	
	public void update (Employee employee);
	
	public void delete (int id);
	
	public List<Employee> getByName(String name);
	

}
