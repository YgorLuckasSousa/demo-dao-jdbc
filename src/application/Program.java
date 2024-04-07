package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

import model.entities.Department;
import model.entities.Seller;


import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.print("What id you are select? ");
        int x = sc.nextInt();
        System.out.println("=== TEST 1: seller findById === ");
        Seller seller = sellerDao.findById(x);
        System.out.println(seller);
        System.out.println();
        Department dep = new Department(x, null);
        System.out.println("\n=== TEST 2: seller findByDepartment === ");
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj: list){
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 3: seller findAll === ");
        list = sellerDao.findAll();

        for (Seller obj: list){
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 4: seller insert === ");
        Seller newSeller = new Seller(null, "Jorge", "jorginho@gmail.com", new Date(), 2500.0, new Department(3, null));
        sellerDao.insert(newSeller);
        System.out.println("Insercted! New Id: " + newSeller.getId());
        System.out.println("\n=== TEST 5: seller update === ");
        seller = sellerDao.findById(1);
        seller.setName("João");
        sellerDao.update(seller);
        System.out.println("Update completed! ");





    }
}
