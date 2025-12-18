class Solution {
    public int reverse(int x) {
        int r=0,rev=0;
        while(x!=0){
        r=x%10;
        if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
            return 0;
        }
        rev=(rev*10)+r;
        x=x/10;
        }
        return rev;

      
    }
}
