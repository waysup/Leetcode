import com.sun.jndi.cosnaming.CNCtx;

public class Container_With_Most_Water {


    public static void main(String[] args){
        Container_With_Most_Water testCase = new Container_With_Most_Water();

        int[] arr = {1,2,3,1,1,1,1};
        System.out.println(testCase.maxArea(arr));
    }

    public int maxArea(int[] height) {
            int maxarea = 0, l = 0, r = height.length - 1;
            while (l < r) {
                maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] < height[r])
                    l++;
                else r--;
            }
            return maxarea;

    }
}
