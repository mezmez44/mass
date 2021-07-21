import java.util.Scanner;
public class PrintInteger {
    public static void main(String[]args){

        enterPrint();

    }
    public static void enterPrint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num =sc.nextInt();
        System.out.println("the number entered is :"+num);

    }
}
