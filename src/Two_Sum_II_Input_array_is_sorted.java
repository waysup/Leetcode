public class Two_Sum_II_Input_array_is_sorted {


    public static void main(String[] args){

        Two_Sum_II_Input_array_is_sorted solver = new Two_Sum_II_Input_array_is_sorted();

        int[] numbers = new int[]{2,7};
        int[] result = solver.twoSum(numbers, 9);

        System.out.println(result);
    }

    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++){
            int r;
            if ( (r = binarySearch(numbers, target - numbers[i], i + 1, numbers.length - 1)) != -1)
                return new int[]{i + 1, r + 1};
        }
        return null;
    }

    public int binarySearch(int[] numbers, int target, int p, int q){
        if (p > q)
            return -1;

        int mid = (p + q) / 2;
        if (numbers[mid] == target)
            return mid;
        else if (numbers[mid] > target)
            return binarySearch(numbers, target, p, mid - 1);
        return binarySearch(numbers, target, mid + 1, q);
    }
}
