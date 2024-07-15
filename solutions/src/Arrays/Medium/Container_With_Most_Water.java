package Arrays.Medium;

public class Container_With_Most_Water {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1;
        int ans=0;
        while(i<j){
            if(h[i]<=h[j]){
                ans=Math.max(ans,h[i]*(j-i));
                i++;
            }
            else{
                ans=Math.max(ans,h[j]*(j-i));
                j--;
            }
        }
        return ans;
    }
}
