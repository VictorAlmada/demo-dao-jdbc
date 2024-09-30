package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("### TESTE Nº 1 : TESTE DEPARTMENT findById ###");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n### TESTE Nº 2 : TESTE DEPARTMENT findAll ###");
		List<Department> depList = departmentDao.findAll();
		depList.stream().forEach(System.out::println);
		
		System.out.println("\n### TESTE Nº 3 : TESTE DEPARTMENT insert ###");
		// Department newDep = new Department(null, "Games");
		// departmentDao.insert(newDep); // comentei pra não ficar adicionando toda hora
		// System.out.println("Inserted! New ID: " + newDep.getId());
		
		System.out.println("\n### TESTE Nº 4 : TESTE DEPARTMENT update ###");
		department = departmentDao.findById(10);
		department.setName("Home");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n### TESTE Nº 5 : TESTE DEPARTMENT delete ###");
		System.out.print("Enter ID to remove from department: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
				
		sc.close();
		
	}

}
