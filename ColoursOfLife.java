/*
Colours of Life
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tono and Taro are in love with colours. There are a total of N colours that are available numbered from 1 to N. If Tono gets the i-th colour, she will distribute X[i] chocolates to the smart students of Newton School, whereas if Taro gets the i-th colour, she will distribute Y[i] chocolates to the smart students of Newton School.
Now, both of them want to maximise the value following value:
(number of chocolates distributed by me) - (number of chocolates distributed by other person)
Now you need find the following value:
(number of chocolates distributed by Tono) - (number of chocolates distributed by Taro)

Note: Both of them choose a colour one by one, and Tono gets the first turn.
Input
The first line of input contains an integer N, the total number of colours.
The next N lines contain two integers X[i] and Y[i].

Constraints
1 <= N <= 100000
1 <= X[i], Y[i] <= 10^9 (1000000000)
Output
Output a single integer, the answer to the above problem.
Example
Sample Input
3
20 10
20 20
20 30

Sample Output
20

Explanation: Tono chooses 3rd colour, then Taro chooses 2nd colour, then Tono chooses 1st colour. Therefore, answer is (20+20)-20 = 20

Sample Input
3
10 10
20 20
30 30

Sample Output
20*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static class color implements Comparable<color>{
          // Your code here
        int x;
        int y;
        int dif;
        color(int x,int y,int dif){
            this.x=x;
            this.y=y;
            this.dif=dif;
        }
        public int compareTo(color o){
            if(this.dif !=o.dif){
                return o.dif - this.dif;
            }
            return o.dif - this.dif;
        }
    }
    public static void main (String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                       int n=Integer.parseInt(br.readLine());
                       color[] arr=new color[n];

                            String[] str;
                            long sumx=0;
                            long sumy=0;
                            for(int i=0;i<n;i++){
                                str=br.readLine().split(" ");
                                int ax=Integer.parseInt(str[0]);
                                int by=Integer.parseInt(str[1]);
                                int ad=ax+by;
                                arr[i]=new color(ax,by,ad);
                                sumx+=ax;
                                sumy+=by;
 
                            }

                            Arrays.sort(arr);
                            for(int j=0;j<n;j++){
                                if(j%2==0){
                                    sumy-=arr[j].y;

                                }else{
                                    sumx-=arr[j].x;

                                }
                            }
                             
                             System.out.print(sumx-sumy);
                     
    }
}