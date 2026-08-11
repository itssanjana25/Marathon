class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr=new char[s.length()];
        char[] tarr=new char[t.length()];
        for(int i=0;i<s.length();i++)
        {
            sarr[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            tarr[i]=t.charAt(i);
        }
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        if(sarr.length!=tarr.length)
        {
            return false;
        }
        for(int i=0;i<t.length();i++)
        {
            if(sarr[i]!=tarr[i])
            {
                return false;
            }
        }
        return true;
    }
}
