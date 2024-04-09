package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById === ");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: seller findAll === ");
        List<Department> list = departmentDao.findAll();

        for (Department e: list){
            System.out.println(e);
        }

        System.out.println("\n=== TEST 3: seller insert === ");
        Department newDep = new Department(8, "Car");
        departmentDao.insert(newDep);
        System.out.println("Success! New Department Insert ");

        System.out.println("\n=== TEST 4: seller update === ");
        Department department = departmentDao.findById(2);
        department.setName("Tablet");
        departmentDao.update(department);
        System.out.println("Success! Updated");

        System.out.println("\n=== TEST 5: seller Delete === ");
        departmentDao.deleteById(7);
        System.out.println("Success, Id has deleted");
    }
}
