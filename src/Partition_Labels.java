import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

public class Partition_Labels {

    public static void main(String[] args){

        String S = "ababcbacadefegdehijhklij";
        Partition_Labels solver = new Partition_Labels();

        List<Integer> ret_list =
        solver.partitionLabels(S);
        System.out.println(ret_list);

    }


    public List<Integer> partitionLabels(String S) {
        if (S == null) return null;

        List<Integer> ret_list = new ArrayList<>();
        int LENGTH = S.length();
        int l = 0;
        int r = 0;
        while (r < LENGTH){
            for (int i = l; i <= r; i++){
//                or
//                for (int k = LENGTH - 1; k >= r; k--)
                    for (int k = LENGTH - 1; k > r; k--)
                    if (S.charAt(k) == S.charAt(i)) {
                        r = k;
                        break;//important
                    }
            }
            //r-l
            ret_list.add(r - l + 1);
            l = ++r;
        }
        return ret_list;

    }
}


//    A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
//
//        Example 1:
//        Input: S = "ababcbacadefegdehijhklij"
//        Output: [9,7,8]
//        Explanation:
//        The partition is "ababcbaca", "defegde", "hijhklij".
//        This is a partition so that each letter appears in at most one part.
//        A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
//        Note:
//
//        S will have length in range [1, 500].
//        S will consist of lowercase letters ('a' to 'z') only.