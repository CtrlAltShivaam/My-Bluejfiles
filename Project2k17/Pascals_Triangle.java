import java.util.Scanner;
public class Pascals_Triangle
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,l,n=1;
        System.out.println("Enter the size of pascal's Triangle");
        l=sc.nextInt();//The size of pascals Triangle is entered
        for(x=0;x<l;x++)
        {
            n=1;
            for(y=l;y>x;y--)
            {
                System.out.print(" ");
            }
            for(z=0;z<=x;z++)
            {
                System.out.print(n+" ");
                n=n*(x-z)/(z+1);
            }
            System.out.println();
        }
    }
}
