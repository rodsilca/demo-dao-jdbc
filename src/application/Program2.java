package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        System.out.println("=== teste 1: DepFindById====");
        Department dep = depDao.findById(2);
        System.out.println(dep);

        List<Department> list = new ArrayList<>();
        System.out.println("=== teste 3: depFindByAll====");
        list = depDao.findAll();
        list.forEach(System.out::println);

        System.out.println("=== teste 4: depInsert====");
        Department newDep = new Department(null,"Games");
        depDao.insert(newDep);
        System.out.println("Inserted! new Id: "+newDep.getId());

        System.out.println("=== teste 5: depUpdate====");
        dep = depDao.findById(1);
        dep.setName("Clothes");
        depDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("=== teste 6: depDeleteById====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();

    }
}
