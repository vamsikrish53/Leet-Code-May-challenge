// https://leetcode.com/problems/number-complement/

class Solution {
    public int findComplement(int num) {
        if(num == 0)
            return 1;
        
        int num_bits = (int) (Math.log(num)/Math.log(2)) + 1;
        int mask = (1 << num_bits) - 1;
        
        return mask^num;
    }
}
