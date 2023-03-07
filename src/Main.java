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
            System.out.printf(arrOne[i] + ", ");
        }
            System.out.println();

        double[] arrTwo = {1.57, 7.654, 9.986}; // Объявили второй массив
        for (int q = arrTwo.length - 1; q >=0; q--){
            System.out.printf(arrTwo[q] + ", ");
        }
            System.out.println();

        int[] arrFree = {25,78,106}; // Объявили третий массив
        for (int w = arrFree.length - 1; w >=0; w--) {
            System.out.printf(arrFree[w] + ", ");
        }
        System.out.println();
        System.out.println("Задача 4");
        int [] arr4 = new int[3];
        arr4 [0] = 1;
        arr4 [1] = 2;
        arr4 [2] = 3;
        if (arr4 [0] % 2 == 0) {
            System.out.println(arr4[0]);
           } else {
            arr4[0] = arr4[0] + 1;
        }
        if ((arr4 [1] % 2) == 0) {
        } else {
                arr4[1] = arr4[1] + 1;
            }
        if ((arr4 [2] % 2) == 0) {
        } else {
            arr4[2] = arr4[2] + 1;
        }
        for (int a = 0; a < 3; a++){
            System.out.printf(arr4[a] + ", ");
        }
    }
    }
