package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // INSERT
        Product p1 = new Product("Laptop","Gaming Laptop",75000,10);
        Product p2 = new Product("Mobile","Android Phone",20000,25);

        dao.addProduct(p1);
        dao.addProduct(p2);

        // RETRIEVE
        Product product = dao.getProduct(1);
        if(product != null) {
            System.out.println(product.getName()+" "+product.getPrice());
        } else {
            System.out.println("Product with id=1 not found");
        }

        // UPDATE
        dao.updateProduct(1,70000,8);

        // DELETE
        dao.deleteProduct(2);

        System.out.println("CRUD operations completed");
    }
}
