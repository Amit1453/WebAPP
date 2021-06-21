package dao;

import entity.EmployeeEntity;

public interface Employeeinterface 
{
	public EmployeeEntity authenticate(String emailId, String password);
}
