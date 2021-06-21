package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.EmployeeEntity;

public class EmployeeDaoImp implements Employeeinterface
{
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	@Override
	public EmployeeEntity authenticate(String emailId, String password) 
	{
		EmployeeEntity employeeEntity = null;
		
		
		String sql="Select * from employee where emailId = ? and password = ? ";
		Object [] data= {emailId, password};
		try 
		{
			employeeEntity = jdbcTemplate.queryForObject(sql,data, new BeanPropertyRowMapper<>(EmployeeEntity.class));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return employeeEntity;
	}
}
