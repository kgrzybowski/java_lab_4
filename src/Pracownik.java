public class Pracownik implements PracownikI{

    private String firma;

    public void setFirma(String value) {
        this.firma = value;
    }

    @Override
    public String imie() {
        return "Jakub";
    }

    @Override
    public String nazwisko() {
        return "Wojewódzki";
    }

    @Override
    public String idzDoPracy() {
        return "Idę do pracy";
    }

    @Override
    public String pracuj() {
        return "Pracuję";
    }

    @Override
    public String wyjdzZPracy() {
        return "Wychodzę z pracy";
    }
}
