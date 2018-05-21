import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection_of_Two_Arrays {

    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Intersection_of_Two_Arrays solver = new Intersection_of_Two_Arrays();

        int[] retNums = solver.intersection(nums1, nums2);
        System.out.println(retNums);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> commonIntSet = new HashSet<>(nums1.length + nums2.length);
        for (int i: nums1)
            commonIntSet.add(i);
        Set<Integer> commonIntSet2 = new HashSet<>();
        for (int j: nums2)
            if (commonIntSet.contains(j))
                commonIntSet2.add(j);
        int[] commonNums = new int[commonIntSet2.size()];
        int pos = 0;
        for (Integer aCommonIntSet2 : commonIntSet2) commonNums[pos++] = (int) aCommonIntSet2;
        return commonNums;
    }
}
