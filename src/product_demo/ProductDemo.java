package product_demo;

import java.util.Scanner;
public class ProductDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many  product exist");
        int amount = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[amount];

        for(int n=0 ; n < amount ; n++){
            System.out.println("products name:");
            String name = sc.nextLine();

            System.out.println("remaining stock:");
            int stock = sc.nextInt();
            sc.nextLine();
            products[n] = new Product(name, stock);
        }
        while(true){
            System.out.println("write Q to exit");
            System.out.println("the product you want to buy");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("Q")){
                break;
            }
            boolean found = false;
            for(Product p : products){
                if(p.getName().equalsIgnoreCase(input)){
                    p.buyOne();
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("product is not exist");
            }
        }
            System.out.println("\n--- products info");
            for (Product p : products) {
                p.printInfo();
        }

    }
}
