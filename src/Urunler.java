public class Urunler implements IGirisCikis {
    /**
     * Model Sayfası
     */
    private String mobilya;
    private String elektronik;
    private String giyim;
    private String arac;
    private String market;

    //set metodları

    public void setMobilya(String mobilya) {
        this.mobilya = mobilya;
    }

    public void setElektronik(String elektronik) {
        this.elektronik = elektronik;
    }

    public void setGiyim(String giyim) {
        this.giyim = giyim;
    }

    public void setArac(String arac) {
        this.arac = arac;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    // get metodları

    public String getMobilya() {
        return mobilya;
    }

    public String getElektronik() {
        return elektronik;
    }

    public String getGiyim() {
        return giyim;
    }

    public String getArac() {
        return arac;
    }

    public String getMarket() {
        return market;
    }

    @Override
    public void giris() {
        System.out.println("Ürünler sayfasına giriş yapıldı.");
    }

    // 1. Sayfa Overload1
    public String giris(String random){
        System.out.println("Ürünler sayfasına giriş yapıldı.");
        System.out.println("Ürünler sayfası Overload giriş çalıştı");
        return random;
    }

    @Override
    public void cikis() {
        System.out.println("Ürünler sayfasından çıkış yapıldı.");
    }

    // 1. Sayfa Overload2
    public String cikis(String random){
        System.out.println("Ürünler sayfasından çıkış yapıldı.");
        System.out.println("Ürünler sayfası Overload çıkış çalıştı");
        return random;
    }
}
