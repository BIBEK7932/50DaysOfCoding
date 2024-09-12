package Day002;

import java.util.*;

public class UnionOfTwoArray {

    public static ArrayList<Integer> findUnionOptimalSol(int arr1[], int arr2[], int n, int m) {
        int union[] = new int[m + n];
        int i, j, k;
        i = j = k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (k == 0) {
                    union[k++] = arr1[i];
                } else if (union[k - 1] != arr1[i]) {
                    union[k++] = arr1[i];

                }
                i++;
            } else {
                if (k == 0) {
                    union[k++] = arr2[j];
                } else if (union[k - 1] != arr2[j]) {
                    union[k++] = arr2[j];

                }
                j++;
            }
        }
        while (i < n) {
            if (union[k - 1] != arr1[i]) {
                union[k++] = arr1[i];

            }
            i++;
        }
        while (j < m) {
            if (union[k - 1] != arr2[j]) {
                union[k++] = arr2[j];

            }
            j++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int a = 0; a < k; a++) {
            res.add(union[a]);
        }
        return res;
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            hs.add(arr2[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            int d = it.next();
            res.add(d);
        }
        Collections.sort(res);
        return res;
    }
}
