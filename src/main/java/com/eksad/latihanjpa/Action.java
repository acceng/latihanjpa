package com.eksad.latihanjpa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eksad.latihanjpa.dao.EmployeeDao;
import com.eksad.latihanjpa.model.Employee;

@Configuration
public class Action {

	@Autowired
	EmployeeDao employeedao;
	
/*
	@Bean
	
	public List<Employee> getAll(){
		
		List<Employee> employees = employeedao.getAll();
		
		for (Employee employee : employees) {
			
			System.out.println("ID : " + employee.getId());
			System.out.println("NAMA : " + employee.getName());
			System.out.println("ADDRESS : " + employee.getAddress());
			System.out.println("DOB : " + employee.getDob());
			System.out.println("========================================");
		
		}

		return employees; 	
	}
*/
	@Bean
	public Employee getById() {
		Employee employee = employeedao.getById(8);
		/*
		System.out.println(" GET BY ID");
		System.out.println("ID : " + employee.getId());
		System.out.println("NAMA : " + employee.getName());
		System.out.println("ADDRESS : " + employee.getAddress());
		System.out.println("DOB : " + employee.getDob());
		System.out.println("========================================");
		*/
		return employee;
			
	}
	/*
	@Bean
	public boolean save() {
		try {
			Employee employee = new Employee();
			employee.setName("supriono");
			employee.setAddress("sleman");
			
			String dateString = "1900-09-09";
			
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
			employee.setDob(date);
			
			employeedao.save(employee);
			System.out.println("DATA BERHASIL DISIMPAN");
			return true;
			
		} catch (Exception e) {
			System.out.println("DATA GAGAL DISIMPAN");
			e.printStackTrace();
			return false;
		}
	}*/

/*
	@Bean
	public boolean update() {
		try {
			Employee employee = new Employee();
			employee.setId(8);
			employee.setName("besmen");
			employee.setAddress("mojokerto");
			
			String dateString = "1990-09-09";
			
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
			employee.setDob(date);
			
			employeedao.update(employee);
			System.out.println("DATA BERHASIL DISIMPAN");
			return true;
			
		} catch (Exception e) {
			System.out.println("DATA GAGAL DISIMPAN");
			e.printStackTrace();
			return false;
		}
	}
*/

/*
	@Transactional
	@Bean
	public boolean delete() {
		try {
			employeedao.delete(11);
			System.out.println("Data berhasil dihapus");
			return true;
		} catch (Exception e) {
			System.out.println("Data gagal dihapus");
			e.printStackTrace();
			return false;
		}
		
	}
*/
	
	@Bean
	public List<Employee> getByName(){
		List<Employee> employees = employeedao.getByName("supriono");
		for (Employee employee : employees) {
			
			System.out.println("ID : " + employee.getId());
			System.out.println("NAMA : " + employee.getName());
			System.out.println("ADDRESS : " + employee.getAddress());
			System.out.println("DOB : " + employee.getDob());
			System.out.println("========================================");
		
		}

		return employees; 	
	}
}

