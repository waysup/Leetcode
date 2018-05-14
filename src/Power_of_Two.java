public class Power_of_Two {


    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int start = 1;
        for(int i = 0; i < 31; i++){
            if(start << i == n)
                return true;
        }
        return false;
    }
}
