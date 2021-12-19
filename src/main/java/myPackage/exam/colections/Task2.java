package myPackage.exam.colections;

import java.util.*;

public class Task2 {
    //przynajmniej 10 elementów, pokrywająca większość przypadków i umożliwiająca po wyświetlonych danych ocenić działanie programu
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

    private static final List<Car> carList = new LinkedList<>(Arrays.asList(auto1, auto2, auto3, auto4, auto5, auto6, auto7, auto8, auto9, auto10, auto11));

    private static void getCarList(){ //TIP singleton
        System.out.println("Początkowa lista aut bez sortowania: ");
        printCarListAfterSomeModification(carList);
        printSortedCars();
    }

    private static void printSortedCars() {
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie DOBRYCH danych testowych jest cześcią zadania)
        //lista ma być posotrowana po atrybutach w następującej kolejności:
        //- auta ekskluzywne mają znajdować się na początku listy
        //- auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //- auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //- auta droższe mają być wyświetlane przed tańszymi
        Collections.sort(carList);
        System.out.println();
        System.out.println("Auta po sortowaniu");
        printCarListAfterSomeModification(carList);
        System.out.println("Pozycji na liście: " + carList.size());
    }
    //auta spełniające kryteria są przekazywane do nowej listy.
    //lista jest sortowata odwrotnie i przekazana do metody wyświetlającej
    public static void printCarsToValueAndLevelOfEquipment(Double maxValue, Integer levelOfEquipment){
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        // oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzację, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        //todo tutaj wykonaj zadanie
        getCarList();
        List<Car> carListFilter = new LinkedList<>();
        for (Car car : carList) {
            if(car.getValue() <= maxValue && Objects.equals(car.getLevelOfEquipment(), levelOfEquipment)){
                carListFilter.add(car);
            }
        }
        Collections.reverse(carListFilter);// w printSortedCars() ostatnie kryterium to sortowanie po cenie majęco dlatego użyłem jego odwrotności.
        System.out.println();
        System.out.println("Przefiltrowana lista wg wartości max: " + maxValue + " i poziomie wyposażenia: " + levelOfEquipment);
        printCarListAfterSomeModification(carListFilter);
    }

    public static void addCarsToList() {
        //todo
        getCarList();
        carList.add(auto12);
        carList.add(auto13);
        carList.add(auto14);
        System.out.println();
        System.out.println("Dodałem auta");
        printCarListAfterSomeModification(carList);
        printSortedCars();
    }

    public static void removeCarFromList() {
        //todo
        getCarList();
        carList.remove(auto4);
        carList.remove(auto9);
        System.out.println();
        System.out.println("Usunąłęm 2 auta z listy");
        printCarListAfterSomeModification(carList);
    }
    //dodałem wymagany parametr, dlatego, że przekazywana jest inna lista po filtrowaniu
    private static void printCarListAfterSomeModification(List<Car> lista){
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        // wyświetl listę
        for (Car car : lista) {
            System.out.println(car);
        }
    }

}
