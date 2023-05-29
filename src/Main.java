/* Write a function that takes the binary representation of an integer and returns the
number of '1' bits it has (also known as the Hamming weight)

 */

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(00000000000000000000000010000000));

    }


    // other option, use remainder modulus and /10 each time using while loop and increment count
    public static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                int last_bit = n & 1; //Stores the value of the last bit of the number n i.e.(1 or 0)
                count += last_bit; // adds 0 if last bit is 0 and adds 1 if last bit is 1
                n = n >>> 1;  //Dropping the last bit of the binary number n
            }
            return count;
        }
    }
}




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
