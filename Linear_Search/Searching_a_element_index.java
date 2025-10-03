package DSA.Linear_Search;

public class Searching_a_element_index {
    public static void main (String[] args) {
        int[] nums = {23, 45, 2, 5, 14};
        int target = 5;
        int ans = Linear_search (nums, target);
        System.out.println (ans);
    }
    static int Linear_search(int[] arr, int target){
        if (arr.length == 0) {
            return 1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
