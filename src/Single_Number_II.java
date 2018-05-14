public class Single_Number_II {


    public static void main(String[] args){

        int[] testCase = {0,1,0,1,0,1,69, 0, 1, 2,2,2,2,2, 1, 0};
        Single_Number_II solver = new Single_Number_II();
        int retValue = solver.singleNumber(testCase);
        System.out.println(retValue);

    }

    public int singleNumber(int[] nums) {

        int retValue = 0;
        for (int i = 0; i < 32; i++){
            int sum = 0;
            for (int j = 0; j < nums.length; j++){
                sum += (nums[j] >> i) & 1;
            }
            if (sum % 5 == 1)
                retValue += (1<<i);
        }
        return retValue;
    }
}
