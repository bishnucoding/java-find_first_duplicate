import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1,55,55};

        Map<Integer,Boolean> map =  new HashMap<Integer,Boolean>();

        for(int i : arr){
            map.put(i,true);
        }

        System.out.println(map.keySet());
    
    }
}

//Time Complexity: O(n). Because we are looping the input array only once.
//Space Complexity: O(n). Because we are using additional map, which can contain at max all the elements from input array.


