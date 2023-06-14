package SortingAlgo.DACAlgo;

public class DivideAndConquer {

    public static void main(String st[]) {

        int[] unSorted = {4,7,5,1,8,9};

        divideAndConq(unSorted,0, unSorted.length-1);
    }

    static void divideAndConq(int[] unsorted, int low, int high) {

    if(low < high) {


        int mid = low+ (high - low)/2;

        divideAndConq(unsorted, low, mid);

        divideAndConq(unsorted, mid + 1, high);

        merge(unsorted, low, mid, high);
    }

    }

    static void merge(int[] unsorted, int low, int mid, int high) {
        System.out.println("low : "+ low +" mid: " + mid + "high: "+high);


    }

}
