import java.util.Scanner;
public class Circular_Prime
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,a,k,f,r,n,y,j=0,c=0;
        double d;
        System.out.println("Enter the no. for circular prime check");
        a=sc.nextInt();
        n=a;
        while(a!=0)
        {
            a=a/10;
            c=c+1;
        }
        for(x=1;x<=c;x++)
        {
            k=0;
            d=Math.pow(10,c-1);
            f=n/(int)d;
            r=n%(int)d;
            n=(r*10)+f;
            for(y=1;y<=n;y++)
            {
                if(n%y==0)
                {
                    k=k+1;
                }
            }
            if(k==2)
            {
                j=j+1;
                System.out.println(n);
            }
        }
        if(j==c)
        {
            System.out.println("*****Circular prime*****");
        }
        else
        {
            System.out.println("*****not a Circular prime*****");
        }
    }
}