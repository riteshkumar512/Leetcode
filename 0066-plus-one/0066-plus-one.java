class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i >= 0; i--){
            if(digits[i] < 9){
                digits[i]= digits[i]+1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
            int[] newArr = Arrays.copyOf(digits, digits.length + 1);
            newArr[0] = 1;    
            return newArr;
    }
}



