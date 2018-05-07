
public class jewels_and_stones {
    public static void main(String[] args){
        System.out.println("yes bitch!");


        Solution sol = new Solution();


        int jewel_count;
        String J, S;
        J = "aA"; S = "aAAbbbb";

        jewel_count = sol.numJewelsInStones(J, S);
        System.out.println(jewel_count);

        J = "z"; S = "ZZ";
        jewel_count = sol.numJewelsInStones(J, S);
        System.out.println(jewel_count);
    }
}

class Solution {
    public int numJewelsInStones(String J, String S) {

        int cnt = 0;
        for(char i: S.toCharArray()){
            if (J.indexOf(i) >= 0)
                cnt++;
        }
        return cnt;
    }
}

//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//
//Input: J = "z", S = "ZZ"
//Output: 0