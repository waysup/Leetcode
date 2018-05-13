import java.util.HashMap;

public class Distribute_Candies {


    public static void main(String[] args){

        int[] candies = {1,1,2,3};

        Distribute_Candies solver = new Distribute_Candies();
        System.out.println(solver.distributeCandies(candies));
    }



    public int distributeCandies(int[] candies) {
        boolean[] seenFlags = new boolean[200001];
        int typeCount = 0;
        for (int i: candies){
            int index = candies[i] + 100000;
            if (!seenFlags[index]){
                seenFlags[index] = true;
                typeCount++;
            }
            if (typeCount > candies.length / 2)
                return candies.length / 2;
        }
        return typeCount;
    }
}


//    Given an integer array with even length, where different numbers in this array represent different kinds of candies.
//  Each number means one candy of the corresponding kind.
//  You need to distribute these candies equally in number to brother and sister.
//  Return the maximum number of kinds of candies the sister could gain.
//        Example 1:
//        Input: candies = [1,1,2,2,3,3]
//        Output: 3