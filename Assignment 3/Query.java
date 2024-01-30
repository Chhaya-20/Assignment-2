import java.util.*;
public class Query {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter Q");
        int Q = sc.nextInt();
        int a1=1;
       //int a2=0;
        if(Q==2)
        {
            for(int i=1;i<=N;i++)
            {
                a1 = a1 * i;
            }
            System.out.print(a1);

        }
        else
        {
           int a2 = 0;
            for(int i=1;i<=N;i++)
            {
                a2 = a2 + i;
            }
        System.out.print(a2);
        }

    }    
    
}
