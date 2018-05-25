import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {

    public static void main(String[] args){

        int[] nums = {4,3,2,7,8,2,3,1};

        Find_All_Numbers_Disappeared_in_an_Array solver = new Find_All_Numbers_Disappeared_in_an_Array();

        List<Integer> retList = solver.findDisappearedNumbers(nums);
        System.out.println(retList);
    }


    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> retList = new ArrayList<>();

        int length = nums.length;

        for (int i = 0; i < nums.length; i++){
            int compleIndex = length - Math.abs(nums[i]);
            if (nums[compleIndex] > 0)
                nums[compleIndex] = -nums[compleIndex];
        }
        //scan once more to fill retList
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0)
                retList.add(length - i);
        }
        return retList;
    }
}
