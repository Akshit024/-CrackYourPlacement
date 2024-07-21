import java.util.*;

public class Main {
    static void find(long arr[][], int n, long[] query, int q) {
        ArrayList<Long> list = new ArrayList<>();
        HashMap<Long, Long> map = new HashMap<>();

        int j = 0;
        long count = 0;
        for (long i[] : arr) {
            if (i[0] == 1) {
                count = count + 1L;
                map.put(count, i[1]);
            } else {
                count = count * (i[1] + 1L);
            }
            list.add(count);
        }

        for (long i : query) {
            long num = i;

            while (!map.containsKey(num)) {
                int pos = 0;
                int s = 0;
                int e = list.size() - 1;
                while (s <= e) {
                    int mid = s+ (e-s) / 2;
                    if (list.get(mid) >= num) {
                        pos = mid;
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }

                if (map.containsKey(list.get(pos))) {
                    num = list.get(pos);
                } else {
                    int prev = pos - 1;
                    if (prev < 0) {
                        break;
                    }
                    long rem = num % list.get(prev);
                    if (rem == 0L) {
                        num = list.get(prev);
                    } else {
                        num = rem;
                    }
                }
            }
            System.out.print(map.get(num) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[][] arr = new long[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
            }

            long query[] = new long[q];
            for (int i = 0; i < q; i++) {
                query[i] = sc.nextLong();
            }

            find(arr, n, query, q);
            System.out.println();
            t--;
        }
        sc.close();
    }
}
