public class Dom implements Budynek {
    private double powierzchnia;
    private String adres;
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private KolorEnum kolor;

    @Override
    public double powierzchnia(double pow) {
        this.powierzchnia = pow;
        return this.powierzchnia;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return this.adres;
    }

    @Override
    public int liczbaOkien(int value) {
        this.liczbaOkien = value;
        return this.liczbaOkien;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }


    @Override
    public double sredniaLiczbaOkienNaMieszkanie(double pow, int liczbaOkien) {
        this.powierzchnia = pow;
        this.liczbaOkien = liczbaOkien;
        return pow/liczbaOkien;

    }

    @Override
    public String toString() {
        return "Dom:\n" +
                "Powierzchnia wynosi " + powierzchnia +
                "\nAdres: " + adres  +
                "\nLiczba okien wynosi " + liczbaOkien +
                "\nLiczba mieszkancow wynosi " + liczbaMieszkancow +
                "\nKolor to " + kolor;
    }

}