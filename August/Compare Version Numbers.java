class Solution {
    public int compareVersion(String v1, String v2) {
        int n1 =0 ,n2=0;
        int len1 = v1.length();
        int len2= v2.length();
        int i=0,j=0;
        while(i< len1 || j< len2)
        {
            n1=0;
            n2=0;
            while(i<len1 && v1.charAt(i)!='.')
            {
                n1= n1*10+ v1.charAt(i)-'0';
                i++;
            }
            while(j<len2 && v2.charAt(j)!='.')
            {
                n2=n2*10 + v2.charAt(j)-'0';
                j++;
            }
            if(n1>n2) return 1;
            else if(n2>n1) return -1;
            else
            {
                i++;
                j++;
            }
        }
        return 0;
    }
}
