import java.util.Scanner;
public class Pattern6
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,a,m=4,p=65,d=1,q=68,r;
        for(x=1;x<=5;x++)
        {
            for(y=1;y<=m;y++)
            {
                System.out.print(" ");
            }
            for(z=1;z<=x;z++)
            {
                System.out.print((char)p);
            }
            for(a=x-1;a>=1;a--)
            {
                System.out.print((char)p);
            }
            p=p+1;
            m=m-1;
            System.out.println();//For the change in line
        }
        for(x=5;x>=1;x--)
        {
            for(y=1;y>=d;y--)
            {
                System.out.print(" ");
            }
            for(a=x-1;a>=1;a--)
            {
                System.out.print((char)q);
            }
            for(r=x-2;r>=1;r--)
            {
                System.out.print((char)q);
            }
            d=d-1;
            q=q-1;
            System.out.println();//For the change in line
        }
    }
}