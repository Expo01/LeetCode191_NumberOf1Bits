/* Write a function that takes the binary representation of an integer and returns the
number of '1' bits it has (also known as the Hamming weight)

 */

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(00000000000000000000000000001011));

    }
}


// OF CPURSE IT CANT BE THIS EASY
//class Solution {
//    public int hammingWeight(int n) {
//        String s = Integer.toString(n);
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '1') {
//                count++;
//            }
//        }
//        return count;
//    }
//}









/*  NICE TRY BUT NOPE. == DOESN'T WORK AND NEITHER DOES .EQUALS
  public int hammingWeight(int n) {
            int count = 0;
            String intAsString = Integer.toString(n);
            char[] myCharArray = intAsString.toCharArray();
            for (char c : myCharArray) {
                if (c == 1) {
                    count++;
                }
            }

            return count;
        }


        ALSO DOES NOT WORK BECAUSE CAN'T DIVIDE OCTAHEDRAL BY 10. OCTAHEDRAL AUTOMATICALLY CONVERTED TO THE VALUE IT
        REPRESENTS AT RUN TIME
     public int hammingWeight(int n) {
            int count = 0;
            while (n > 0) {
                if (n % 10 != 0) {
                    count++;
                }
                n = n / 10;
            }
            return count;
        }




        public int hammingWeight(int n) {
            String intAsString = Integer.toString(n);
            while (intAsString.indexOf("0")==0)
                intAsString = intAsString.substring(1);
            System.out.println(intAsString);
            int leadingZerosRemoved = Integer.parseInt(intAsString);
            return leadingZerosRemoved;
        // was going to convert int to string, remove leading zeros, convert back to int then use while loop
            // but this still converts to octahedral even after removing leading zeros. going to look at solutions....
        }

 */
