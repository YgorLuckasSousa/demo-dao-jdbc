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
        int x;


        System.out.println("=== TEST 1: seller findById === ");
        System.out.print("What id you are select? ");
        x = sc.nextInt();
        Seller seller = sellerDao.findById(x);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment === ");
        System.out.print("What id you are select? ");
        x = sc.nextInt();
        Department dep = new Department(x, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for (Seller obj: list){
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 3: seller FindALL === ");
        list = sellerDao.findAll();
        for (Seller e: list){
            System.out.println(list);
        }

        System.out.println("\n=== TEST 4: seller insert === ");
        Seller newSeller = new Seller(null, "Afonso", "afonso@gmail.com", new Date(), 2790.0, new Department(3, null));
        sellerDao.insert(newSeller);
        System.out.println("Insercted! New Id: " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update === ");
        seller = sellerDao.findById(1);
        seller.setName("Lucky");
        sellerDao.update(seller);
        System.out.println("Update completed! ");

        System.out.println("\n=== TEST 6: seller Delete === ");
        System.out.print("What id you are select? ");
        x = sc.nextInt();
        sellerDao.deleteById(x);
        System.out.println("Success! Id has deleted");





    }
}
