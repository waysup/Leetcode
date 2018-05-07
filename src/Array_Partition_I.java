
public class Array_Partition_I {

    public static void main(String[] args){


        Array_Partition_I partition= new Array_Partition_I();


        int[] nums = {1, 4, 3, 2};

        int ret_val;
        ret_val = partition.arrayPairSum(nums);
        System.out.println("return value: " + ret_val);

    }

//insertion sort exceeds time limit

    //course中的代码应该有bug（当lo之后的元素均比s[lo]小）
    //没有bug！！！
    private static int partition2(int[] s, int lo, int hi){
        //以lo为pivot，初始时i指向lo+1，j指向hi，i和j**交替从两侧向中间扫描**，终止条件是二者cross（即i>=j）
        int i = lo,
                j = hi+1;
        while(true){
            while (s[++i] < (s[lo]))//退出时，i位置处s[i]>=s[lo]
                //此处break是退出内部的循环，刚才理解出错，认为有bug！！！
                if (i == hi) break;
            while (s[--j] > s[lo])//退出时，j位置处s[j]<=s[lo]
                if (j == lo) break;
            if (i>=j) break;
            swap(s, i, j);
        }
        swap(s, lo, j);
        return j;
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void sort(int[] s, int lo, int hi) {
        if (hi - lo >= 1) {
            int r = partition2(s, lo, hi);
            sort(s, lo, r - 1);
            sort(s, r + 1, hi);
        }

    }

    public int arrayPairSum(int[] nums) {

        sort(nums, 0, nums.length - 1);

        int max_sum = 0;
        for (int i = 0; i < nums.length; i += 2)
            max_sum += nums[i];

        return max_sum;

    }
}


//    Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
//
//        Example 1:
//        Input: [1,4,3,2]
//
//        Output: 4
//        Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
//        Note:
//        n is a positive integer, which is in the range of [1, 10000].
//        All the integers in the array will be in the range of [-10000, 10000].