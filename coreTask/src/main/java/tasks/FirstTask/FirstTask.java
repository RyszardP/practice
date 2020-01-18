package tasks.FirstTask;

import java.io.IOException;
import java.util.Scanner;


public class FirstTask {
    public static void main(String[] args) throws IOException {

        // array is filling from keyboard


        Scanner input = new Scanner(System.in);
        System.out.println("please, insert 10 numbers");
        int mainArray[] = new int[10];
        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = input.nextInt();
        }

        divArray(mainArray);
    }

        public static int[] divArray ( int[] array){

            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 3 == 0) && array[i] % 2 == 0) {
                    System.out.println(array[i] + " two " + "three");
                } else if (array[i] % 3 == 0) {
                    System.out.println(array[i] + " three");
                } else if (array[i] % 2 == 0) {
                    System.out.println(array[i] + " two");
                }
            }
            return array;
        }

        public static void print ( int[] array){
            for (int i = 0; i < array.length; i++)
                System.out.print(array[i] + "  ");
            System.out.print("\n");

        }
    }

