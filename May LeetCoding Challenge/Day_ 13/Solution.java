// https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {
        // Base case
        if(k == num.length())
            return "0";
        int i=0;
        
        // Until k steps are done
        while(k > 0) {
            i = (i > 0) ? i-1 : 0;
            // Go until current digit is less than next digit 
            // Remove the current digit and start the loop from i-1
            while(i < num.length()-1 && Integer.parseInt(String.valueOf(num.charAt(i))) <= Integer.parseInt(String.valueOf(num.charAt(i+1))))
                i++;
            num = num.substring(0,i) + num.substring(i+1);
            k--; 
        }
        
        // To handle if there are any leading zeros at the begging 
        // If the leading zeros and remove those
        i=0;
        while(i < num.length() && num.charAt(i) == '0')
            i++;

        num = num.substring(i,num.length());
        
        if(num.length() == 0)
            return "0";
        
        return num;
    }
}
