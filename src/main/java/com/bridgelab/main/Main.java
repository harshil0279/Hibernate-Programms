package com.bridgelab.main;

import com.bridgelab.dao.EmployeeDAO;

public class Main {

	public static void main(String[] args) {
		Main start = new Main();
		EmployeeDAO.createFactory();
		start.list();
	}

	/*void add(){
		EmployeeDAO dao = new EmployeeDAO();
		dao.addEmployee("Nilesh", "Karle", 10000);
	}*/
	
	void list(){
		EmployeeDAO dao = new EmployeeDAO();
		dao.listAllEmployee();
	}
	/*
	void update(){
		EmployeeDAO dao = new EmployeeDAO();
		dao.updateEmployee(4, 20000);
	}
	
	void delete(){
		EmployeeDAO dao = new EmployeeDAO();
		dao.deleteEmployee(1);
	}*/
}