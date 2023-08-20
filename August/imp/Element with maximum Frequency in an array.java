import java.util.*;

public class lab {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");

        int n = sc.nextInt();

        int elem[] = new int[n];
        for (int i = 0; i < n; i++) {
            elem[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(elem[i], mp.getOrDefault(elem[i], 1) + 1);
        }

        int maxfreq = 0, minfreq = n;
        int maxElem = 0, minElem = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxfreq) {
                maxElem = element;
                maxfreq = count;
            }
            if (count < minfreq) {
                minElem = element;
                minfreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxElem);
        System.out.println("The lowest frequency element is: " + minElem);
    }
}
