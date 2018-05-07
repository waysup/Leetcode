

public class Judge_Route_Circle {

    enum MOVE_TYPE {UP, DOWN, LEFT, RIGHT}

    public static void main(String[] args){


        String moves = new String("LL");

        Judge_Route_Circle judge = new Judge_Route_Circle();
        boolean result = judge.judgeCircle(moves);
        if (result){
            System.out.println("yes");
        }
        else System.out.println("no!");

    }

    public boolean judgeCircle(String moves) {
        if (moves.length()%2 == 1)
            return false;

        int cnt[] = new int[2];
        cnt[0] = cnt[1] = 0;
        for (char i: moves.toCharArray()){
            switch (i){
                case 'U':
                    cnt[0] += 1;
                    break;
                case 'D':
                    cnt[0] -= 1;
                    break;
                case 'L':
                    cnt[1] += 1;
                    break;
                case 'R':
                    cnt[1] += -1;
                    break;
            }

        }
        // any condition: not a circle
        if (cnt[0] != 0 || cnt[1] != 0)
            return false;

        return true;

    }

}


//Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
//
//        The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
//
//        Example 1:
//        Input: "UD"
//        Output: true
//        Example 2:
//        Input: "LL"
//        Output: false