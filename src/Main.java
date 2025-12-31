public class Main{
    public static void main(String[] args){

    Otomobil otomobil = new Otomobil(120,50);
    Motosiklet motosiklet = new Motosiklet(100, 30);
    otomobil.calistir();
    motosiklet.calistir();

    otomobil.yakitTuket(150);
    motosiklet.yakitTuket(100);

    otomobil.durdur();
    motosiklet.durdur();

    }
}