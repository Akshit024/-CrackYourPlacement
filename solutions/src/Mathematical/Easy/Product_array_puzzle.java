package Mathematical.Easy;

public class Product_array_puzzle {
    public static long[] productExceptSelf(int nums[], int n)
    {
        int n0 =0;
        int pos=-1;
        long product=1;
        long[] m =new long[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                n0++;
                pos=i;
            }else{
                product*=nums[i];
            }
            m[i]=0;
        }
        if(n0==1){
            m[pos]=product;
        }else if(n0==0){
            for(int i=0;i<n;i++){
                m[i]=product/nums[i];
            }
        }
        return m;
        // code here
    }
}
