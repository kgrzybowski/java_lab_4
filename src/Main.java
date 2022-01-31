public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Prostokat prostakat1 = new Prostokat(10,5);
        Kwadrat kwadrat1 = new Kwadrat(6);

        System.out.println("Pole prostokątu wynosi " + prostakat1.pole());
        System.out.println("Obwód prostokątu wynosi " + prostakat1.obwod());
        System.out.println("Pole kwadratu wynosi " + kwadrat1.pole());
        System.out.println("Obwód kwadratu wynosi " +kwadrat1.obwod());
    }
}
