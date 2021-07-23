public class SwapTwoNumbers {

    public static void main(String[]args){
        int a=7;
        int b=9;
        System.out.println(swapNbr(a,b));
    }
    public static String swapNbr(int a,int b){
        int c=0;
         c=a;
         a=b;
         b=c;
        return "a= "+a+"\n"+"b= "+b;
    }
}
