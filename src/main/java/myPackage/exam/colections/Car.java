package myPackage.exam.colections;

import java.util.UUID;

public class Car implements Comparable<Car> {
    //zmieniłem typy danych z prymitywnych, żeby bezproblemowo użyć ich w metodzie compareTo
    Boolean isExclusive; //true or false
    Integer yearOfProduction; // eg 2021, 2015 etc
    Integer levelOfEquipment; // 3 > 2 > 1, higher then better
    UUID id;
    Double value; // how much does it cost for client

    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.value = value;
        this.id = UUID.randomUUID(); //jakiś losowy "VIN" nadałem, powiedzmy, że tak oznaczamy "pojazdy" Gorga Jetsona
    }

    @Override
    public String toString() {
        return "Rok produkcji: " + yearOfProduction +
                ", Poziom wyposażenia: " + levelOfEquipment +
                ", Cena: " + value +
                ", VIN: " + id +
                ", Ekskluzywne: " +isExclusive;
    }

    public boolean isExclusive() {
        return isExclusive;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getLevelOfEquipment() {
        return levelOfEquipment;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public int compareTo(Car o) {
        int result = o.isExclusive.compareTo(this.isExclusive);
        if(result == 0) {
            result = o.getYearOfProduction().compareTo(this.getYearOfProduction());
            if(result == 0){
                result = o.getLevelOfEquipment().compareTo(this.getLevelOfEquipment());
                if(result == 0){
                    result = o.getValue().compareTo(this.getValue());
                }
            }
        }
        return result;
    }
//

}
