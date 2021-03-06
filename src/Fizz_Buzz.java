import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {


    public static void main(String[] args){
        Fizz_Buzz solver = new Fizz_Buzz();
        List<String> retList = solver.fizzBuzz(15);
        for (String s: retList){
            System.out.println(s);
        }
    }

    public List<String> fizzBuzz(int n) {

        List<String> retList = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 ){
                if (i % 5 == 0){
                    retList.add("FizzBuzz");
                }
                else
                    retList.add("Fizz");
            }
            else if (i % 5 == 0){
                retList.add("Buzz");
            }
            else
                retList.add(String.valueOf(i));

        }
        return retList;
    }
}


//    Write a program that outputs the string representation of numbers from 1 to n.
//
//        But for multiples of three it should output “Fizz” instead of the number and
// for the multiples of five output “Buzz”. For numbers which are multiples of both three
// and five output “FizzBuzz”.