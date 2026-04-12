package String;

public class MostFrequent {
    public static void main(String[] args) {
        String str = "programming";

        int[] freq = new int[256];

        // count frequency
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int max = 0;
        char result = ' ';
        for(int i = 0; i < 256; i++) {
            if(freq[i] > max) {
                max = freq[i];
                result = (char)i;
            }
        }

        System.out.println("Most Frequent Character " + result);
        System.out.println("Frequency " + max);
    }
}
