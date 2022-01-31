public class Student implements StudentI{

    private String indeks;

    public void setIndeks(String value) {
        this.indeks = value;
    }

    @Override
    public String imie() {
        return "Karol";
    }

    @Override
    public String nazwisko() {
        return "Grzybowski";
    }

    @Override
    public String napiszKolokwium() {
        return "Piszę Kolokwium";
    }

    @Override
    public String uczSie() {
        return "Uczę się";
    }

    @Override
    public String idzNaPiwo() {
        return "Idę na piwo";
    }
}
