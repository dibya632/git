package com.employee.dao;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;
import com.employee.entity.EmployeeEntity;

public interface EmployeeDao {
	public abstract ArrayList<EmployeeEntity>getAllEntity();
	
}
