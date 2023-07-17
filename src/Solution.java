public class Solution {
    // you need to treat n as an unsigned value
    // annotations using '00000000000000000000000000001011' as example
    public int hammingWeight(int n) {
        int count = 0, mask = 1; // mask is a comparative value to be used with bitwise operator '&'
        for (int i = 0; i < 4; i++) { // this appears to default to starting at the lowest place value
            if ((n & mask) != 0) { // given a grid say  // 1011
                //    1  then bitwise & operator says if both n and mask are '1'
                // then increment the count
                count++;
            }
            mask = mask << 1; // this shifts the mask to the next value place   //1011
            //  1
            // can alternatively shift n too
            // n = n >> 1; which knocks the int in the lowest value place to the right of the 'decimal'
        }
        return count;
    }
}

