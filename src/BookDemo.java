public class BookDemo {
    public static void main(String[] args){
        Book b1 = new Book("Programming",400);
        Book b2 = b1;
        b2.addPages(100);
        b1.printBook();
        b2.printBook();

        Book b3 = new Book("Programming",500);

        // == -> Referans karşılaştırır
        // equals() -> İçerik karşılaştırır
        System.out.println(b1 == b3);
        System.out.println(b1.tittle.equals(b3.tittle) && b1.pages == b3.pages);
    }
}
