public class Construct_the_Rectangle {

    public static void main(String[] args) {

        Construct_the_Rectangle solver = new Construct_the_Rectangle();
        int[] result = solver.constructRectangle(1);
        int[] result2 = solver.constructRectangle(25);
        int[] result3 = solver.constructRectangle(3);
        int[] result4 = solver.constructRectangle(24);
        return;
    }


    public int[] constructRectangle(int area) {

        int[] retTuple = new int[2];
        int sqrtBase = (int) Math.sqrt(area);

        while (area % sqrtBase != 0) {
            sqrtBase--;
        }
        retTuple[0] = area / sqrtBase;
        retTuple[1] = sqrtBase;
        return retTuple;
    }
}
