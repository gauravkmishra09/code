import java.util.Scanner;
public class Pallendrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number which you have to check for pallendrome:");
        int numb=sc.nextInt();
        int yy=numb;
        int reverse=0;
        while(numb>0){
            int remainder= numb%10;
            reverse= reverse*10+remainder;
            numb= numb/10;

        }
        System.out.println(reverse);
        if(reverse== yy){
            System.out.println("you have entered a pallendrome number");
        }
        else{
            System.out.println("not a pallendrome ");
        }



    }
}
