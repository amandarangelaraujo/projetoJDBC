package application;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Program {
    public static void main(String[] agrs){

        Department obj = new Department(1, "Books");
        System.out.println(obj);
        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(sellerDao);
    }


}
