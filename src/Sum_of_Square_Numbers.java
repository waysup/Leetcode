public class Sum_of_Square_Numbers {


    public static void main(String[] args){

        int c = 3;
        Sum_of_Square_Numbers solver = new Sum_of_Square_Numbers();
        if (solver.judgeSquareSum(c))
            System.out.println("yes");
    }

    public boolean judgeSquareSum(int c) {
        if (c == 0) return true;

        int left = 0;
        int right = (int)Math.sqrt(c);
        while (left <= right){
            int result = left * left + right * right;
            if (result > c)
                right--;
            else if (result < c)
                left++;
            else
                return true;
        }
        return false;
    }
}
