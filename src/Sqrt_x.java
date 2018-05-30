public class Sqrt_x {


    public static void main(String[] args){

        Sqrt_x solver = new Sqrt_x();

        int num = 1;
        int root_num = solver.mySqrt(num);

        System.out.println(root_num);
    }

    public int mySqrt(int x) {

        if (x == 0) return 0;

        int left = 1;
        int right = Integer.MAX_VALUE;

        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid)
                right = mid - 1;
            else {
                if (mid + 1 > x / (mid + 1))
                    return mid;
                else left = mid + 1;
            }
        }
    }
//    slow!
//    public int mySqrt(int x) {
//
//        int i = 0;
//        while (x > 0){
//            x -= 2 * i + 1;
//            i++;
//        }
//        return x == 0 ? i : i - 1;
//    }
}
