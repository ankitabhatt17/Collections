public class BinarySearch {
    public static void main(String st[]){
        int[] array = {1,3,5,8,12};
        System.out.println(binarySearch(array, 0));

        System.out.println(binarySearchWithRecursion(array, 65, 0, array.length-1));
    }

    static boolean binarySearch(int[] array, int val){
        boolean isValueFound = false;
        int min =0 ;
        int max = array.length-1;
        int mid =0;

        while(min<=max){
            mid=min+max /2;
            if(val == array[mid]) {
                isValueFound = true;
                return isValueFound;
            }
            if(val < array[min]){
                max = mid  - 1;
            } else {
                min = mid + 1;
            }
        }

        return isValueFound;
    }

    static boolean binarySearchWithRecursion(int[] array, int val, int min, int max){
        boolean isValueFound = false;

        int mid =0;

       // while
        if(min<=max){
            mid=min+(max-min) /2;
           // System.out.println(mid);
            if(val == array[mid]) {
                isValueFound = true;
                return isValueFound;
            }
            if(val < array[min]){
                max = mid  - 1;
                binarySearchWithRecursion(array, val, min, max);
            } else {
                min = mid + 1;
                binarySearchWithRecursion(array, val, min, max);
            }
        }

        return isValueFound;
    }

}
