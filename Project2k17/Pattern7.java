import java.util.Scanner;
public class Pattern7
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x,y,p=69;
        for(x=1;x<=5;x++)
        {
            for(y=1;y<=6;y++)
            {
                if(y<=x)
                {
                    System.out.print(y);
                }
                else
                {
                    System.out.print((char)p);
                }
            }
            p=p-1;
            System.out.println();
        }
    }
}