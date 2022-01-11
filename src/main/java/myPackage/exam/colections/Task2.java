package myPackage.exam.colections;

import javax.management.ObjectInstance;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    static Car auto1 = new Car(true, 2021, 2, 180000);
    static Car auto2 = new Car(false, 2021, 3, 200000);
    static Car auto3 = new Car(false, 2021, 1, 160000);
    static Car auto4 = new Car(true, 2020, 3, 170000);
    static Car auto5 = new Car(false, 2020, 1, 110000);
    static Car auto6 = new Car(false, 2020, 2, 130000);
    static Car auto7 = new Car(true, 2019, 3, 115000);
    static Car auto8 = new Car(true, 2019, 3, 125000);
    static Car auto9 = new Car(false, 2019, 2, 100000);
    static Car auto10 = new Car(false, 2019, 1, 90000);
    static Car auto11 = new Car(false, 2021, 1, 120000);
    static Car auto12 = new Car(true, 2020, 2, 150000);
    static Car auto13 = new Car(false, 2018, 1, 70000);
    static Car auto14 = new Car(false, 2019, 1, 80000);

    private static List<Car> carList = new LinkedList<>(Arrays.asList(auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9, auto10, auto11));
    //todo ma być posortowana po roczniku, auta nowesze jako pierwsze a starsze później, i stale utzymywać porządek

    public static List<Car> getCarList(){ //TIP singleton
        //zwraca aktualny stan listy aut
        //todo
        return null;
    }

    public static void printSortedCars() {
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie DOBRYCH danych testowych jest cześcią zadania)
        //lista ma być posotrowana po atrybutach w następującej kolejności:
        //- auta ekskluzywne mają znajdować się na początku listy
        //- auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //- auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //- auta droższe mają być wyświetlane przed tańszymi
    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment){
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        // oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzację, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        //todo tutaj wykonaj zadanie
    }

    public static void addCarsToList() {
        //todo
    }

    public static void removeCarFromList() {
        //todo
    }

    public static void printCarListAfterSomeModification(){
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        // wyświetl listę
    }

}
