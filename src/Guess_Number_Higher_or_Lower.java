public class Guess_Number_Higher_or_Lower {

    public int guessNumber(int n) {
        int m = 1;
        int pick = 0;
        while (m <= n) {
            pick = m + (n-m) / 2;
            int result = guess(pick);
            if (result == 0)
                return pick;
            else if (result > 0) {
                m = pick + 1;
            }
            else
                n = pick - 1;
        }
//        should never go here
        return 0;
    }
    public int guess(int num){
        return 0;
    };
}
