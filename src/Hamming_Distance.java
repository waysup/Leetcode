import java.util.BitSet;

public class Hamming_Distance {

    public static void main(String[] args){

        int  x = 1, y = 4;
        Hamming_Distance distance = new Hamming_Distance();

        int dis = distance.hammingDistance(x, y);

        System.out.println(dis);

    }

    public int hammingDistance(int x, int y) {

//        int xor = (~x & y) | (x & ~y);
        int xor = x ^ y;

        byte[] bytes = new byte[4];

        for (int i = 0; i < 4; i++){
            bytes[i]  = (byte)(xor >> 8 * i);
        }

        BitSet bs_xor = BitSet.valueOf(bytes);
        return bs_xor.cardinality();
    }
}


//    Given two integers x and y, calculate the Hamming distance.
//
//        Note:
//        0 ≤ x, y < 231.
//
//        Example:
//
//        Input: x = 1, y = 4
//
//        Output: 2
//
//        Explanation:
//        1   (0 0 0 1)
//        4   (0 1 0 0)
//        ↑   ↑
//
//        The above arrows point to positions where the corresponding bits are different.