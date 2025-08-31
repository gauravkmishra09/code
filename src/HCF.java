//import java.util.Scanner;
//import java.util.*;
//public class HCF{
//public static void main(String args[]) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter number 1:");
//    int num1 = sc.nextInt();
//    System.out.println("enter number 2:");
//    int Hcf = 1;
//    int num2 = sc.nextInt();
//   for (int i = 1; i < Math.min(num1,num2); i++) //
//    for (int i=Math.min(num1,num2);i>=1;i--){
//        if (num1 % i == 0 && num2 % i == 0) {
//            Hcf = i;
//            System.out.println(i);
//            break;
//        }
//    }
//   System.out.println("your hcf is:" + Hcf);
//}
//}
import java.util.Scanner;
public class HCF{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number 1:");
        int a= sc.nextInt();
        System.out.print("enter number 2:");
        int b= sc.nextInt();
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b= b%a;
            }
        }
       if(a==0){
            System.out.println("HCF IS " + b);}
            else{
              System.out.println("HCF is "+a);
            }

    }
}