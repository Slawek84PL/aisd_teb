package myPackage.exam.recursion;

public class Task1 {
    private static String elementOfPyramid;

    public static void printReversNumberPyramid(int numberOfPyramidLevels){
        //Wypisz na konsolę, piramidę, wypisywać będziemy cyfrę 3 w formie string lub int, tj w pierwszej lini jedna cyfra 3, w drugiej lini dwie trójki, w trzeciej lini 3 cyfry itd
        //przykład wypisań na konsoli
        //3
        //33
        //333
        //3333
        //itd
        //Aż do liczby wierszy (poziomów piramidy), podanej jako parametr do funkcji przykład, printPyramid(int lvlNumber) {...}
        //TIP podziel problem na mniejsze części, rezultatem nie musi być jedna funkcja, ale funkcjonalność, tj jak wywołam jedną funkcję to wyświetli mi się piramida,
        //Uwaga, piramida może być wypisana jako "odwrócona" na konsolę tj dla numberOfPyramidLevels=3 ->
        //333
        //33
        //3

        //todo tutaj wykonaj zadanie
        if(elementOfPyramid == null) elementOfPyramid = String.valueOf(numberOfPyramidLevels);

        if (numberOfPyramidLevels <= 1) {
            buildPyramidLevel(numberOfPyramidLevels);
        }else {
            buildPyramidLevel(numberOfPyramidLevels);
            printReversNumberPyramid(numberOfPyramidLevels -1);
        }
        elementOfPyramid = null;
    }

    public static void printNumberPyramid(int numberOfPyramidLevels){
        if(elementOfPyramid == null) {
            elementOfPyramid = String.valueOf(numberOfPyramidLevels);
            numberOfPyramidLevels = 1;
        }

        if(numberOfPyramidLevels >= Integer.parseInt(elementOfPyramid)){
            buildPyramidLevel(numberOfPyramidLevels);
        }else {
            buildPyramidLevel(numberOfPyramidLevels);
            printNumberPyramid(numberOfPyramidLevels + 1);
        }
        elementOfPyramid = null;
    }

    private static void buildPyramidLevel(int numberOfPyramidLevels){
        if (numberOfPyramidLevels <= 1) {
            System.out.println(elementOfPyramid);
        }else {
            System.out.print(elementOfPyramid);
            buildPyramidLevel(numberOfPyramidLevels -1);
        }
    }
}

