import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter float:");
        float numb= sc.nextFloat();
        sc.nextLine();
        System.out.print("enter line:");
        String line= sc.nextLine();
        System.out.print("enter word:");
        char ch=sc.next().charAt(5);
        System.out.println("float entered is :"+numb);
        System.out.println("string entered is :"+line);
        System.out.println(" character at nth position is:"ch);


    }
}