package Arrays.Hard;
import java.util.*;
public class Largest_Rectangle_in_Histogram {
    void Arrleft(int[] h,int[] arr){
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && h[stk.peek()] >= h[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=stk.peek();
            }
            stk.push(i);
        }
    }
    void Arrright(int[] h,int[] arr){
        Stack<Integer> stk = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.isEmpty() && h[stk.peek()] >= h[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                arr[i]=arr.length;
            }else{
                arr[i]=stk.peek();
            }
            stk.push(i);
        }
    }
    public int largestRectangleArea(int[] h) {
        int[] arrleft = new int[h.length];
        int[] arrright = new int[h.length];
        Arrleft(h,arrleft);
        Arrright(h,arrright);

        int ans =0;
        for(int i=0;i<h.length;i++){
            ans = Math.max(ans,(arrright[i]-arrleft[i]-1)*h[i]);
        }
        return ans;
    }
}
