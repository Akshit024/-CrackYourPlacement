package String.Medium;
import java.util.*;

public class Print_Anagrams_Together {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,List<String>> map = new HashMap<>();
        ArrayList<String> Order = new ArrayList<>();

        for(String s : string_list){

            char[] c = s.toCharArray();
            Arrays.sort(c);

            String new_s = new String(c);

            if(!map.containsKey(new_s)){
                map.put(new_s,new ArrayList<>());
                Order.add(new_s);
            }
            map.get(new_s).add(s);
        }

        List<List<String>> ans = new ArrayList<>();
        for(String s : Order){
            ans.add(map.get(s));
        }

        return ans;
    }
}
