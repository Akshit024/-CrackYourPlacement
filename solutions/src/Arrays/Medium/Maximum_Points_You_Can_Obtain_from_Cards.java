package Arrays.Medium;

public class Maximum_Points_You_Can_Obtain_from_Cards {
    public int maxScore(int[] c, int k) {
        int ans =0;
        int suml=0;
        int sumr=0;

        for(int i=0;i<k;i++) suml+=c[i];
        ans = suml;
        for(int i=0;i<k;i++){
            int last = c[c.length-i-1];
            suml -= c[k-i-1];
            sumr += last;
            ans = Math.max(ans,suml+sumr);
        }

        return ans;
    }
}
