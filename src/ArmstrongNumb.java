import java.util.Scanner;
public class ArmstrongNumb{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("ENTER NUMBER TO CHECK FOR Armstrong");
        int number = sc.nextInt();
        int real = number;// we are storing number value as number later become 0
        int sum=0;
        while(number>0){
            int remainder= number%10;
            sum= sum+(remainder*remainder*remainder);
            number=number/10;

        }
        if(sum==real){
            System.out.println("it's an armstrong number");

        }
        else System.out.println("not and armstrong number");

    }
}