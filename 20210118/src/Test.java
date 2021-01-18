import java.util.Arrays;

public class Test {

    /*
    * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
    给定 nums = [0,1,2,2,3,0,4,2], val = 2,
    函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
    * */
    public static int removeElement(int[] nums, int val){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            while(nums[left] != val && left < right){
                left++;
            }
            while(nums[right] == val && left < right){
                right--;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
        //return left;
        int ret = 0;
        while (ret < nums.length && nums[ret] != val){
            ret++;
        }
        return ret;
    }

    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
    // 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //你可以假设数组中无重复元素。
    //输入: [1,3,5,6], 7
    //输出: 4
    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
//        int[] a = {3,2,2,3};
        //System.out.println(removeElement(a,3));
        //System.out.println(Arrays.toString(a));
        System.out.println(searchInsert(a,7));
    }
}
