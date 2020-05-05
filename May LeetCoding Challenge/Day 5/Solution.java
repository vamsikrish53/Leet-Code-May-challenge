// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        
        for(char c : s.toCharArray()) {
            chars[c - 97]++;
        }
        
        for(char c : s.toCharArray()) {
            if(chars[c-97] == 1)
                return s.indexOf(c);
        }
    return -1;
    }
}
