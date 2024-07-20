package Mathematical.Easy;

public class Add_Binary {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        String ans = "";
        int carry=0;
        while(i>=0 || j>=0){
            int num =carry;
            if(i>=0 && a.charAt(i)=='1'){
                num++;
            }
            if(j>=0 && b.charAt(j)=='1'){
                num++;
            }
            carry=num/2;
            if(num%2==0) ans="0"+ans;
            else ans="1"+ans;
            i--;
            j--;
        }
        if(carry==1) ans="1"+ans;
        return ans;
    }
}
