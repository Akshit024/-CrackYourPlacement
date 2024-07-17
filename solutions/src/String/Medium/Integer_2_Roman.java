package String.Medium;

import java.util.HashMap;

public class Integer_2_Roman {
    HashMap<Integer,String> map = new HashMap<>();
    String findString(int num1,int num2){
        String ans ="";
        if(num1==4) return map.get(num2)+map.get(5*num2);
        if(num1==9) return map.get(num2)+map.get(10*num2);
        if(num1>=5){
            num1=num1-5;
            ans=map.get(5*num2);
        }

        while(num1>0){
            ans+=map.get(num2);
            num1--;
        }

        return ans;
    }
    public String intToRoman(int num) {
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        String ans ="";
        int num1 =1;
        while(num>0){
            ans = findString(num%10,num1)+ans;
            num1=num1*10;
            num=num/10;
        }
        return ans;
    }
}
