import java.util.Scanner;
public class largest_Palindrome
{ 
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,m,rev=0,d,l=0;
        int a[]=new int [5];
        System.out.println("enter the no.=");
        for(x=0;x<5;x++)
        {
            a[x]=sc.nextInt();//The no. is being entered
        } 
        for(x=0;x<5;x++)
        {
            m=a[x];
            while(a[x]!=0)
            {
                d=a[x]%10;
                rev=rev*10+d;
                a[x]=a[x]/10;
            }
            if(rev==m)
            {
                if(l<rev)
                {
                    l=rev;
                }
            }
            d=0;
            rev=0;
        }
        System.out.println("the no.="+l);//The Largest no. is being printed
    }
}
