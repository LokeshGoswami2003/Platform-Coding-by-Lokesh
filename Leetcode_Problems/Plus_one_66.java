// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

class Solution {
    public int[] plusOne(int[] digits) {
        long number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = (number * 10) + digits[i];
        }
        number = number + 1;
        String temp = Long.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        return numbers;
    }
}