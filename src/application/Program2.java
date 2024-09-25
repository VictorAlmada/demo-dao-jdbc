package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("### TESTE Nº 1 : TESTE DEPARTMENT findById ###");
		Department department = departmentDao.findById(2);
		System.out.println(department);
	}

}
