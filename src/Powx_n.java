public class Powx_n {


    public static void main(String[] args){


        Powx_n solver = new Powx_n();

        System.out.println(solver.myPow(2.00000, -2));
    }

    public double myPow(double x, int n) {
        if(n == Integer.MIN_VALUE) return 1/(x * myPow(x, -(n+1)));
        if (n < 0) return 1 / myPow(x, -n);
        if(n == 1) return x;
        if (n == 0) return 1;
        //x>1
        if(n % 2 == 0)
            return myPow(x * x, n / 2);
        else
            return x * myPow(x * x, n / 2);
    }
}
