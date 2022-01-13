package myPackage.exam.colections;

import java.util.*;

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

    public static List<Car> getCarList(){ //TIP singleton
        return carList;
    }

    public static void printSortedCars() {
        Collections.sort(carList);
        for(Car car : carList){
            System.out.println(car);
        }
    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment){
        List<Car> carListFilter = new LinkedList<>();
        for (Car car : carList) {
            if(car.getValue() <= maxValue && Objects.equals(car.getLevelOfEquipment(), levelOfEquipment)){
                carListFilter.add(car);
            }
        }
        Collections.reverse(carListFilter);
        for (Car car : carListFilter) {
            System.out.println(car);
        }
    }

    public static void addCarsToList() {
        carList.add(auto12);
        carList.add(auto13);
        carList.add(auto14);
    }

    public static void removeCarFromList() {
        carList.remove(auto4);
        carList.remove(auto9);
    }

    public static void printCarListAfterSomeModification(){
        addCarsToList();
        removeCarFromList();
        for (Car car : carList) {
            System.out.println(car);
        }
    }

}
