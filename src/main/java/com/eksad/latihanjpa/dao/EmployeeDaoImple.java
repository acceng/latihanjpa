package com.eksad.latihanjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.eksad.latihanjpa.model.Employee;

@Repository
public class EmployeeDaoImple implements EmployeeDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Employee> getAll() {
		return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
		
	}

	@Override
	public Employee getById(Integer Id) {
		// TODO Auto-generated method stub
		return entityManager.find(Employee.class, Id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		entityManager.persist(employee);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		entityManager.merge(employee);
	}

	@Override
	public void delete(int id) {
		Employee employee = getById(id);
		entityManager.remove(employee);
	}

	@Override
	public List<Employee> getByName(String name) {
//		 return entityManager.createNativeQuery("SELECT * FROM employee WHERE name LIKE ?0", Employee.class)
//		.setParameter(0, "%" + name + "%").getResultList();
		
		return entityManager.createQuery("select e from Employee e where e.name like ?0", Employee.class)
				.setParameter(0, "%" + name + "%").getResultList();
	}
	
	
	
	

}
