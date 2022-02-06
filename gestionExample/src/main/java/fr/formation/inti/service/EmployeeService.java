package fr.formation.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.EmployeeDao;
import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	private IEmployeeDao dao;
	
	public EmployeeService() {
	}
	

	@Override
	public Integer save(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		dao.beginTransaction();
		List<Employee> list = dao.findAll();
		dao.commitTransaction();
		return list;
	}

}
