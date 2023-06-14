package SortingAlgo;

// Bubble Sort
    // Compare two elements
        // if 0 is less good
        // if 1 is grater than 0 than move

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort
{
    public static void main(String st[]) {

        int[] unSorted = {4,7,5,1,8,9};

        bubbleSort(unSorted);
    }


static void bubbleSort(int[] unSorted) {
        for(int i=0 ; i< unSorted.length ;i++){
            for(int j=i+1 ; j< unSorted.length ; j ++){
                if(unSorted [j] < unSorted [i]){
                    int temp = unSorted [i];
                    unSorted[i] = unSorted[j];
                    unSorted[j] = temp;
                }
            }
        }

  //  IntStream.of(unSorted).forEach(e-> System.out.println(e));
    Arrays.stream(unSorted).forEach(e-> System.out.println(e));
}
}