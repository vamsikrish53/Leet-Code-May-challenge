// https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count = 0;
        int length = ransomNote.length();

        StringBuilder sb = new StringBuilder(magazine);
        for(int i=0; i<length; i++)
            if(sb.indexOf(String.valueOf(ransomNote.charAt(i))) >= 0) {
                sb.deleteCharAt(sb.indexOf(String.valueOf(ransomNote.charAt(i))));
                count++;
            }

        return count == length;
    }
}
