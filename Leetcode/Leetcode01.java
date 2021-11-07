import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chris
 * @title: Two Sum
 * @projectName LeetCode
 * @description: 给定一个数组和目标和，从数组中找两个数字相加等于目标和，输出这两个数字的下标
 * @date 2021/11/714:01
 * @summary
 * 1.数组的创建  int []ans = new int[2];
 * 2.数组的输出方法  Arrays.toString(ans)
 * 3.程序的优化非常重要
 */
public class Leetcode01 {
//1.双重for循环获取数组下标的值
    public static int[] twoSum01(int[]nums,int target){
        int []ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i+1); j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
//运用hash table进行空间换时间，提高程序执行效率
    public static int[] twoSum02(int[]nums,int target){
//        int []ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            int sub = target-nums[i];
            if (map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
    public static void main(String[] args) {
        int []arr1 = new int[]{2,7,11,15};
//        int[] ans = twoSum01(arr1,9);
        int[] ans = twoSum02(arr1,9);
        System.out.println(Arrays.toString(ans));
    }
}
