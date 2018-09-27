package com.hyc.ssh.user.service;

import java.util.List;

import com.hyc.ssh.user.entity.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
