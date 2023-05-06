class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');
        int i=0 , j=s.length()-1;
        char [] chars = s.toCharArray();

        while(i<j)
        {
            while(i<j && !set.contains(chars[i])) i++;
            while(i<j && !set.contains(chars[j])) j--;

            char temp = chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}


// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&id=leetcode-75
