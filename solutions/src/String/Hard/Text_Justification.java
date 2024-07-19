package String.Hard;
import java.util.*;

public class Text_Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<words.length){
            int len = words[i].length();
            int space =0;
            int last = i+1;

            while(last<words.length && len+space+1+words[last].length() <= maxWidth){
                space++;
                len += words[last].length();
                last++;
            }
            StringBuilder sb = new StringBuilder();
            int rem = maxWidth-len;
            if(last == words.length || last == i + 1){
                for(int j = i;j<last;j++){
                    sb.append(words[j]);
                    if(rem > 0){
                        sb.append(" ");
                        rem--;
                    }
                }
                for(int j=0;j<rem;j++){
                    sb.append(" ");
                }
            }else{
                int no_of_word = last - i - 1;
                space = rem;

                int xtra =  space%no_of_word;
                space = space/no_of_word;

                for(int j=i;j<last-1;j++){
                    sb.append(words[j]);
                    if(xtra>0){
                        xtra--;
                        sb.append(" ");
                    }

                    for(int k=0;k<space;k++){
                        sb.append(" ");
                    }
                }
                sb.append(words[last-1]);
            }
            ans.add(sb.toString());
            i=last;
        }

        return ans;
    }
}
