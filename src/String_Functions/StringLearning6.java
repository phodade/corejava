package String_Functions;

public class StringLearning6 {
	public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }
  public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}

