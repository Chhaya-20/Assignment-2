import java.util.*;

public class Reverse {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        System.out.print("Enter the position ");
        int p = sc.nextInt();
        int j = n - 1;
        for (int i = (p + 1); i < j; i++) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            j--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }

}
