package myPackage;

import myPackage.dataStructure.SetStuff;
import myPackage.exam.colections.Task2;
import myPackage.exercise.Employee;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Task2.addCarsToList();
        System.out.println("DODANE");
        System.out.println();
        Task2.removeCarFromList();
        System.out.println("SKASOWANE");
        System.out.println();
        Task2.printCarsToValueAndLevelOfEquipment(190000.0, 1);


//        SetStuff.setMethod();
//
//        Employee grazyna = new Employee("Grażyna",45,0,20);
//        Employee jan = new Employee("Jan",45,0,18);
//        Employee maria = new Employee("Maria",51,1,27);
//        Employee maria2 = new Employee("Maria",24,1,3);
//        Employee zbyszek = new Employee("Zbigniew",42,0,18);
//        Employee felicja = new Employee("Felicja",60,1,37);
//        Employee adam = new Employee("Adam",30,0,3);
//        Employee adam2 = new Employee("Adam",49,0,18);
//        Employee ola = new Employee("Aleksandra",28,1,4);
//
//        List<Employee> employeeList = new LinkedList<>(Arrays.asList(jan, maria2,zbyszek,felicja,adam,ola, maria, adam2));

//        for (Employee emp: employeeList){
//            System.out.println(emp);
//        }


    }//koniec metody głównej "main", to co poza nią nie zostanie wykonane chyba, że zostanie wywołane z wnętrza metody "main"


}//koniec klasy "Application", java to język obiektowy, cały kod musi być w obrębie klasy, więc poza tymi nawiasami nie piszemy
