//import java.util.Scanner;
//public class Divisors {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number which divisor is to be found");
//        int number = sc.nextInt();
//        for (int i=1;i<=(number/2);i++){
//            if(number%i==0){
//                System.out.print(i);
//
//
//            }
//
//        }
//        System.out.print(number);
//
//    }
//}
// this approach has O(n) complexity so we use easy O(sqrt(n)) complexity so new code will be
import java.util.Scanner;

import static java.lang.Math.sqrt;
public class Divisors{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number whose divisor is to be found:");
        int Number=sc.nextInt();
        for (int i=1;i<=Math.sqrt(Number);i++){ // factor 1=i
            if(Number%i==0) {                   // factor 2 = number/i and it should not be equal to number
                System.out.print(i + " , ");     //1*6,2*3,3*2

                if (Number / i != i) {
                    System.out.print(Number / i + " , ");
                }
            }
        }
    }

}

