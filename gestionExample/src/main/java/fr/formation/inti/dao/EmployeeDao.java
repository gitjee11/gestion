package fr.formation.inti.dao;

import org.springframework.stereotype.Repository;

import fr.formation.inti.entity.Employee;

@Repository
public class EmployeeDao extends GenericDaoHibernate<Employee, Integer> implements IEmployeeDao {

	public EmployeeDao() {
		System.out.println("-------------EmployeeDao");
	}
}
