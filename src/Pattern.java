import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//        System.out.println("enter number of row /column:(n*n)");
//        int num= sc.nextInt();
//
//        for (int i=0;i<num;i++){
//            for (int j=0;j<num;j++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//    }
//
//}}
//
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");

            }
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}






