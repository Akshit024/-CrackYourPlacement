package String.Easy;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for(int i=0;i<=h-n;i++){
            if(needle.equals(haystack.substring(i,i+n))) return i;
        }
        return -1;
    }
}
