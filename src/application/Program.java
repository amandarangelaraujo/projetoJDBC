package application;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Program {
    public static void main(String[] agrs){

        //problema com conexão em banco de dados, pegar a dburl.
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }


}
