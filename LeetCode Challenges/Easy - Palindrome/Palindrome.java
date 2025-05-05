class Palindrome {
    public boolean isPalindrome(int x) {
        if(x >=0 ){
            int num = x;
            int reversed = 0;
            while (num != 0){
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            if (reversed == x){
                return true;
            }

        }
        


        return false;
    }
}