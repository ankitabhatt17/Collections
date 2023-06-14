package Sliding.window;

public class FindMaxsumOfSubArray {
    public static void main(String st[]) {

        int[] unSorted = {4,7,5,1,8,9};

        findMaxSum(unSorted, 3);
        findMinSum(unSorted, 3);
    }

    static void findMaxSum(int[] array, int k){
        int sum = 0;
        for(int i=0 ; i<k ;i++) {
            sum = sum+array[i];
        }
      //  System.out.println(sum);

        int window_sum = sum;
        for(int i=k ; i<array.length ;i++) {
            window_sum += array[i] - array[i-k];
          sum =   Math.max(window_sum, sum);


        }
        System.out.println(sum);
    }
    static void findMinSum(int[] array, int k){
        int sum = 0;
        for(int i=0 ; i<k ;i++) {
            sum = sum+array[i];
        }
        //  System.out.println(sum);

        int window_sum = sum;
        for(int i=k ; i<array.length ;i++) {
            window_sum += array[i] - array[i-k];
            sum =   Math.min(window_sum, sum);


        }
        System.out.println(sum);
    }
}
