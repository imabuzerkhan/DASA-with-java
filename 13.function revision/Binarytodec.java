public class Binarytodec {

    public static void BinToDec(int BinNum) {
        int pow = 0;
        int dec = 0;

        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            dec = dec + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            BinNum /= 10;
        }

        System.out.println(dec); // Print the decimal equivalent
    }

    public static void main(String args[]) {
        BinToDec(111); // Test with a binary number
    }
}
