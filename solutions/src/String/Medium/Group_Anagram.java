package String.Medium;
import java.util.*;
public class Group_Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char tempArray[]=s.toCharArray();
            Arrays.sort(tempArray);
            String str=String.valueOf(tempArray);
            if(!map.containsKey(str))
            {
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
        List<List<String>> llst = new ArrayList<>();

        for(String s:map.keySet())
        {
            llst.add(map.get(s));
        }
        return llst;

    }
}
