public class Arac {
    private int hiz;
    private double yakit;

    public Arac(int hiz, double yakit){
        this.hiz = hiz;
        this.yakit = yakit;
    }
    public int getHiz(){
        return hiz;
    }
    public void setHiz(int hiz){
        this.hiz=hiz;
    }

    public double getYakit() {
        return yakit;
    }

    public void setYakit(double yakit) {
        this.yakit = yakit;
    }

    public void calistir(){
        System.out.println("Araç çalıştırıldı");

    }
    public void yakitTuket(int km, double tuketim){
        double tuketilen = km*tuketim;
        yakit -= tuketilen;
        if(yakit<0){
            yakit=0;
        }
        System.out.println(km + "km yol gidildi kalan yakıt : " + yakit);
    }

}
