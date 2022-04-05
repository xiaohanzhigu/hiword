
import com.chedu.houserent.utility.Utility;
import com.chedu.leetcode.Solution;
import com.chedu.tool.MyTools;

import java.util.*;

public class hello {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] nums = solution.intersection(nums1,nums2);
        System.out.println(Arrays.toString(nums));
    }

}
