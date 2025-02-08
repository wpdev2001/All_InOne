import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        int[] array = {12,23,34,45,56,67,70,80};
        //In order to do the binary search the elements must be sorted!!!
        int binarySearch = Arrays.binarySearch(array, 80);
        System.out.println(binarySearch);
         */

        int[] arr = {12,23,34,45,56,67,43,32,21,11};
        Arrays.sort(arr);

        for(int i : arr){
            System.out.println(i);
        }

        //Filling every element with 12
        Arrays.fill(arr,12);
        for(int i : arr){
            System.out.println(i);
        }

    }
}