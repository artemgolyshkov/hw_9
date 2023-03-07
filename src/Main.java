import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1 () {
        System.out.println("Задача 1-2");
            int[] arrOne = new int[3];
            arrOne [0] = 1;
            arrOne [1] = 2;
            arrOne [2] = 3;// Объявили первый массив
            String arrStrOne = Arrays.toString(arrOne);
            arrStrOne = arrStrOne.substring(1,arrStrOne.length()-1);
            System.out.println(arrStrOne);

            double[] arrTwo = {1.57, 7.654, 9.986}; // Объявили второй массив
             String arrStrTwo = Arrays.toString(arrTwo);
             arrStrTwo = arrStrTwo.substring(1,arrStrTwo.length()-1);
             System.out.println(arrStrTwo);

            int[] arrFree = {25,78,106}; // Объявили третий массив
              String arrStrFree = Arrays.toString(arrFree);
              arrStrFree = arrStrFree.substring(1,arrStrFree.length()-1);
              System.out.println(arrStrFree);




        }
    public static void task2 () {
        System.out.println("Задача 3");
        int [] arrOne = new int[3];
        arrOne [0] = 1;
        arrOne [1] = 2;
        arrOne [2] = 3;// Объявили первый массив
        for (int i = arrOne.length - 1; i >=0; i--){
            System.out.print(arrOne[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] arrTwo = {1.57, 7.654, 9.986}; // Объявили второй массив
        for (int q = arrTwo.length - 1; q >=0; q--){
            System.out.print(arrTwo[q]);
            if (q != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] arrFree = {25,78,106}; // Объявили третий массив
        for (int w = arrFree.length - 1; w >=0; w--) {
            System.out.print(arrFree[w]);
            if (w != 0){
                System.out.printf(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int [] arr4 = {1, 2, 3};

        for (int a = 0; a < arr4.length; a++){
            if (arr4[a] % 2 != 0 ) {
                arr4[a] += 1;
            }
        }
        System.out.println(Arrays.toString(arr4));
    }
    }
