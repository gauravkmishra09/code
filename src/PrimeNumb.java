//import java.util.*;
//public class PrimeNumb {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number for cheking:");
//        int Numb = sc.nextInt();
//        int count = 0;
//        for (int i = 1; i < Numb; i++) {
//            if (Numb % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println("prime number .");
//        } else {
//            System.out.println("not a prime number .");
//        }
//    }}
import java.util.*;
public class PrimeNumb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int Number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <=Math.sqrt(Number); i++) {
            if (Number % i == 0) {
                count++;
                if (Number / i != i) {
                    count++;
                }
            }

        }
        if (count == 2) {
            System.out.println("its a prime number .");
        } else {
            System.out.println("not a prime .");
        }

    }}



