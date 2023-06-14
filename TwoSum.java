import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Create a map
// map will store value like diff, i

public class TwoSum {
    public static void main(String st[]){
        int[] array = {2,7,11,15};
        int[] array1 = twoSum(array, 9);
        Arrays.stream(array1).forEach(x ->System.out.println(x));
    }

    static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();

        for(int i=0 ;i<nums.length ;i++){
            int diff = target - nums[i];
            if(map.containsKey(nums[i]))
            {
                return new int[] {i, map.get(nums[i])};
            } else {
                map.put(diff, i);
            }

        }

        return new int[2];
    }
}
