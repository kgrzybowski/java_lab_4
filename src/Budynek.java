public interface Budynek {
    double powierzchnia(double pow);

    String adresBudynku(String adres);

    int liczbaOkien(int value);

    void liczbaMieszkancow(int value);

    void kolorDomu(KolorEnum kolor);

    double sredniaLiczbaOkienNaMieszkanie(double pow, int liczbaOkien);
}

enum KolorEnum {
    BIALY, CZARNY, NIEBIESKI, CZERWONY
}