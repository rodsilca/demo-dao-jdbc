package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== teste 1: sellerFindById====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== teste 2: sellerFindByDepartmentId====");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("=== teste 3: sellerFindByAll====");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("=== teste 4: sellerInsert====");
        Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0,department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new Id: "+newSeller.getId());

        System.out.println("=== teste 5: sellerUpdate====");
        seller = sellerDao.findById(1);
        seller.setName("Martha");
        sellerDao.update(seller);
        System.out.println("Update completed!");

        System.out.println("=== teste 6: sellerDeleteById====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();

    }
}
