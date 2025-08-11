import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your grade in capital:");
        char ch= sc.next().charAt(0);
        switch (ch){
            case 'A':
                System.out.println("goood marks");
                break;
            case 'B':
                System.out.println("try better");
                break;
            default:
                System.out.println("enter valid grade");
        }

    }
}
