// https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        int last_digit = num%10;
        // Math logic: If any number ends with 2,3,7 or 8 then it cannot be a perfect square
        if(last_digit == 2 || last_digit == 3 || last_digit ==7 ||  last_digit == 8)
            return false;
        
        int left = 1, right = num;
        while(left<= right) {
            long mid = left + (right-left)/2;
            long square = mid * mid;
            if(square == num)
                return true;
            else if(square > num)
                right = (int)mid-1;
            else
                left = (int)mid+1;
        }
        return false;
    }
}
