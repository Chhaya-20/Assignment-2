import java.util.*;
public class Uniqueno {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int ans = 0;
    for(int i=0;i<n;i++)
    {
        ans = ans ^ a[i];
    }
    System.out.println("Unique no. is "+ ans);
}
}
