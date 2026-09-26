class Solution {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toUpperCase();
        char[] string1=s.toCharArray();
        char[] string2=t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        if(s.length()==t.length())
        {
            if(Arrays.equals(string2,string1))
                return true;
        }
        return false;
    }
}