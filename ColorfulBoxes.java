/*
Colorful Boxes
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N boxes and ci denotes the colour of the i- th box (1<=i<=N)

From this row, Bob can choose K consecutive boxes and get them. But Bob wants to get the maximum possible distinct colours of boxes.

Print the maximum possible number of distinct colours in the boxes he gets.
Input
The first line contains two integers, N and K.
The second line contains N integers c1, c2 ... cN.

Constraints
1 ≤ K ≤ N ≤ 3×10^5
1 ≤ ci ≤ 10^9
All values in input are integers.
Output
Print the maximum possible number of distinct colours in boxes Bob gets.
Example
Sample Input 1
7 3
1 2 1 2 3 3 1

Sample Output 1
3
If Bob gets the 3- rd through 5- th Boxes, they will have 3 distinct colors, which is the maximum possible number.

Sample Input 2
5 5
4 4 4 4 4

Sample Output 2
1
Bob can get all of these boxes, but they are in a single color.

Sample Input 3
10 6
304621362 506696497 304621362 506696497 834022578 304621362 414720753 304621362 304621362 414720753*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), k = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(s[i]);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k; ++i) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
    //  Sliding window 
        int l = 0, r = k - 1;
        int max = hm.size();
        while (r < n - 1) {
            if (hm.get(arr[l]) == 1) {
                hm.remove(arr[l]);
            } else {
                hm.put(arr[l], hm.get(arr[l]) - 1);
            }
            ++l;
            ++r;
            hm.put(arr[r], hm.getOrDefault(arr[r], 0) + 1);
            max = Math.max(max, hm.size());
        }
        System.out.println(max);
    }
}