public class Otomobil extends Arac {

    private final double tuketim = 0.07;

    public Otomobil(int hiz, double yakit) {
        super(hiz, yakit);
    }

    public void calistir() {
        System.out.println("otomobil çalıştırıldı");
    }

    public void durdur() {
        System.out.println("otomobil durduruldu");
    }

    public void yakitTuket(int km) {
        double kalan = getYakit() - km * tuketim;
        if (kalan < 0) kalan = 0;
        setYakit(kalan);
        System.out.println(km + " km yol gidildi, kalan yakıt: " + getYakit());
    }

}
