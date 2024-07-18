package Arrays.Hard;

import java.util.PriorityQueue;

public class Max_Value_of_Equation {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->b[0]-a[0]);

        int ans = Integer.MIN_VALUE;

        for(int i[] : points){

            while(!pq.isEmpty() && i[0]-pq.peek()[1] > k){
                pq.remove();
            }

            if(!pq.isEmpty()){
                ans = Math.max(ans,pq.peek()[0]+i[0]+i[1]);
            }
            pq.add(new int[]{i[1]-i[0],i[0]});
        }

        return ans;
    }
}
