package vehicle_oop;


public class Motosiklet extends Arac {
    private final double tuketim = 0.05;

    public Motosiklet(int hiz, double yakit) {
        super(hiz, yakit);
    }


    public void calistir() {
        System.out.println("Motosiklet çalıştırıldı!");
    }


    public void durdur() {
        System.out.println("Motosiklet durdu!");
    }
    public void yakitTuket(int km) {
        double kalan = getYakit() - km * tuketim;
        if (kalan < 0) kalan = 0;
        setYakit(kalan);
        System.out.println(km + " km yol gidildi, kalan yakıt: " + getYakit());
    }
}
