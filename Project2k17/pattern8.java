import java.util.Scanner;
public class pattern8
{ 
     static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,m=1,c,d,b;
         for(a=5;a>=1;a--)
        {
            for(b=a;b>=1;b--)
            {
                System.out.print(b);
            }
                for(c=1;c<=m;c++)
                {
                    System.out.print(" ");
            }
            for(d=1;d<=a;d++)
            {
                System.out.print(d);
            }
            m=m+2;
            System.out.println();
        }
    }
}