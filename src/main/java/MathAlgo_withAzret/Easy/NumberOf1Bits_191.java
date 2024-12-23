package MathAlgo_withAzret.Easy;

public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        System.out.println("(v1-2) -> " +hammingWeight(12) + " - BitWise: " + bitWise(12));
        System.out.println("(v3) -> " + hammingWeightBrianKernighansAlgo(12) + " - BitWise: " + bitWiseBuildInMethod(12));

//        System.out.println(hammingWeight(29) + " - BitWise: " + bitWise(29));
//        System.out.println(hammingWeight(11) + " - BitWise: " + bitWise(11));
//        System.out.println(hammingWeight(128) + " - BitWise: " + bitWise(128));
//        System.out.println(hammingWeight(2147483645) + " - BitWise: " + bitWise(2147483645));
    }

    //v3
    public static int hammingWeightBrianKernighansAlgo(int n){
        int hammingWeight = 0;

        while (n != 0){
            n = n & ( n - 1);
            hammingWeight++;
        }
        return hammingWeight;
    }

    //v1-2
    //Time Complexity: O(log n)
    //Memory Complexity: O(1)
    //Time Took: 15 minutes by myself
    public static int hammingWeight(int n) {
        int result = 0;

        while (n != 0) {
            result += (n % 2);
            n = n / 2;
        }
        return result;
    }

    //v3 - is better due to Build-In methods are more preferable due to better performance
    //and already being tested and optimized for all cases (edge cases including)
    //Time Complexity: O(log n)
    //Memory Complexity: O(log n)
    //AI suggestion
    public static String bitWiseBuildInMethod(int n){
        return Integer.toBinaryString(n);
    }

    //v1-2
    //Time Complexity: O(log n)
    //Memory Complexity: O(log n)
    //Time Took: 10 minutes by myself
    public static String bitWise(int n){
        StringBuilder result = new StringBuilder();
        while(n != 0){
            result.append(n % 2);
            n = n / 2;
        }
        return result.reverse().toString();
    }
}
