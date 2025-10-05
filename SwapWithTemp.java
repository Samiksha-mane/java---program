import java.util.Scanner;
class  SwapWithTemp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a :");
        int a = sc.nextInt();

        System.out.print("Enter b :");
        int b = sc.nextInt();
        
        System.out.println("Before Swapping : a = "+a+",b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Ater Swapping : a = "+a+",b ="+b);
    }
}