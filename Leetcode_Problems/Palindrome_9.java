// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward.

// For example, 121 is a palindrome while 123 is not.

class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int reverse=0;
        int rem;
        while(temp>0){
            rem=temp%10;
            reverse=(10*reverse)+rem;
            temp=temp/10;
        }
        if(reverse==x)
            return true;
        else
            return false;
    }
}