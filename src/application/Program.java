package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1,"Books");

        LocalDate date = LocalDate.parse("2000-01-25");
        Seller seller = new Seller(1,"Maria","maria@gmail.com", date,3000.0,obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
