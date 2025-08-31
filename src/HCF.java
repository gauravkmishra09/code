import java.util.Scanner;
import java.util.*;
public class HCF{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number 1:");
    int num1 = sc.nextInt();
    System.out.println("enter number 2:");
    int Hcf = 1;
    int num2 = sc.nextInt();
    for (int i = 1; i < num1; i++) {
        if (num1 % i == 0 && num2 % i == 0) {
            Hcf = i;

        }
    }
    System.out.println("your hcf is:" + Hcf);
}
}
