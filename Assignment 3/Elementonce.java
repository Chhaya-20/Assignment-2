import java.util.*;

public class Elementonce {
    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = map.containsKey(a[i]) ? map.get(a[i]) : 0;
            map.put(a[i], count + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 3) {
                System.out.println("Element once repeat is " + entry.getKey());
                break;
            }

        }
        sc.close();
    }
}
