package book_demo;

public class Book {
    String tittle;
    int pages;
    public Book(String tittle, int pages){
        this.tittle = tittle;
        this.pages = pages;
    }
    public void addPages(int extra){
        pages += extra;
    }
    public void printBook(){
        System.out.println("Tittle:" + tittle +"pages:"+pages);
    }
}
