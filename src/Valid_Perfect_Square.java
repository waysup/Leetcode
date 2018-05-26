public class Valid_Perfect_Square {


    public static void main(String[] args){

        Valid_Perfect_Square solver = new Valid_Perfect_Square();

        System.out.println(solver.isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num <= 1) return true;

        long left = 1;
        long right = num / 2 + 1;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
//    a square number is 1+3+5+7+... Time Complexity O(sqrt(N))
// (Credit to lizhibupt, thanks for correcting this).
//public boolean isPerfectSquare(int num) {
//    if (num < 1) return false;
//    for (int i = 1; num > 0; i += 2)
//        num -= i;
//    return num == 0;
//}
}