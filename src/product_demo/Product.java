package product_demo;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock){
        this.name = name;
        this.stock = stock;
    }
    public String getName(){
        return name;
    }

    public void buyOne(){
        if(stock > 0){
            stock--;
            System.out.println(name + " purchased and remaining stock is :"+stock);
        }else{
            System.out.println("Out of stock");
        }
    }
    public void printInfo(){
        System.out.println("Product:" + name + " Stock:" + stock);
    }
}
