import java.util.Arrays;

public class ArrayMethods {
    public static void main(String st[]){
        // Ways to declare array
        int[] a = new int[5];
        int[] a1 = new int[]{1,2,3,4,5};

        // Array methods
        //size
        System.out.println("Size:" + a.length);

        // Print elements of array
        // java8
        Arrays.stream(a1).forEach(e -> System.out.println(e));
    }
}
