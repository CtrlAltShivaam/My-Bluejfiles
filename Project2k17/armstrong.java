import java.util.Scanner;
public class armstrong
{ 
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,t,s=0,d,l=0;
        int a[]=new int[5];
        System.out.println("enter the no.=");
        for(x=0;x<5;x++)
        {
            a[x]=sc.nextInt();//Numbers are being printed
        }
        for(x=0;x<5;x++)
        {
            t=a[x];
            while(a[x]!=0)
            {
                d=a[x]%10;
                s=s+(d*d*d);
                a[x]=a[x]/10;
            }
            if(t==s)
            {
                if(t>l)
                {
                    l=t;
                }
            }
            s=0;
        }
        System.out.println("the no.="+l);//The largest palindrome no. is being printed
    }
}