public class Complex_Number_Multiplication {


    public static void main(String[] args){
        String StringA = "1+-1i";
        String StringB = "1+-1i";
        Complex_Number_Multiplication solver = new Complex_Number_Multiplication();
        String ret = solver.complexNumberMultiply(StringA, StringB);
        System.out.println(ret);
    }

    public String complexNumberMultiply(String a, String b) {
//        (-)[num]+(-)[num]i
        String[] partsA = a.split("[+|i]");
        Complex compA = new Complex(Integer.valueOf(partsA[0]), Integer.valueOf(partsA[1]));
        String[] partsB = b.split("[+|i]");
        Complex compB = new Complex(Integer.valueOf(partsB[0]), Integer.valueOf(partsB[1]));

        Complex result = compA.multiply(compB);
        return result.toString();
    }
}
class Complex{
    private int real, img;
    Complex(){

    }
    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }
    public Complex multiply(Complex other){
        Complex product = new Complex();
        product.real = this.real * other.real - this.img * other.img;
        product.img = this.real * other.img + this.img * other.real;
        return product;
    }
    public String toString(){
        return this.real + "+" + this.img + "i";
    }
}

//    Given two strings representing two complex numbers.
//
//        You need to return a string representing their multiplication.
//        Note i2 = -1 according to the definition.
//
//        Example 1:
//        Input: "1+1i", "1+1i"
//        Output: "0+2i"
//        Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
//        Example 2:
//        Input: "1+-1i", "1+-1i"
//        Output: "0+-2i"
//        Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
//        Note:
//
//        The input strings will not have extra blank.
//        The input strings will be given in the form of a+bi,
//          where the integer a and b will both belong to the range of [-100, 100].
//         And the output should be also in this form.
