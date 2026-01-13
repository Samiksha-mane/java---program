import java.util.*;
public class LargestOfThreeNumbers 
{
    public static void main(String[] args)
    {
        int a,b,c;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("1st No :");
        a = sc.nextInt();
        System.out.print("2nd No :");
        b = sc.nextInt();
        System.out.print("3rd No :");
        c = sc.nextInt();

        if(a >= b && a >= c )
        {
            System.out.print("Largest no :"+a);
        }
        else if( b >= a && b >= c)
        {
            System.out.print("Largest no :"+b);
        }
        else
        {
            System.out.print("Largest no :"+c);
        }
    }

}
