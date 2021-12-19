package myPackage.exam.recursion;

public class Task1 {

    public static void printNumberPyramid(int numberOfPyramidLevels){
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
        xMassTree(numberOfPyramidLevels);
        System.out.println();
        System.out.println("Odwrotnie, przy użyciu rekurekurencji");
        xMassTreeRecursion(numberOfPyramidLevels);

    }

    private static void xMassTreeRecursion(int numberOfPyramidLevels){
        if (numberOfPyramidLevels <= 1) {
            System.out.println("3");
        }
        else {
            for (int i = 0; i < numberOfPyramidLevels; i++) {
                System.out.print("3");
            }
            System.out.println();
            xMassTreeRecursion(numberOfPyramidLevels-1);
        }
    }

    private static void xMassTree(int numberOfPyramidLevels){
        String[] lista = new String[numberOfPyramidLevels];
        for (int i = 0; i < lista.length; i++) {
            if (i == 0) lista[i] = "3";
            else lista[i] = lista[i - 1] + "3";
        }

        for (String s : lista) {
            System.out.println(s);
        }
    }

}
